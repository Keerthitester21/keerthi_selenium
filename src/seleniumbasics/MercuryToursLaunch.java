package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryToursLaunch {
	private static By linkText;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		By mercuryRegisterlink = By.linkText("REGISTER");
		WebElement Registerlink = driver.findElement(mercuryRegisterlink);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(2000);
		By FirstNameele = By.name("firstName");
		WebElement FirstnameEle = driver.findElement(FirstNameele);
		FirstnameEle.sendKeys("keerthi sri");
		Thread.sleep(2000);
		By LastNameEle = By.name("lastName");
		WebElement LastNameElement = driver.findElement(LastNameEle);
		LastNameElement.sendKeys("Sadhurla");
		Thread.sleep(3000);
		By Phone = By.name("phone");
		WebElement PhoneNum = driver.findElement(Phone);
		PhoneNum.sendKeys("9703847468");
		Thread.sleep(2000);
		By Username = By.name("userName");
		WebElement UsernameEle = driver.findElement(Username);
		UsernameEle.sendKeys("sadhurla.keerthi@gmail.com");
		Thread.sleep(3000);
		By addr = By.name("address1");
		WebElement Address1 = driver.findElement(addr);
		Address1.sendKeys("Gulmohur Park Colony");
		Thread.sleep(2000);
		By addr2 = By.name("address2");
		WebElement Address2 = driver.findElement(addr2);
		Address2.sendKeys("Lingampally");
		Thread.sleep(3000);
		By city = By.name("city");
		WebElement CityEle = driver.findElement(city);
		CityEle.sendKeys("Hyderabad");
		Thread.sleep(2000);
		By state = By.name("state");
		WebElement StateEle = driver.findElement(state);
		StateEle.sendKeys("TELANGANA");
		Thread.sleep(2000);
		By pincode = By.name("postalCode");
		WebElement PostalCodeEle = driver.findElement(pincode);
		PostalCodeEle.sendKeys("500019");
		Thread.sleep(3000);
		By country = By.name("country");
		WebElement CountryName = driver.findElement(country);
		CountryName.sendKeys("INDIA");
		Thread.sleep(2000);
		By email = By.name("email");
		WebElement EmailIDEle = driver.findElement(email);
		EmailIDEle.sendKeys("sadhurla.keerthi@gmail.com");
		Thread.sleep(3000);
		By password = By.name("password");
		WebElement PwdEle = driver.findElement(password);
		PwdEle.sendKeys("a123b4567");
		Thread.sleep(2000);
		By ConfirmPassword = By.name("confirmPassword");
		WebElement ConfirmPwd = driver.findElement(ConfirmPassword);
		ConfirmPwd.sendKeys("a123b4567");
		Thread.sleep(2000);
		By submit = By.name("register");
		WebElement SubmitBtn = driver.findElement(submit);
		SubmitBtn.click();
		Thread.sleep(3000);
		driver.close();

	}
}
