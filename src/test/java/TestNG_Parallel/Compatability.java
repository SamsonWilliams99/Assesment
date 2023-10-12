package TestNG_Parallel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Compatability {
	@Parameters({"browsername"})
	@Test
	public void amz(String browser)
	{
		WebDriver driver;
		if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			}
			else
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\samson\\eclipse-workspace\\samqspy\\src\\main\\resources\\chromedriver.exe");
				driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
}
	}
}


	 


