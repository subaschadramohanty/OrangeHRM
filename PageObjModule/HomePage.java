package PageObjModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class HomePage extends CommunMethods  
{
	@FindBy(id="MP_btn")
	   public WebElement marketplace;
	@FindBy(id="notification")
	   public WebElement notification;
	@FindBy(id="welcome")
	   public WebElement welcome;	
	
	@FindBy(id="menu_admin_viewAdminModule")
	public WebElement admin_Link;
	@FindBy(id="menu_pim_viewPimModule")
	public WebElement pim_Link;
	@FindBy(id="menu_leave_viewLeaveModule")
	public WebElement Leave_Link;

	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	public WebElement recruitment_Link;
	@FindBy(id="menu_pim_viewMyDetails")
	public WebElement myInfo_Link;
	@FindBy(id="menu__Performance")
	public WebElement performance_Link;
	

	@FindBy(id="menu_dashboard_index")
	public WebElement  dashboard_Link;
	@FindBy(id="menu_directory_viewDirectory")
	public WebElement directory_Link;
	@FindBy(id="menu_maintenance_purgeEmployee")
	public WebElement maintenance_Link;
	@FindBy(id="menu_buzz_viewBuzz")
	public WebElement buzz_Link;
	
	
public HomePage WaitForHomePageToLoad()
{
	WaitForElement(marketplace);
	WaitForElement(notification);
	WaitForElement(welcome);
	WaitForElement(admin_Link);
	WaitForElement(pim_Link);
	WaitForElement(recruitment_Link);
	WaitForElement(myInfo_Link);
	WaitForElement(dashboard_Link);
	WaitForElement(recruitment_Link);
	WaitForElement(maintenance_Link);
	WaitForElement(performance_Link);
	WaitForElement(buzz_Link);
	return this;
}

public HomePage ClickAdmin()
{
	WaitForElementToBeClickable(admin_Link);
	Click(admin_Link);
	return this;
}
public HomePage NavigateToUserManagement()
{
	WaitForElementToBeClickable(admin_Link);
	Click(admin_Link);
	
	return this;
}

	
}
