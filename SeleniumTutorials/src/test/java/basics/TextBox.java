package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TextBox {

	public static void main(String[] args) {
		// 1. Launch Chrome Browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);

		// 2. Navigate to testing site
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// 3. Enter name
		// 3a. Locate name text box
		WebElement name_txtbx = driver.findElement(By.id("name"));
		
		// 3b. Enter name in name text box (Interact with the located web element)
		name_txtbx.sendKeys("vivek");

	}

}
