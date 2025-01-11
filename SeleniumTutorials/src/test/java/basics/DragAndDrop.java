package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// 1. Launch Chrome Browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);

		// 2. Navigate to testing site
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// 3. Invoking Actions class object
		Actions actions = new Actions(driver);
		
		// 4. Scrolling the page
		actions.scrollByAmount(0, 1600).perform();
//		Thread.sleep(5000);
		
		// 5. Drag and drop
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
//		actions.scrollToElement(droppable).perform();
		actions.dragAndDrop(draggable, droppable).perform();

	}

}
