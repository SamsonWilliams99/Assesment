package samqspy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_ancestors {
	public static void main(String[] args)
	{
	
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	

	}
}

