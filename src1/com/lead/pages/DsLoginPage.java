package com.lead.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class DsLoginPage {

	
	WebDriver driver;
	public DsLoginPage(WebDriver driver){
	this.driver=driver;
	}

	@FindBy(how=How.ID, using= "username") WebElement User;
	@FindBy(how=How.ID, using= "password") WebElement Password;
	@FindBy(how=How.ID, using= "Login") WebElement login;

	public void setUser(String strUser){
	User.sendKeys(strUser);
	}

	public void setPassword(String strPassword){
	Password.sendKeys(strPassword);
	}
	
	public void clickOnLoginButton(){
		login.click();
	}
	}
	

