package com.lead.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
  

public class LeadConvertPage {
	
	WebDriver driver; 
  	
  	public LeadConvertPage(WebDriver driver){
  		this.driver=driver;
  		
  	    PageFactory.initElements(driver, this);
  	} 
  		@FindBy(how=How.XPATH, using= "//span[@class='uiOutputText']") WebElement converttab;
		@FindBy(how=How.XPATH, using= "//div[@class='modal-footer slds-modal__footer']") WebElement status;
		@FindBy(how=How.XPATH, using= "body > div.desktop.container.forceStyle.oneOne.navexDesktopLayoutContainer.lafAppLayoutHost.forceAccess.tablet > div.DESKTOP.uiContainerManager > div.DESKTOP.uiModal--leadConvert.uiModal.leadConvertModal.open.active > div.panel.slds-modal.slds-fade-in-open > div > div.modal-footer.slds-modal__footer > button.slds-button.slds-button--neutral.uiButton--default.uiButton--brand.uiButton.runtime_sales_leadConvertModalFooter") WebElement CONVERTTAB;
	      	
	      	public void setconvert(){
	      		JavascriptExecutor newjavascriptExecutor = (JavascriptExecutor) driver;
	          	newjavascriptExecutor.executeScript("arguments[0].focus(); arguments[0].click()", converttab);
	    		converttab.click();
	    		}
	    		
	    	public void setstatus(){
	    		JavascriptExecutor newjavascriptExecutor = (JavascriptExecutor) driver;
	          	newjavascriptExecutor.executeScript("arguments[0].focus(); arguments[0].click()", status);
	    		status.click();
	    		}
	    	
	    	public void setCONVERTTAB(){
	    		CONVERTTAB.click();
	    		}
}
 	 
     