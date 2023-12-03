import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");

		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
		// second checkbox //*[@id='checkbox-example']/fieldset/label[2]/input

		checkbox.click();
		String label = checkbox.getAttribute("value");
		// System.out.println(label);
		WebElement dropdown = driver.findElement(By.cssSelector("Select#dropdown-class-example"));
		Select select = new Select(dropdown);
		select.selectByValue(label);
		driver.findElement(By.cssSelector("input#name")).sendKeys(label);
		driver.findElement(By.id("alertbtn")).click();
		String alert = driver.switchTo().alert().getText();
		if (alert.contains(label)) {
			System.out.println(label + " selected in step2 is contained in alert text");
		}
		driver.switchTo().alert().dismiss();
	}

}
