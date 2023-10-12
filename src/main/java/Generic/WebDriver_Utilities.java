package Generic;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriver_Utilities {
	//1.mouseHoverinf
	public void mouseHover(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	//2. double clicking
	public void doubleclick(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}
		
		//3.right Clicking
		public void rightClick(WebDriver driver, WebElement ele) {
			Actions a = new Actions(driver);
			a.contextClick(ele).perform();
		}
		
		//4.drag and drop
		public void DragAndDrop(WebDriver driver, WebElement ele1,WebElement ele2) {
			Actions a = new Actions(driver);
			a.dragAndDrop(ele1, ele2).perform();
		}
		
		//5.handling alter pop up clicking on OK
		
		public void alter(WebDriver driver) {
			driver.switchTo().alert().accept();
		}
		
		//6.handling alter pop up clicking on 
		
		      public void altercancel(WebDriver driver) {
			driver.switchTo().alert().dismiss();
		      }
		      
			//7.child Browser
			public void childBrowser(WebDriver driver) {
			Set<String> childchild = driver.getWindowHandles();
			
			}
		}


}
