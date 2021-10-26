package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// Open Chrome
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		// Open url OrangeHRM
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// Maximize Browser
		driver.manage().window().maximize();
		
		//Fill Username
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		WebElement txtUsername = driver.findElement(By.id("txtUsername"));
		String attValue = txtUsername.getAttribute("id");
		System.out.println("The attribute of user name: "+attValue);
		
		txtUsername.clear();
		
		//get size of an element
		WebElement txtPassword = driver.findElement(By.id("txtPassword"));
		Dimension dimensions = txtPassword.getSize();
		System.out.println("Height: "+dimensions.height + "Width: "+dimensions.width);
		
		//get location of an element
		Point point = txtPassword.getLocation();
		System.out.println("X cordinate: "+point.x+", Y cordinate: "+point.y);
		
		
		

	}

}
