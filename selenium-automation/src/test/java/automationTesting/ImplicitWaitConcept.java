package automationTesting;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		


	}

}
