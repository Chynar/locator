package locator;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import com.github.javafaker.Faker;

	import io.github.bonigarcia.wdm.WebDriverManager;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	
		public class ThursayClass {
		public static void main(String[] args) throws InterruptedException{
			
			WebDriver driver;
			
			WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
			
			driver.navigate().to("https://www.spicejet.com/");
			
			//WebDriver driver2 = new ChromeDriver();  //we need to create new object
			
			driver.get("https://www.google.com");  
			
			driver.navigate().back();
			
			String actualurl = driver.getCurrentUrl();
			
			String expectedurl = "https://www.spicejet.com";
			
			if(actualurl.equals(expectedurl)) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
			
			driver.navigate().forward();
			
			driver.navigate().refresh();
			
			Thread.sleep(4000);
			
			driver.getTitle();
			
			driver.quit();
			
		}

	}

	

