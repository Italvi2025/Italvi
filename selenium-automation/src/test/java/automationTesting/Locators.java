package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
//static WebDriver driver ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//
//		// 1. By.id
//		driver.findElement(By.id("input-firstname")).sendKeys("User1");
//
//		// 2. By.name
//		driver.findElement(By.name("lastname")).sendKeys("Test");
//
//		// 3. By.xpath
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("User1@gmail.com");
//
//		// 4. By.class
//		driver.findElement(By.className("form-control")).sendKeys("321456789");
//
//		// By.linktext
//		// driver.findElement(By.linkText(null))
//		 driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
		 

		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");
		By emailid = By.name("email");
		By telephone = By.name("telephone");
		By password = By.xpath("//*[@id=\"input-password\"]");
		By confirmpassword = By.cssSelector("#input-confirm");
		By agree = By.name("agree");
		By tagname = By.tagName("h1");

		ElementUtil elemutil = new ElementUtil(driver);
		
		elemutil.dosendkeys(firstname,"Test");
		elemutil.dosendkeys(lastname,"User2");
		elemutil.dosendkeys(emailid,"Tu2mail.com");
		elemutil.dosendkeys(telephone,"123456789");
		elemutil.dosendkeys(password, "Tu2025");
		elemutil.dosendkeys(confirmpassword, "Tu2025");
		elemutil.doclick(agree);
		elemutil.doGetText(tagname);
//		doGetText(tagname);
		
		
		
		
		
		
		
		
		

	}
//	public static WebElement getelement( By locator) {
//		return driver.findElement(locator);
//		
//	}
//	
//	
//	public static String doGetText(By locator) {
//		 String text = getelement(locator).getText();
//		 System.out.println(text);
//		 return text;
		
		
	}



//"By" is a class for locators id, name, class are the attributes, xpath (DOM address- dom is a document object model), css selector (cascaded style sheet)
// 8 types of locators