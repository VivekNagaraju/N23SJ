package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) {
		// 1. Launch Chrome Browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);

		// 2. Navigate to testing site
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// 3. Invoking Actions class object
		Actions actions = new Actions(driver);
		
		// 4. Context click
		WebElement right_click_btn = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		actions.contextClick(right_click_btn).perform();

	}

}
