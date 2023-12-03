import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,400)");

		List<WebElement> prices = driver.findElements(By.cssSelector("table[name='courses'] td:nth-child(3)"));
		for (int i = 0; i < prices.size(); i++) {
			System.out.println(prices.get(i).getText());
		}

		List<WebElement> row2 = driver.findElements(By.cssSelector("table[name='courses'] tr:nth-child(3) td"));
		for (int i = 0; i < row2.size(); i++) {
			System.out.println(row2.get(i).getText());

		}

	}

}
