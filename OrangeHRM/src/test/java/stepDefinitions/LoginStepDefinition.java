package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import driverManager.WebDriverManager;
import io.cucumber.java.en.*;
import pageObjects.LoginPage;

public class LoginStepDefinition {
	
//	WebDriver driver;
	
	LoginPage loginPage;
	WebDriver driver = WebDriverManager.getDriver();
	
	/*
	 * @Given("chrome browser is launched") 
	 * public void chrome_browser_is_launched()
	 * { 
	 * ChromeOptions options = new ChromeOptions();
	 * options.addArguments("start-maximized"); 
	 * driver = new ChromeDriver(options);
	 * 
	 * }
	 */
	
	@Given("user navigated to OrangeHRM Login page")
	public void user_navigated_to_orange_hrm_login_page() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@When("user enters Username")
	public void user_enters_username() {
//		WebElement username_txtbx = driver.findElement(By.name("username"));
//		username_txtbx.sendKeys("Admin");
		loginPage = new LoginPage(driver);
		loginPage.enterUserName("Admin");
	}
	
	@When("user enters Password")
	public void user_enters_password() {
//		WebElement password_txtbx = driver.findElement(By.name("password"));
//		password_txtbx.sendKeys("admin123");
		loginPage.enterPassword("admin123");
	}
	
	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
//		WebElement login_btn = driver.findElement(By.tagName("button"));
//		login_btn.click();
		loginPage.clickOnLogin();
	}
	
	@Then("user should able to see Dashboard URL")
	public void user_should_able_to_see_dashboard_url() {
		String expected_url = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String actual_url = driver.getCurrentUrl();
		assertEquals("Login failed", expected_url, actual_url);
		
	}
	
	@When("user enters Username {string}")
	public void user_enters_username(String username) {
//		WebElement username_txtbx = driver.findElement(By.name("username"));
//		username_txtbx.sendKeys(username);
		loginPage.enterUserName(username);
	}
	
	@When("user enters Password {string}")
	public void user_enters_password(String password) {
//		WebElement password_txtbx = driver.findElement(By.name("password"));
//		password_txtbx.sendKeys(password);
		loginPage.enterPassword(password);
	}

}
