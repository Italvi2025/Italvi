package automationTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver ();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//get the total count of links on the page
		//get the text of each link on the page
		
		List <WebElement> linkList =driver.findElements(By.tagName("a"));
		
		//size of linklist
		System.out.println(linkList.size());
		
		for(int i=0; i<linkList.size(); i++) {
			String linkText = linkList.get(i).getText();
			System.out.println(linkText);
			
		}
		
		}
				
				
		
		

	}


