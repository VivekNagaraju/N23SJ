package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClick {

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
		
		// 4. Double Click
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement copy_text_btn = driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
//		wait.until(c -> copy_text_btn.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(copy_text_btn));
		actions.doubleClick(copy_text_btn).perform();

	}

}
