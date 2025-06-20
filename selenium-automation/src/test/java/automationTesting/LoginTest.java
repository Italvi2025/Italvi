package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		WebDriver driver = new ChromeDriver();
		driver.get("https://regression2.academiaerp.com/#");
		driver.findElement(By.name("Administrator")).click();
		driver.findElement(By.id("username")).sendKeys("sysadmin");
		driver.findElement (By.id("password")).sendKeys("password");
		driver.findElement(By.id("signInBtn")).click();
		
		driver.close();
		
		
		

	}

}
