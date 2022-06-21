package OrangeHRM_UITestCases;
import Utilities.*;

import PageObjModule.*;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf.List;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjModule.LoginPage;
import Utilities.BaseClass;
import Utilities.Constants;
	public class LoginUITest_Case extends BaseClass {
	
		
		
		@Test()
        //Descripton -"Log into app -> Click on admin-> Click UserManagement ->Click ADD button to create new record"
		//+"->  Fill all the mendatory fields ->click save";
		public void Admin_SystemUser_001()
		{
		    LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
			HomePage homepage=PageFactory.initElements(driver, HomePage.class);
		    SystemUserPage systemuserpage=PageFactory.initElements(driver, SystemUserPage.class);
		    SystemUserRecordPage syatemuserRecordpage=PageFactory.initElements(driver, SystemUserRecordPage.class);
		    
		    
			loginpage
			.loginToApp(Constants.userName, Constants.passWord);
			
			homepage
			.WaitForHomePageToLoad()
			.ClickAdmin();
			
			systemuserpage
			.WaitForSystemUserPageToLoad()
			.ClickAddButton();
			
			syatemuserRecordpage
			.WaitForSystemUserAddPageToLoad()
			.InserTEmployeeName("Subash Chandra Mohanty")
			.InsertUserName("Lucky")
			.SelectStatus("Enabled")
			.InsertPassword("OrangeHRM@1234")
			.InsertConfirmPassword("OrangeHRM@1234")
			.ClickSave();
			
		}
		
		
		 

	}

