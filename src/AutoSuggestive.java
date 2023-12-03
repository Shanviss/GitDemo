import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(3000);
		// li[class='ui-menu-item'] a
		List<WebElement> options = driver.findElements(By.cssSelector("li.ui-menu-item a"));
		for (WebElement option : options) {
			if (option.getText().equals("India")) {
				option.click();
				break;
			}
		}

	}

}
