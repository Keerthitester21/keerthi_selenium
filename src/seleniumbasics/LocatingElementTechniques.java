package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementTechniques 
{
  public static void main(String[] args) throws InterruptedException
  {
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.amazon.com");
	//.sleep(3000);
	  By idloc = By.id("a-page");
	  WebElement EmailIdEle = driver.findElement(idloc);
	  //WebElement EmailIdEle = driver.findElement(By.id("ap_email"));
	 // By nameloc = By.name("create");
	 // WebElement NameElement = driver.findElement(nameloc);
	  WebElement delivertoindiaele = driver.findElement(By.name("dropdown-selection"));
	  
	/* By GiftCardsOption = By.linkText("Gift Cards");
	  WebElement amazonGiftCards = driver.findElement(GiftCardsOption); */
	  
	 
	  WebElement ScriptElement = driver.findElement(By.partialLinkText("sign"));
	  
	  By cssSelectorLoc = By.cssSelector("span[class='nav-line-1']");
	  WebElement delivertoindiabtn = driver.findElement(cssSelectorLoc);
	  
	  By xpathLoc = By.xpath("//a[@tabindex='36']");
	  WebElement departments = driver.findElement(xpathLoc);
	  
	  By ClassnameId = By.className("nav-a");
	  List<WebElement> aClassnames = driver.findElements(ClassnameId);
	  System.out.println("the number of a letter related  Classnames are "+ aClassnames.size());
	  
	  By tagNameLoc = By.tagName("a");
	  List<WebElement> links = driver.findElements(tagNameLoc);
	  System.out.println("the number of links are "+ links.size());
	  
	   driver.close();
	  
}
}
