package samqspy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriveManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class samsel {
	public static void main(String[] args) throws Throwable{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
	}

}
