/*
 * Framework(Code structure): Organizing the code in such a way that increases reusability and readability, 
 * decreases maintenance cost 
 */
package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeThemeChange {

	public static void main(String[] args) {
		// 1. Launch Chrome Browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);

		// 2. Navigate to testing site
		driver.get("chrome://settings/appearance");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// 3. Change theme
		// 3a. Locate the host
		// 3b. Get shadow root
		// 3c. Locate the element
		
		WebElement shadow_host_1 = driver.findElement(By.tagName("settings-ui"));
		SearchContext shadow_root_1 = shadow_host_1.getShadowRoot();
		
		WebElement shadow_host_2 = shadow_root_1.findElement(By.cssSelector("#main"));
		SearchContext shadow_root_2 = shadow_host_2.getShadowRoot();
		
		WebElement shadow_host_3 = shadow_root_2.findElement(By.cssSelector("settings-basic-page"));
		SearchContext shadow_root_3 = shadow_host_3.getShadowRoot();
		
		WebElement shadow_host_4 = shadow_root_3.findElement(By.cssSelector("#basicPage > settings-section:nth-child(19) > settings-appearance-page"));
		SearchContext shadow_root_4 = shadow_host_4.getShadowRoot();
		
		WebElement color_mode_dropdown = shadow_root_4.findElement(By.cssSelector("#colorSchemeModeSelect"));
		color_mode_dropdown.click();
		

	}

}
