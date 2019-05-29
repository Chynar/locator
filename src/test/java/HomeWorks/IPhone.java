package HomeWorks;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IPhone {
	
	WebDriver phone;
	
	@Before
	public void setup() {
	WebDriverManager.chromedriver().setup();
	phone = new ChromeDriver();
	phone.manage().window().maximize();
	} 
	
	@Test
	public void testPhone() throws InterruptedException{
	
		phone.get("https://www.amazon.com");
		Thread.sleep(2000);
		phone.findElement(By.id("nav-link-accountList")).click();
		Thread.sleep(2000);
		phone.findElement(By.id("ap_email")).sendKeys("kaniismilee@gmail.com");
		Thread.sleep(2000);
		phone.findElement(By.id("ap_password")).sendKeys("idontgivea");
		Thread.sleep(2000);
		phone.findElement(By.id("signInSubmit")).click();
		
		
		phone.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone" + Keys.ENTER);
		
		WebElement iphone1= phone.findElement(By.xpath("//div[@data-asin='B07K97BQDF']//span[@class='a-price-whole']"));
		WebElement f1=phone.findElement(By.xpath("//div[@data-asin='B07K97BQDF']//span[@class='a-price-fraction']"));
	    System.out.println(iphone1.getText() + "." + f1.getText());
	   
		
	    WebElement iphone2=phone.findElement(By.xpath("//div[@data-asin='B07K8L56DR']//span[@class='a-price-whole'] "));
	    WebElement f2=phone.findElement(By.xpath("//div[@data-asin='B07K8L56DR']//span[@class='a-price-fraction'] "));
		System.out.println(iphone2.getText()+ "." + f2.getText());
		
		WebElement iphone3=phone.findElement(By.xpath("//div[@data-asin='B014Z8HDWU']//span[@class='a-price-whole'] "));
		WebElement f3=phone.findElement(By.xpath("//div[@data-asin='B014Z8HDWU']//span[@class='a-price-fraction'] "));

		System.out.println(iphone3.getText() + "." +f3.getText());
		
		WebElement iphone4=phone.findElement(By.xpath("//div[@data-asin='B01NCYY6OK']//span[@class='a-price-whole'] "));
		WebElement f4=phone.findElement(By.xpath("//div[@data-asin='B01NCYY6OK']//span[@class='a-price-fraction'] "));
		System.out.println(iphone4.getText() + "." + f4.getText());
		
	   WebElement iphone5=phone.findElement(By.xpath("//div[@data-asin='B00YD547Q6']//span[@class='a-price-whole'] "));
	   WebElement f5=phone.findElement(By.xpath("//div[@data-asin='B00YD547Q6']//span[@class='a-price-fraction'] ")) ;
		System.out.println(iphone5.getText() + "."+ f5.getText());
	
		WebElement iphone6=phone.findElement(By.xpath("//div[@data-asin='B01N25DJ2B']//span[@class='a-price-whole'] "));
		WebElement f6=phone.findElement(By.xpath("//div[@data-asin='B01N25DJ2B']//span[@class='a-price-fraction'] "));
		System.out.println(iphone6.getText() + "."+ f6.getText());
	 
		
		
	
	}
}
