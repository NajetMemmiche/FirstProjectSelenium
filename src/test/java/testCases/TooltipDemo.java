package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TooltipDemo {

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
		
		//Detect Tooltip
		WebElement tooltipText = driver.findElement(By.id("toolTipButton"));
		String textTooltip = tooltipText.getText();
		if (textTooltip.equalsIgnoreCase("Hover me to see")) {
			System.out.println("Pass : tooltip matchs the expected value");
		} else {
			System.out.println("Fail : tooltip doesn't match the expected value");
		}
		
		//Detect placeHolder
		WebElement placeHolder = driver.findElement(By.id("toolTipTextField"));
		String textPlaceHolder = placeHolder.getAttribute("placeholder");
		System.out.println("PlaceHolder is" + textPlaceHolder);
		
		driver.quit();

	}

}
