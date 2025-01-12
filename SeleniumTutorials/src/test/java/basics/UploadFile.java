package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UploadFile {

	public static void main(String[] args) {
		// 1. Launch Chrome Browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);

		// 2. Navigate to testing site
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// 3. Upload a file
		// 3a. Choose a file
		WebElement singleFileInput = driver.findElement(By.id("singleFileInput"));
		singleFileInput.sendKeys("C:\\Users\\admin\\Downloads\\info.txt");
		
		// 3b. Click on Upload Single File button
		WebElement upload_single__file_btn = driver.findElement(By.xpath("//*[@id=\"singleFileForm\"]/button"));
		upload_single__file_btn.click();

	}

}