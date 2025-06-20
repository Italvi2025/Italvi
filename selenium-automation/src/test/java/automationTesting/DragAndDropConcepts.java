package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcepts {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0); //switch to frame only if it is present
		
		Actions action = new Actions (driver);
		
		action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]/p")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]")))
		.release()
		.build()
		.perform();



	}

}
