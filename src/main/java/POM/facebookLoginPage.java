package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookLoginPage {
	//Declaration
	//address of email Textfield
	
	@FindBy(id="email")
	private WebElement emailTf;
	
	//Address of password Textfield
	@FindBy(name="pass")
	private WebElement passwordTf;
	
	//Address of login Button
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginBtn;
	
	//initialization
	public facebookLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	//getter for all private webElements

	public WebElement getEmailTf() {
		return emailTf;
	}


	public WebElement getPasswordTf() {
		return passwordTf;
	}
	

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	//Business libraries
	public void emailTextfield(String data) {
		emailTf.sendKeys(data);
	}
	
	public void PasswordTextfield(String data) {
		passwordTf.sendKeys(data);
	}
	
	public void loginButton() {
		loginBtn.click();
	}
	
	
	
	

}
