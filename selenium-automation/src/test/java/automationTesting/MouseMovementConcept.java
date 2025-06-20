package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.linkText("Components"))).build().perform();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Monitors (2)")).click();
		
		
		
	}

}
