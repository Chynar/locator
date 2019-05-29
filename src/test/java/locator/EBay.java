package locator;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.crypto.Mac;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EBay {

	WebDriver Ebay;
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		Ebay=new ChromeDriver();
		Ebay.manage().window().maximize();
		
	}
	@Test
	public void EbayTest() {
		Ebay.get("https://www.ebay.com/");
		WebElement book= Ebay.findElement(By.name("_nkw"));
		book.sendKeys("Selenium tools book" + Keys.ENTER);
    	
		List <WebElement > AllBooks = Ebay.findElements(By.xpath("//h3[@class='s-item__title']"));
		System.out.println(AllBooks.size());
		List <WebElement > allPrice = Ebay.findElements(By.xpath("//span [@class='s-item__price']"));
       System.out.println(allPrice.size());
       
       
       Map< String,String > b1= new TreeMap<String, String>();
       
       for(int i=1;i<50;i++) {
    	  
    	  System.out.println(allPrice.get(i).getText() + ", "+  AllBooks.get(i).getText());
    
      
       
       
       }
       
       
		
	}

}
