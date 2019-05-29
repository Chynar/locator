package locator;


import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowns {

	WebDriver amazon;
	
	@Before
	public void setup() {
	WebDriverManager.chromedriver().setup();
	amazon = new ChromeDriver();
	amazon.manage().window().maximize();
	amazon.manage().deleteAllCookies();
	
	}
	
	@Test
	public void amazonDropDown() throws InterruptedException {
		amazon.get("https://www.amazon.com");
		WebElement search= amazon.findElement(By.id("searchDropdownBox"));
		Select DrDown=new Select (search);
//		List <WebElement> list = DrDown.getOptions();
//		for(WebElement a:list) {
//		System.out.println(a.getText());
 
		DrDown.selectByVisibleText("Amazon Fresh");
		Thread.sleep(5000);
		DrDown.selectByIndex(6);
		Thread.sleep(5000);
		DrDown.selectByValue("search-alias=mobile");
		
	}
		
		
		
		
	//}
	@After
	public void clean(){
	}	
}
