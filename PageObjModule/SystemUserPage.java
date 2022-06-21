package PageObjModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class SystemUserPage extends CommunMethods  
{
	@FindBy(xpath="//div/h1[text()='System Users']")
	public WebElement pageHeader;
	@FindBy(id="btnAdd")
	public WebElement add_Button;
	@FindBy(id="searchSystemUser_userName")
	public WebElement userName_TextBox;
	@FindBy(id="searchSystemUser_userType")
	public WebElement userType_DropDown;
	@FindBy(id="searchSystemUser_employeeName_empName")
	public WebElement empName_TextBox;
	@FindBy(id="searchSystemUser_status")
	public WebElement status_DropDown;
	@FindBy(id="searchBtn")
	public WebElement search_Button;
	@FindBy(id="resetBtn")
	public WebElement reset_Button;
	
	
	
	
	public SystemUserPage WaitForSystemUserPageToLoad()
	{

		WaitForElement(pageHeader);
		WaitForElement(add_Button);
		WaitForElement(userName_TextBox);
		WaitForElement(userType_DropDown);
		WaitForElement(empName_TextBox);
		WaitForElement(status_DropDown);
		WaitForElement(search_Button);
		WaitForElement(reset_Button);
		return this;
	}

	public SystemUserPage ClickAddButton()
	{
		WaitForElement(add_Button);
		Click(add_Button);
		return this;
	}
	
}
