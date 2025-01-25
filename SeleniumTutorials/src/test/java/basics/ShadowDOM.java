package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ShadowDOM {

	public static void main(String[] args) {
		// 1. Launch Chrome Browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);

		// 2. Navigate to testing site
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// 3. Interacting with Shadow root element
		// 3a. Locate Shadow Host
		WebElement shadow_host =driver.findElement(By.id("shadow_host"));
		
		// 3b. Get shadow root
		SearchContext shadow_root = shadow_host.getShadowRoot();
		
		// 3c. Locate element inside shadow root
		WebElement shadow_root_input = shadow_root.findElement(By.cssSelector("input[type=text]:nth-child(5)"));
		
		shadow_root_input.sendKeys("Vivek");

	}

}
