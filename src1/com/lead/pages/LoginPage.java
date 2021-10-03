package com.lead.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
	WebDriver driver;
   
	By Username = By.id("username");
    By Password = By.id("password");
    By Login   = By.id("Login");
    	
      public void setuserid(String name)      
      {  driver.findElement( Username).sendKeys(name);   
      }  
      
      public void setpassword (String password)      
      {driver.findElement(Password).sendKeys(password);
      }

	public void clickloginTab() {
		{driver.findElement(Login).click();
	      }
		
	}
}

