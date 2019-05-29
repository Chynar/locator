package locator;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenTest {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		Faker faker = new Faker();
		
		String fullName = faker.name().fullName();
		System.out.println(fullName);
		
		String firstName = faker.name().firstName();
		System.out.println(firstName);
		
		String address = faker.address().fullAddress();
		System.out.println(address);
		
		String phone = faker.phoneNumber().cellPhone();
		System.out.println(phone);
				
	}
}
