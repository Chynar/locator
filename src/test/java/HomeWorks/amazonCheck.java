package HomeWorks;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonCheck {
WebDriver amazon;
 
    @Before
    public void amazon() {
	WebDriverManager.chromedriver().setup();
	amazon = new ChromeDriver();
	amazon.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	amazon.manage().window().maximize();
	amazon.get("https://www.amazon.com");
}
    @Test
    public void testAmazon() throws InterruptedException {
    amazon.findElement(By.id("twotabsearchtextbox")).sendKeys("camera" + Keys.ENTER);
    WebDriverWait wait = new WebDriverWait(amazon,50);
    wait.until(ExpectedConditions.elementToBeClickable(By.id("p_89/Kodak"))).click();
    WebElement search= amazon.findElement(By.xpath("//div[@class='sg-col-inner']//div[@class='a-section a-spacing-small a-spacing-top-small']"));
    System.out.println(search);
    
}
}
