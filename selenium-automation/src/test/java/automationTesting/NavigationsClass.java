package automationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationsClass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//back and forward button simulation
		//.get and .navigate to both is used to launch URL but .navigate (is used to launch some external URL) is used to move from one URL to some another URL 
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		
		
		
		
		
		
		
		
	}

}
