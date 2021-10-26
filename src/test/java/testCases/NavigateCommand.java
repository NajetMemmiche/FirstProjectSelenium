package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// Open Chrome
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		// Open url Tools QA
		driver.get("https://demoqa.com/browser-windows");

		// Maximize Browser
		driver.manage().window().maximize();
		
		//Go back
		driver.navigate().back();
		
		//Go forward
		driver.navigate().forward();
		
		//Refresh browser
		driver.navigate().refresh();
		
		driver.quit();

	}

}
