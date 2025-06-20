package automationTesting;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver ();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.findElement(By.id("input-firstname")).sendKeys("Italvi");
		driver.findElement(By.id("input-lastname")).sendKeys("123");
		driver.findElement(By.id("input-email")).sendKeys("itl@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("123456789");
		driver.findElement(By.id("input-password")).sendKeys("Italvi@25");
		driver.findElement(By.id("input-confirm")).sendKeys("Italvi@25");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.className("btn-primary")).click();
		
		
			

	}

}
