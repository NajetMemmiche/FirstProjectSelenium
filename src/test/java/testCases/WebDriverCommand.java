package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommand {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");		
		
		// Open Chrome
		WebDriver driver = new ChromeDriver();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		
		//Open url OrangeHRM
		String url = "https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		
		
		//Maximize Browser
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		int titleLength = title.length();
		System.out.println("Title of the page is: "+ title);
		System.out.println("The length of the title is: "+ titleLength);
		
		String actualURL = driver.getCurrentUrl();
		if(actualURL.equals(url)){
			System.out.println("Verification successful - The correct url is opened");
		}else {
			System.out.println("Verification failed - An incorrect url is opened");
		}
		System.out.println("Actual url is:"+actualURL);
		System.out.println("Expected URL is: "+url);
		
		String pageSource = driver.getPageSource();
		int pageSouceLength = pageSource.length();
		System.out.println("Total length of the page source is: "+pageSouceLength);
		
		
		

	}

}
