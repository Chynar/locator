package HomeWorks;

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



public class BookEbay {

	WebDriver book;
    
  @Before
   public void setup() {
	WebDriverManager.chromedriver().setup();
    book=new ChromeDriver();
    book.manage().window().maximize();
	
   }

   @Test 
public void BookTest() {
	   book.get("https://www.ebay.com/");
		WebElement SelBook=book.findElement(By.name("_nkw"));
		SelBook.sendKeys("cucumber cook book" + Keys.ENTER);
		List <WebElement> list1=book.findElements(By.xpath("//h3[@class='s-item__title']"));
		System.out.println(list1.size());
		
		
		if(list1.size()>10) {
			System.out.println("You have more than 10 books");
		}else {
			System.out.println("You have less yhen 10 ");
		}
		
		WebElement name=book.findElement(By.xpath("//h3[.='Short Stack: Cucumbers by Dawn Perry (2017, Paperback)']"));
		name.click();
		String title=book.getTitle();
		System.out.println(title);
		String expectedTitle= "Short Stack: Cucumbers by Dawn Perry (2017, Paperback) 9780997532180 | eBay";
		Assert.assertEquals(expectedTitle, title);
		
}
   @Test 
   public void price() {
	   book.get("https://www.ebay.com/");
	 		WebElement SelBook=book.findElement(By.name("_nkw"));
	 		SelBook.sendKeys("cucumber cook book" + Keys.ENTER);
	 		
//	 		if() {
//	 			
//	 		}
//	   
	   
	   
	   
	   
	   
   }









}
