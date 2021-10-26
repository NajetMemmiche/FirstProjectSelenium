package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// Open Chrome
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		// Open url Tools QA
		driver.get("http://demo.guru99.com/test/upload/");

		// Maximize Browser
		driver.manage().window().maximize();
		
		//Fable solution of the file upload demo -- SendKeys
		WebElement  uploadFile = driver.findElement(By.id("uploadfile_0"));
		uploadFile.sendKeys("E:\\01_Automatique\\01_Cours\\Sidi Bouzid.png");
		
		//Check I accept terms of service
		driver.findElement(By.id("terms")).click();
		
		//Thread Sleep
		Thread.sleep(5000);
		
		//Click Submit File
		driver.findElement(By.id("submitbutton")).click();
		
		//Storage and compare
		String message = driver.findElement(By.xpath("//*[@id=\"res\"]/center\"")).getText();
		Assert.assertTrue(message.contains ("successfully"));
		
		//Kill the browser
		driver.quit();
		
		
		
	}

}
