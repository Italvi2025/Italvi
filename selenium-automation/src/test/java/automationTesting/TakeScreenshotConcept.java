package automationTesting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotConcept {

	public static void main(String[] args) throws IOException {
		
		
	WebDriver driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://www.google.com/");
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("\\Users\\Italvi Tiwari\\eclipse-workspace\\selenium-automation\\src\\test\\java/google.png"));
		
		
		
		
		

	}

}















// We can take screenshot using ".getScreenshotAs" method