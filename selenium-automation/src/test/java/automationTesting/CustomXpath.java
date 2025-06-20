package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver ();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//driver.findElement(By.xpath("//input[@class='form-control input-lg']")).sendKeys("Java");
		
		//How we will handle dynamic ID's by using the "_" along with the id name
		
		//driver.findElement(By.xpath("//input[contains(@id,'input-first')]")).sendKeys("java");
		
		//driver.findElement(By.xpath("//input[starts-with(@id ,'input-first')]")).sendKeys("New");
		
		//driver.findElement(By.xpath("//input[ends-with(@id ,'firstname')]")).sendKeys("New");
		
		
		// for links: custom xpath
		//all the links are represted by <a> html tag
		
		driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
		
		

	}

}

//Absolute xpath: not recommended
		//1. not reliable
		//2. it cause performance issues
		//3. can be change at any time in future 
		 
		//Customize xpath: recommended
		//1. very fast and syntax is ver simple
		//2. performance issue is not there
		//3. its unique and generic