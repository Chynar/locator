package locator;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Synchronization {
 WebDriver google;
	
	@Before
	public void setup() {
	WebDriverManager.chromedriver().setup();
	google = new ChromeDriver();
	google.manage().window().maximize();
	google.manage().deleteAllCookies();
	
	}
	
	@Test
	public void amazonDropDown() throws InterruptedException {
		google.get("https://google.com");
		WebDriverWait webDriverWait= new WebDriverWait(google,10);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
		
		//ExpectedConditions.elementToBeClickable(element)
		
		
		
		Wait<WebDriver> wait= new FluentWait<WebDriver>(google).withTimeout(10, TimeUnit.SECONDS)
		.pollingEvery(2, TimeUnit.SECONDS).withMessage("Waiting for an element")
		.ignoring(NoSuchElementException.class);
		

		
		WebElement we = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@title='Search']")));
		we.click();
		
		
		
		
		
	
	
	
}
	

}
