import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {

		// Invoking Browser
		// Chrome - ChromeDriver->Methods close get
		// Firefox - FirefoxDriver->Methods close get
		// Safari - SafariDriver->Methods close get
		// WebDriver close get
		// WebDriver methods + class methods

		// chromedriver.exe->Chrome browser
		// webdriver.chrome.driver->value of path

		// SeleniumManager (Beta phase)

		// Chrome Launch
		// System.setProperty("webdriver.chrome.driver",
		// "D:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Firefox Launch
		// geckodriver
		// webdriver.gecko.driver
//		System.setProperty("webdriver.gecko.driver", "D:\\Tools\\drivers\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();

		// Micrsoft Edge
		System.setProperty("webdriver.edge.driver", "D:\\Tools\\drivers\\msedgedriver.exe");
		WebDriver driver2 = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
		// close()-close current window only
		// quit()-close all the windows

	}

}
