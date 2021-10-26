package testCases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchWindow {

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
		
		//Store and print the name of the first window
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		
		//Click on the button New window
		driver.findElement(By.id("windowButton")).click();
		
		//Store and print the name of all the windows open
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		
		//Pass a window handle to other window
		for (String handle1 : driver.getWindowHandles()) {
		driver.switchTo().window(handle1);
		System.out.println(handle1);
		}
		
		String message = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(message);
		
		driver.quit();

	}

}
