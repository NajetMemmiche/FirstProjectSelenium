package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// Open Chrome
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		// Open url Tools QA
		driver.get("https://demoqa.com/webtables");

		// Maximize Browser
		driver.manage().window().maximize();
		
		//Extract an element from a case table
		String sCellValue = driver.findElement(By.xpath("//*[contains(text(),'Vega')]")).getText();
		System.out.println("The table contains last name : "+sCellValue);
		
		driver.quit();

	}

}
