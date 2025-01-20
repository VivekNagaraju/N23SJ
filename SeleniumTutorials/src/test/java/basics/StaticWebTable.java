package basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StaticWebTable {

	public static void main(String[] args) {
		// 1. Launch Chrome Browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);

		// 2. Navigate to testing site
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// 3. Get the rows and column size
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr"));
		int rows_count = rows.size();
		
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr[2]/td"));
		int columns_count = columns.size();
		
		// 4. Print cell values in the table
		for(int i=2; i<=rows_count; i++ ) {
			for(int j=1; j<=columns_count; j++) {
				WebElement table_cell = driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+i+"]/td["+j+"]"));
				System.out.println(table_cell.getText());
			}
			
		}
		

	}

}
