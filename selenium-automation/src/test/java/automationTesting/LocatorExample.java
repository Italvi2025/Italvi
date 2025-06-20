package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExample {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// Approach 1 basic
		// driver.findElement(By.id("input-email")).sendKeys("itl@gmail.com");
		// driver.findElement (By.id("input-password")).sendKeys("Italvi@25");

		// Approach 2 using webelement (generic method)
		// WebElement emailid = driver.findElement(By.id("input-email"));
		// WebElement password = driver.findElement(By.id("input-password"));

		// emailid.sendKeys("itl@gmail.com");
		// password.sendKeys("Italvi@25");

		// Approach 3 using BY Locators
		By emailid = By.id("input-email");
		By password = By.id("input-password");

		// WebElement email = driver.findElement(emailid);
		// WebElement pass = driver.findElement(password);

		// email.sendKeys("itl@gmail.com");
		// pass.sendKeys("Italvi@25");

		// Approach 4 using By Loacators + Generic Method
		getelement(emailid).sendKeys("itl@gmail.com");
		getelement(password).sendKeys("Italvi@25");

		// Approach 5 > generic method for webelement and action
		dosendkeys(emailid, "itl@gmail.com");
		dosendkeys(password, "Italvi@25");

		// Approach 5 > generic method for webelement and action via making util class
		// for this

	}

	public static WebElement getelement(By locator) {
		return driver.findElement(locator);
	}

	public static void dosendkeys(By locator, String value) {
		getelement(locator).sendKeys(value);
	}

}










//			 driver = new ChromeDriver();
//			        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//			        // create a web element + perform any action (click , sendkeys , displayed)
//			// approach 1        
////			        driver.findElement(By.id("input-email")).sendKeys("Test@gmail.com");
////			        driver.findElement(By.id("input-password")).sendKeys("test@123");
//
//			        // approch 2
////			        WebElement emailid= driver.findElement(By.id("input-email"));
////			        WebElement password = driver.findElement(By.id("input-password"));
////			        
////			        emailid.sendKeys("test@gamil.com");
////			        password.sendKeys("test@123");
////			        
////			        approch 3 BY locator 
//			        By emailid = By.id("input-email");
//			        By password = By.id("input-password");
//
////			        WebElement email_ele= driver.findElement(emailid);
////			        WebElement pass_ele= driver.findElement(password);
////			        email_ele.sendKeys("Test@gmail.com");
////			        pass_ele.sendKeys("test123");
//
//			        // approach 4 ; by loctor + generic method
//
//			        getelement(emailid).sendKeys("Test@gmail.coam");
//			        getelement(password).sendKeys("Test123");
//			        
//			        // Approach 5 > generic method for webelement and action 
//			        dosendkeys(emailid, "Test123");
//			        dosendkeys(password, "Test@gmail.com");
//			        // Approach 5 > generic method for webelement and action via making util class for this
//			        
//
//			    }
//			    public static void dosendkeys(By locator , String value) {
//			        getelement(locator).sendKeys(value);
//			        
//			    }
//			    
//
//			    public static WebElement getelement(By locator) {
//			        return driver.findElement(locator);
//
//
//	}
//
//}
