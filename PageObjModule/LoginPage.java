package PageObjModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class LoginPage extends CommunMethods  
{
	@FindBy(id="txtUsername")
	public WebElement userName_Textbox;
	@FindBy(id="txtPassword")
	public WebElement password_Textbox;
	@FindBy(id="btnLogin")
	public WebElement login_Button;
	@FindBy(id="forgotPasswordLink")
	public WebElement forgotPwd_Link;


	
	public  LoginPage loginPageToLoad()
	{
	WaitForElement(userName_Textbox);
	WaitForElement(password_Textbox);
	WaitForElement(login_Button);
	WaitForElement(forgotPwd_Link);
	return this;
	}
		
	public LoginPage loginToApp(String userName, String passWord)
	{
		//Perform login
		WaitForElement(userName_Textbox);
		SendKeys(userName_Textbox,userName);	
		WaitForElement(password_Textbox);
		SendKeys(password_Textbox,passWord);
		WaitForElement(login_Button);
		Click(login_Button);

		return this;
	}
	


	
}
