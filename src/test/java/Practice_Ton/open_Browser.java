package Practice_Ton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class open_Browser {
	static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samson\\eclipse-workspace\\samqspy\\src\\main\\resources\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.id("APjFqb")).sendKeys("sam");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@type='submit'])[1]")).submit();
	Thread.sleep(3000);
	WebElement signIin = driver.findElement(By.xpath("//span[text()='Sign In']"));
	Actions a =new Actions(driver);
	a.moveToElement(signIin).perform();
	
	}

	}


