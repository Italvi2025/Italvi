package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test123 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://yourwebsite.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));

        usernameField.sendKeys("your_username");

        driver.quit();
    }
}



