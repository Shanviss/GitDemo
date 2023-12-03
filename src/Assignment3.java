import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input#password")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='user']/following-sibling::span")).click();
		WebElement dropdown = driver.findElement(By.cssSelector("select[class='form-control']"));
		Select select = new Select(dropdown);
		select.selectByValue("teach");
		driver.findElement(By.cssSelector("input#terms")).click();
		driver.findElement(By.cssSelector("input#signInBtn")).click();

		List<WebElement> itemList = driver.findElements(By.xpath("//button[text()='Add ']"));
		for (int i = 0; i < itemList.size(); i++) {
			itemList.get(i).click();
		}
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();

	}

}
