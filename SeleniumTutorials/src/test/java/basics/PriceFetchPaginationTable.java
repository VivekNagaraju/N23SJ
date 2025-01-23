package basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PriceFetchPaginationTable {

	public static void main(String[] args) {
		// 1. Launch Chrome Browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);

		// 2. Navigate to testing site
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// 3. Get the rows and column size
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"productTable\"]/tbody/tr"));
		int rows_count = rows.size();
		System.out.println("rows_count:"+ rows_count);

		String expected_item_name = "Action Camera";

		// 4. Print cell values in the table
		for (int i = 1; i <= rows_count; i++) {
			WebElement name_column = driver
					.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr["+i+"]/td[2]"));
			String actual_item_name = name_column.getText();
			System.out.println("actual_item_name:"+ actual_item_name);

			if (actual_item_name.equalsIgnoreCase(expected_item_name)) {
				WebElement price = driver
						.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr["+i+"]/td[3]"));
				System.out.println(price.getText());
			}

		}

	}

}
