package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NestedFrames {

	public static void main(String[] args) {
		// 1. Launch Chrome Browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);

		// 2. Navigate to testing site
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// 3. Click on "Iframe with in an Iframe"
		WebElement nested_tab = driver.findElement(By.partialLinkText("Iframe with in an Iframe"));
		nested_tab.click();
		
		// 4. Switching nested frames
		driver.switchTo().frame(1);
		WebElement iframe_title = driver.findElement(By.tagName("h5"));
		System.out.println(iframe_title.getText());
		driver.switchTo().frame(0);
		WebElement nested_iframe_title = driver.findElement(By.tagName("h5"));
		System.out.println(nested_iframe_title.getText());
		WebElement input_field = driver.findElement(By.tagName("input"));
		input_field.sendKeys("Vivek");

	}

}
