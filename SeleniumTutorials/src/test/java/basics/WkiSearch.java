package basics;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WkiSearch {

	public static void main(String[] args) throws InterruptedException {
		// 1. Launch Chrome Browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);

		// 2. Navigate to testing site
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// 3. Search "Selenium" in Wkipedia Widget
		WebElement wiki_search_input = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		wiki_search_input.sendKeys("Selenium");
		
		WebElement search_btn = driver.findElement(By.className("wikipedia-search-button"));
		search_btn.click();
		Set<String> window_handles1 = driver.getWindowHandles();
		System.out.println(window_handles1);
		
		// 4. Click on "Selenium" from wikipedia search result
		WebElement search_result = driver.findElement(By.linkText("Selenium"));
		search_result.click();
		
		Thread.sleep(5000);
		
		// 5. Switching windows
		Set<String> window_handles2 = driver.getWindowHandles();
		System.out.println(window_handles2);
//		driver.switchTo().window(null);
		

	}

}
