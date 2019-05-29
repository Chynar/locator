package locator;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MacBook {
 WebDriver mac;

@Before
public void setup() {

	WebDriverManager.chromedriver().setup();
	mac = new ChromeDriver();
	mac.manage().window().maximize();
}
	@Test
	public void TestMac() {
		mac.get("https://www.amazon.com");
		WebElement MP = mac.findElement(By.id("twotabsearchtextbox"));
		MP.sendKeys("MacBookPro" +Keys.ENTER);
		WebElement m1=mac.findElement(By.xpath(""));
		System.out.println(m1.getText());
		
		
		
	}
	
}
