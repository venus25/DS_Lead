package com.lead.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.lead.pages.DsLoginPage;
import com.lead.pages.LeadConvertPage;


//Login Driver Solution SFDC 
     @Test (priority=1)  
     public class POMConversionTest extends BaseTest{
	  	
		    	public void init() throws Exception{
		    		ChromeOptions options = new ChromeOptions();
					options.addArguments("--disable-notifications");
					 
		    	DsLoginPage  loginpage = PageFactory.initElements(driver, DsLoginPage.class);
		    	loginpage.setUser("venus@drivesolution.ca");
		    	loginpage.setPassword("!!D#6!N*");
		    	loginpage.clickOnLoginButton();
		        driver.navigate().to("https://drivesolutions-dev-ed.lightning.force.com/lightning/r/Lead/00Q5f000002ro02EAA/view");		
		        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    	String Title = driver.getTitle();
		    	System.out.println("                      ");		  
		    	System.out.println(("Title of the page is " + Title));
		    	System.out.println("Test Passed");		    	
  } 
 

      //Convert Lead
        @Test (priority=2)	
       public void Leadconversion() throws AWTException, Exception  {      
        	       	           
          	LeadConvertPage Convertlead = PageFactory.initElements(driver, LeadConvertPage.class);                     
            Convertlead.setconvert();
            Convertlead.setstatus();
            Thread.sleep(3000);
            
            Robot rb =new Robot();			
    		rb.keyPress(KeyEvent.VK_D);
    		rb.keyRelease(KeyEvent.VK_D);
    		Thread.sleep(3000);
            
      
       	  WebElement convert = (new WebDriverWait(driver,40))       			   
       	 .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body > div.desktop.container.forceStyle.oneOne.navexDesktopLayoutContainer.lafAppLayoutHost.forceAccess.tablet > div.DESKTOP.uiContainerManager > div > div.panel.slds-modal.slds-fade-in-open > div > div.modal-footer.slds-modal__footer > button.slds-button.slds-button--neutral.uiButton--default.uiButton--brand.uiButton.runtime_sales_leadConvertModalFooter")));      
       	  convert.click();
       	 Convertlead.setCONVERTTAB();
        }        
 
        
  
//quit the Test
  @AfterTest
  public void afterTest() {
	  System.out.println("Test Passed");	 
	  driver.quit();
	
  }
  }
