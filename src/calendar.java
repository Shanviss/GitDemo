import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions/");
		// August 30
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1000)");

		driver.findElement(By.id("form-field-travel_comp_date")).click();

		while (!driver.findElement(By.cssSelector("span[title='Scroll to increment']")).getText().contains("April")) {
			driver.findElement(By.cssSelector("span[class='flatpickr-next-month'] svg")).click();
		}

		List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));
		// Grab common attribute//put into list and iterate
		int count = driver.findElements(By.className("flatpickr-day")).size();
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("flatpickr-day")).get(i).getText();
			if (text.equalsIgnoreCase("30")) {
				driver.findElements(By.className("flatpickr-day")).get(i).click();
				break;
			}

		}

	}

}
