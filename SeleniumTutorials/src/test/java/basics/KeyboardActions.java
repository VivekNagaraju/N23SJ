package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		// 1. Launch Chrome Browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);

		// 2. Navigate to testing site
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// 3. Invoking Actions class object
		Actions actions = new Actions(driver);
		
		// 4. Type "vivek" in uppercase in name field using Shift Key
		WebElement name_txtbx = driver.findElement(By.id("name"));
		actions
		.keyDown(name_txtbx, Keys.SHIFT)
		.sendKeys("vivek")
		.keyUp(Keys.SHIFT)
		.perform();

	}

}
