package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// Open Chrome
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		// Open url Tools QA
		driver.get("https://demoqa.com/droppable/");

		// Maximize Browser
		driver.manage().window().maximize();

		// Perform the drag and drop action
		Actions actions = new Actions(driver);
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(from, to).perform();

		// Verify text changed into Dropped!
		String textTo = to.getText();
		if (textTo.equals("Dropped!")) {
			System.out.println("Pass: source is dropped to target as expected");
		} else {
			System.out.println("Fail: source couldn't be dropped to target as expected");
		}

	}

}
