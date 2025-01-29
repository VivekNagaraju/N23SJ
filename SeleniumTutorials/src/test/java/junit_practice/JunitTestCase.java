package junit_practice;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JunitTestCase {
	
	@Test
	public void testOrangeHrmLogin() {
		// 1. Launch Chrome Browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);

		// 2. Navigate to OrangeHRM Login Page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// 3. Enter Username
		WebElement username_txtbx = driver.findElement(By.name("username"));
		username_txtbx.sendKeys("Admin");
		
		// 4. Enter Password
		WebElement password_txtbx = driver.findElement(By.name("password"));
		password_txtbx.sendKeys("admin123");
		
		// 5. Click on Login button
		WebElement login_btn = driver.findElement(By.tagName("button"));
		login_btn.click();
		
		// 6. Validation of Dashboard page URL
		String expected_url = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index11";
		String actual_url = driver.getCurrentUrl();
		assertEquals("Login failed", expected_url, actual_url);

	}

}
