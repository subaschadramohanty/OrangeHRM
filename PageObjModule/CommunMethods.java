package PageObjModule;


	import java.time.Duration;

import org.openqa.selenium.By;
	import org.openqa.selenium.UnhandledAlertException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseClass;
import io.netty.handler.timeout.WriteTimeoutException;

	public  class CommunMethods   {
	
		public WebDriverWait wait=new WebDriverWait(BaseClass.driver,Duration.ofSeconds(30));

		 String appURL;
		
		
		void SwitchToWindow(String window)
		{
			BaseClass.driver.switchTo().window(window);
		
		}
		 
		void  SwitchToIframe(By IframeElement)   
		{
			BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(IframeElement));
			
		}
		void SwitchToDefaultFrame()
		{
			try {
				BaseClass.driver.switchTo().defaultContent();
			}
			catch(UnhandledAlertException e)
			{
				BaseClass.driver.switchTo().defaultContent();
			}
		}
		
		void WaitForBrowserURL(String expectedURL)
		{
			wait.until(ExpectedConditions.urlMatches(expectedURL));
		}
		
		void WaitForBrowserWindowTitle(String title)
		{
			wait.until(ExpectedConditions.titleIs(title));	
		}

	public	void WaitForElement(WebElement element)
		{
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		
		void WaitForElementNotVisible(WebElement element)
		{
			try {
			wait.until(ExpectedConditions.invisibilityOf(element));
			}
			catch(WriteTimeoutException e) {
				System.out.println("Element is still visible ..."+e.getMessage());
			}
			
		}
		void WaitForElementToBeClickable(WebElement element) {
			wait.until(ExpectedConditions.visibilityOf(element));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		
		}
		void CheckIfElementExists(WebElement element)
		{
			element.isDisplayed();
		}
		void Click(WebElement element)
		{
			element.click();
			
		}
		void SendKeys(WebElement element, String keys)
		{
		//element.clear();
		element.sendKeys(keys);
		}
		void SelectPicklistElementByText(WebElement element , String ElementTextToSelect)
		{
			Select s =new Select(element);
			s.selectByVisibleText(ElementTextToSelect);
		}
		void SelectPicklistElementByValue(WebElement element , String ElementTextToSelect)
		{
			Select s =new Select(element);
			s.deselectByValue(ElementTextToSelect);
		}
		void SelectPicklistElementByIndexNo(WebElement element , int indexNo)
		{
			Select s =new Select(element);
			s.selectByIndex(indexNo);
		}
		
	}


