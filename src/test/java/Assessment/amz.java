package Assessment;

import java.util.Set; 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//using Edge Browser
public class amz {
	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		String ptn = driver.getWindowHandle();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[2]")).click();
		WebElement ele = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
	    Thread.sleep(3000);
		ele.click();
		
		Set<String> child = driver.getWindowHandles();
	    for(String Tab2: child)
	    {
	    	driver.switchTo().window(Tab2);
	    	
	    }
	    Thread.sleep(3000);
	    WebElement mrp = driver.findElement(By.xpath("(//span[@class='a-size-large product-title-word-break']/ancestor::div[@class='centerColAlign ']//span[@aria-hidden='true'])[2]"));
	    System.out.println(mrp.getText());
	    WebElement add = driver.findElement(By.xpath("//input[@name='submit.add-to-cart']"));
		add.click();
	    driver.switchTo().window(ptn);
	    WebElement Return = driver.findElement(By.id("nav-logo-sprites"));
	    Return.click();
	    
	    
	    
	    
	    
		
		
	}

}
