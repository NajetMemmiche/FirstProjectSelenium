package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// Open Chrome
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		// Open url Tools QA
		driver.get("https://demoqa.com/select-menu");

		// Maximize Browser
		driver.manage().window().maximize();
		
		//To perform a scroll on application using selenium
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 500)", "");
		
		//Retrieve DropDown List
		Select se = new Select (driver.findElement(By.id("oldSelectMenu")));
		//se.selectByIndex(3);
		//se.selectByValue("5");
		se.selectByVisibleText("Black");
		
		Select carsSelect = new Select (driver.findElement(By.id("cars")));
		if (carsSelect.isMultiple()) {
			carsSelect.selectByIndex(1);
			carsSelect.selectByIndex(2);
		}
		
		

	}

}
