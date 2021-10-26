package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class KeyboardEvents {

	public static void main(String[] args) throws InterruptedException {
		// Read from executable file
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// Open Chrome
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		// Open URL orangeHRM
		driver.get("https://demoqa.com/text-box");

		// Maximize browser
		driver.manage().window().maximize();

		// Delete cookies
		driver.manage().deleteAllCookies();

		// Find webElement
		WebElement fullName = driver.findElement(By.id("userName"));
		WebElement userEmail = driver.findElement(By.id("userEmail"));
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));

		// Instantiate classe action
		Actions actions = new Actions(driver);
		actions.sendKeys(fullName, "Imen").perform();
		actions.sendKeys(userEmail, "imen.heni@gmail.com").perform();
		actions.sendKeys(currentAddress, "04 rue de Cologne Mourouj 04 Ben Arous 2074").perform();
		
		Thread.sleep(5000);

		// Copy past current address
		actions.keyDown(currentAddress, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(permanentAddress, Keys.CONTROL).perform();
		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		//Javascript executor
		WebElement submit = driver.findElement(By.id("submit"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", submit);
		

	}

}
