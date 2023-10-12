package popups;

import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload_RobotClass {

	public static void main(String[] args) throws Throwable  {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&gad=1&gclsrc=ds");
		driver.findElement(By.xpath("//button[text()='uploadResume']")).click();
		Robot r= new Robot();
		StringSelection str = new StringSelection("C:\\Users\\samson\\Desktop\\samson Williams s.pdf");
		
		


	}

}
