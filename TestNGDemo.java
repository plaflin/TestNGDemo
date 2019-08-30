package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	@Test
	void calcTest() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/patri/Downloads/chromedriver.exe");
		// Opening Google Browser in Google Chrome using Selenium
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("2 + 3");
		element.submit();
		
		WebElement result = driver.findElement(By.id("cwos"));
		Assert.assertEquals(result.getText(), "5");
	}
	
	

}
