package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// Open Chrome
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		// Open url Tools QA
		driver.get("http://demo.guru99.com/test/guru99home/");

		// Maximize Browser
		driver.manage().window().maximize();
		
		//Switching the frame by ID
		driver.switchTo().frame("a077aa5e");
		System.out.println("***We are switching to the iframe***");
		
		driver.findElement(By.xpath("html/body/a/img")).click();
		System.out.println("***We are done***");
		driver.close();
	}

}
