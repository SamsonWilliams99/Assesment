package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class get_methods {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
				
				WebDriver driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				driver.get("https://www.facebook.com/");
				WebElement email =  driver.findElement(By.id("email"));
				String attribute = email.getAttribute("type");
				System.out.println(attribute);
				coOrdinates
				
				
				
				Dimension size=email.getSize();
				int h=size.getHeight();
				int w=size.getWidth();
				System.out.println(h);
				System.out.println(w);
	}
}