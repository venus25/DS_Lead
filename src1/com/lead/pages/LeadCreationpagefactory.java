package com.lead.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LeadCreationpagefactory {
	WebDriver driver; 
	
	public LeadCreationpagefactory(WebDriver driver){
	this.driver=driver;
	}

	@FindBy(how=How.XPATH, using= "//input[@name='Phone']") WebElement Phone;
	@FindBy(how=How.XPATH, using= "//input[@placeholder='First Name']") WebElement FirstName;
	@FindBy(how=How.XPATH, using= "//input[@placeholder='Last Name']") WebElement LastName;	
	@FindBy(how=How.XPATH, using= "//input[@name='Company']") WebElement Company;
	@FindBy(how=How.XPATH, using= "//input[@name='Title']") WebElement Title;
	@FindBy(how=How.XPATH, using= "//input[@name='Email']") WebElement Email;
	@FindBy(how=How.XPATH, using= "//input[@name='Status__c']") WebElement Status;	
	@FindBy(how=How.XPATH, using= "//input[@name='province']") WebElement Province;
	@FindBy(how=How.XPATH, using= "//input[@name='country']") WebElement Country;
	@FindBy(how=How.XPATH, using= "/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_lead___012000000000000aaa___full___create___recordlayout2/force-record-layout-block/slot/force-record-layout-section[4]/div/div/div/slot/force-record-layout-row/slot/force-record-layout-item/div/span/slot/slot/force-record-layout-text-area/lightning-textarea/div/textarea") WebElement Description;
	@FindBy(how=How.XPATH, using= "/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/force-form-footer/div/div/div/runtime_platform_actions-actions-ribbon/ul/li[3]/runtime_platform_actions-action-renderer/runtime_platform_actions-executor-lwc-headless/slot[1]/slot/lightning-button/button") WebElement Click;
			


	public void setPhone(String strPhone){
		Phone.sendKeys(strPhone);
		}
	public void setfirstname(String strfirstname){
		FirstName.sendKeys(strfirstname);
		}
	
	public void setLastName(String strLastName){
		LastName.sendKeys(strLastName);
		}
	
	
	public void setCompany(String strCompany){
		Company.sendKeys(strCompany);
		}
	
	public void setTitle(String strTitle){
		Title.sendKeys(strTitle);
		}
	
	public void setEmail(String strEmail){
		Email.sendKeys(strEmail);
		}
	
	public void setStatus(String strStatus){
		Status.sendKeys(strStatus);
		}
	public void setProvince(String strProvince){
		Title.sendKeys(strProvince);
		}
	public void setCountry(String strCountry){
		Country.sendKeys(strCountry);
	}
	public void setDescription(String strDescription){
		Title.sendKeys(strDescription);
		}

	
		public void setClick(){
			Click.click();
		}
		}
	
	
	
	
	
	
	
	
	