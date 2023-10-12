package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isSelected {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
				
				WebDriver driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				driver.get("https://www.facebook.com/");
				driver.findElement(By.xpath("//a[text()='create new account']")).click();
				WebElement radio=driver.findElement(By.xpath("//input[@value='1']"));
				radio.click();
				if(radio.isSelected()) {
					System.out.println("pass");
					
				}else
				{
					System.out.println("fail");
				}
	}
}
				
