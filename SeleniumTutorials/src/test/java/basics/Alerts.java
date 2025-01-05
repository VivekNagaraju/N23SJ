package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerts {

	public static void main(String[] args) {
		// 1. Launch Chrome Browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
//				driver.manage().window().maximize();

		// 2. Navigate to testing site
		driver.get("https://testautomationpractice.blogspot.com/");

		// 3. Click on simple alert
		WebElement simple_alert = driver.findElement(By.id("alertBtn"));
		simple_alert.click();

		// 4. Handling simple alert
		// Reading the text present on alert
		System.out.println(driver.switchTo().alert().getText());
		// Accepting the alert
		driver.switchTo().alert().accept();

		// 5. Click on Confirmation alert
		WebElement confirmation_alert = driver.findElement(By.id("confirmBtn"));
		confirmation_alert.click();

		// 6. Handling Confirmation alert- accept/ click on OK
		driver.switchTo().alert().accept();

		// 7. Click on Confirmation alert
		confirmation_alert.click();

		// 8. Handling Confirmation alert- dismiss/ click on cancel
		driver.switchTo().alert().dismiss();
		
		// 9. Click on Prompt Alert
		WebElement prompt_alert = driver.findElement(By.id("promptBtn"));
		prompt_alert.click();
		
		// 10. Enter text in prompt alert
		driver.switchTo().alert().sendKeys("Vivek");
		driver.switchTo().alert().accept();

	}

}
