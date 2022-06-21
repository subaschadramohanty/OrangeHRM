package PageObjModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class SystemUserRecordPage extends CommunMethods  
{
	@FindBy(xpath="//div/h1[text()='Add User']")
	public WebElement pageHeader;
	@FindBy(id="systemUser_userType")
	public WebElement userRole_DropDown;
	@FindBy(id="systemUser_userName")
	public WebElement userName_TextBox;
	@FindBy(id="systemUser_employeeName_empName")
	public WebElement empName_TextBox;
	@FindBy(id="systemUser_status")
	public WebElement status_DropDown;
	@FindBy(id="systemUser_password")
	public WebElement password_TextBox;
	@FindBy(id="systemUser_confirmPassword")
	public WebElement rconfirmPassword_TextBox;
	/*
	 * @FindBy(xpath=
	 * "//*[@id=\"frmSystemUser\"]/fieldset/ol/li[6]/div[3]/span/text()") public
	 * WebElement passwordAlert_MSG;
	 */
	@FindBy(id ="btnSave")
	public WebElement save_Button;
	@FindBy(id="btnCancel")
	public WebElement cancel_Button;
	
	
	
	
	public SystemUserRecordPage WaitForSystemUserAddPageToLoad()
	{
		WaitForElement(pageHeader);
		
		WaitForElement(userRole_DropDown );
		WaitForElement(userName_TextBox);
		WaitForElement(empName_TextBox);
		WaitForElement(status_DropDown);
		WaitForElement(password_TextBox);
		//WaitForElement(passwordAlert_MSG);
		WaitForElement(rconfirmPassword_TextBox);
		WaitForElement(save_Button);
		WaitForElement(cancel_Button);
		return this;
	}
   
	public SystemUserRecordPage SelectUserRole(String elementTextToSelect)
	{
		SelectPicklistElementByText(userRole_DropDown, elementTextToSelect);
		return this;
	}
	
	public SystemUserRecordPage InserTEmployeeName(String empName)
	{
		SendKeys(empName_TextBox, empName);
		return this;
	}
	
	public SystemUserRecordPage InsertUserName(String userName)
	{
		SendKeys(userName_TextBox, userName);
		return this;
	}

	public SystemUserRecordPage SelectStatus(String elementTextToSelect)
	{
		SelectPicklistElementByText(status_DropDown, elementTextToSelect);
		return this;
	}
	public SystemUserRecordPage InsertPassword(String password)
	{
		SendKeys(password_TextBox, password);
		return this;
	}
	public SystemUserRecordPage InsertConfirmPassword(String password)
	{
		SendKeys(rconfirmPassword_TextBox, password);
		return this;
	}
	public SystemUserRecordPage ClickSave()
	{
		Click(save_Button);
		return this;
	}
	
}
