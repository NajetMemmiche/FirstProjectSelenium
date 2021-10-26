package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMeDynamicID {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// Open Chrome
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		// Open url Tools QA
		driver.get("http://demoqa.com/buttons");

		// Maximize Browser
		driver.manage().window().maximize();

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/button")).click();

		// Storage and compare
		String clickMeMessage = driver.findElement(By.id("dynamicClickMessage")).getText();
		Assert.assertTrue(clickMeMessage.contains("You have done a dynamic click"));
		System.out.println("Done!");

		//Close browser
		driver.quit();
	}

}
