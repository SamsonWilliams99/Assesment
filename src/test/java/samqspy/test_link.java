package samqspy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_link {
	public static void main(String[] args)
	{
		WebDriverManager.edgedriver(). setup();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("asdfghjkl");
		driver.findElement(By.name("pass")).sendKeys("sdfgh");
		driver.findElement(By.partialLinkText("?")).click();
	}
   

}



