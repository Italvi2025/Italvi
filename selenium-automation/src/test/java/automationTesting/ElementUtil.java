package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

	public WebDriver driver;


	

	public ElementUtil(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void dosendkeys(By locator, String value) {
		getelement(locator).sendKeys(value);

	}

	public void doclick(By locator) {
		getelement(locator).click();
	}

	public WebElement getelement(By locator) {
		return driver.findElement(locator);

	}

	public String doGetText(By locator) {
		String text = getelement(locator).getText();
		System.out.println(text);
		return text;

	}

}
