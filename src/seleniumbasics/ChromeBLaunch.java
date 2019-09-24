package seleniumbasics;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class ChromeBLaunch  {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
       WebDriver cdriver = new ChromeDriver();
       cdriver.get("http://www.facebook.com");
       //cdriver.close();
      // System.setProperty("webdriver.gecko.driver", ".//drivers//geckodriver.exe");
     //  WebDriver fdriver =new FirefoxDriver();
       Thread.sleep(2000);
       cdriver.get("http://www.amazon.com");
     //  fdriver.close();
       cdriver.quit();
       
	}

}
