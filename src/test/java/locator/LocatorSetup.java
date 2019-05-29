package locator;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class LocatorSetup {
   static WebDriver driver;
  
   @Before
   public void setup() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
}
  @Test 
public void tesMyPage() {
	driver.navigate().to("https://www.zara.com/us/");
	WebElement el=driver.findElement(By.id("catalog-area"));
 
	WebElement searchBotton= driver.findElement(By.id("searchLabel"));
	searchBotton.click();
	
	
	WebElement w=driver.findElement(By.className("_searchButton"));
    w.getLocation();
 
     
   
     
     
     
     
     
     
     
     
     
     
}
}
