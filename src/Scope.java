import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// 1.give me the count of the links on the page
		// 2.count of footer section

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://qaclickacademy.com/practice.php");

		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));// limiting webdriver scope
		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// 3.count of first column
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());

		// 4.cilck on each link on the column and check if the pages are opening
		for (int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) {

			String clickoninkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickoninkTab);
			Thread.sleep(5000L);
		} // open all the tabs
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
