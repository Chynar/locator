package locator;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {
 WebDriver amazon;
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		amazon= new ChromeDriver();
		amazon.manage().window().maximize();
		amazon.manage().deleteAllCookies();
	}
	@Test
	public void searchForItems() {
		amazon.get("https://www.amazon.com");
		WebElement searchBox=amazon.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Guitar"+ Keys.ENTER);
		
		List <WebElement> quitar = amazon.findElements(By.cssSelector("a-size-base-plus a-color-base a-text-normal"));
		Assert.assertEquals( 66, quitar.size());
	 
		
		
	}
	
	
	
	
}
