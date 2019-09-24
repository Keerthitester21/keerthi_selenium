package seleniumbasics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximiseBrowser {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.com");
		Thread.sleep(3000);
		Options manage = driver.manage();
		Window window = manage.window();
		Dimension size = window.getSize();
		System.out.println("the window width is "+ size.getWidth());
		System.out.println("the window height is"+ size.getHeight());
		Point pos = window.getPosition();
		System.out.println("the window position at "+ pos.getX());
		System.out.println("the window position at "+ pos.getY());
		Thread.sleep(2000);
		window.fullscreen();
		Thread.sleep(1500);
	
		Dimension dim=new Dimension(500,600);
		window.setSize(size);
		window.setPosition(new Point(650,750));
		Thread.sleep(4000);
		driver.close();
		
		
		
		
		
		
	}

}
