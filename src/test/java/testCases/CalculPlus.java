package testCases;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CalculPlus {

	public WebDriver driver;
	public WebDriverWait wait;

@BeforeMethod
public void setup() {
	System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to("https://juliemr.github.io/protractor-demo/");
	driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	wait = new WebDriverWait(driver, 10);
	driver.manage().window().maximize();
}

@AfterMethod
public void tearDown() {
	driver.quit();
}

@Test
public void Calcul() throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");		
		
		// Open Chrome
		WebDriver driver = new ChromeDriver();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		
		//Open url OrangeHRM
		driver.get("https://juliemr.github.io/protractor-demo/");
		
		//Maximize Browser
		driver.manage().window().maximize();
		
		//input[@ng-model='first']
		//crowpath
		WebElement textbox1 = driver.findElement(By.xpath("//input[@ng-model='first']"));
		textbox1.sendKeys("5");
		WebElement textbox2 = driver.findElement(By.xpath("//input[@ng-model='second']"));
		textbox2.sendKeys("4");
		WebElement btn = driver.findElement(By.xpath("//button[@ng-click= 'doAddition()']"));
		btn.click();
		
		/*WebElement textbox = driver.findElement(By.xpath("//h2[@class='ng-binding']"));
		
		String resultat = textbox.getText();
		System.out.println(resultat);
		Assert.assertEquals(resultat, "9");*/

		//Kill Browser
		//driver.quit();
		
		WebElement result = driver.findElement(By.tagName("h2"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Pattern pattern = Pattern.compile("\\d+");
		wait.until(ExpectedConditions.textMatches(By.tagName("h2"), pattern));
		System.out.println("Result is: " +result.getText());
		
}
}
