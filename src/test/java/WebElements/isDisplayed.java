package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isDisplayed {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
				
				WebDriver driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				driver.get("https://www.facebook.com/");
				WebElement email =  driver.findElement(By.id("email"));
				if(email.isDisplayed()) {
					email.sendKeys("sam");
					System.out.println("pass");
				}
				else
				{
					System.out.println("fail");
				}
}
}
