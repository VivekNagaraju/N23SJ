package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollingDropDown {

	public static void main(String[] args) {
		// 1. Launch Chrome Browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);

		// 2. Navigate to testing site
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// 3. Select item from Scrolling drop down
		WebElement scrolling_drop_down = driver.findElement(By.id("comboBox"));
		scrolling_drop_down.click();
		
		WebElement item_50 = driver.findElement(By.xpath("//*[@id=\"dropdown\"]/div[50]"));
		item_50.click();

	}

}
