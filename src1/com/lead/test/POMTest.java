package com.lead.test;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.lead.pages.DsLoginPage;
import com.lead.pages.LeadCreationpagefactory;


//Login Driver Solution SFDC 
     @Test (priority=1)  
     public class POMTest extends BaseTest{
	  	
		    	public void init() throws Exception{
		    		 
		    	DsLoginPage  loginpage = PageFactory.initElements(driver, DsLoginPage.class);
		    	loginpage.setUser("venus@drivesolution.ca");
		    	loginpage.setPassword(");
		    	loginpage.clickOnLoginButton();
		        driver.navigate().to("https://drivesolutions-dev-ed.lightning.force.com/lightning/setup/SetupOneHome/home");			    	
		    	String Title = driver.getTitle();
		    	System.out.println("                      ");		  
		    	System.out.println(("Title of the page is " + Title));
		    	System.out.println("Test Passed");		    	
  } 
  
//Create New Lead 
        @Test (priority=2)	
       public void LeadCreation() throws Exception {
	  	  
		driver. navigate().to("https://drivesolutions-dev-ed.lightning.force.com/lightning/o/Lead/list?filterName=00B5f000004lHibEAE");	
		Thread.sleep(3000);
//pagefactory				
		LeadCreationpagefactory createlead = PageFactory.initElements(driver, LeadCreationpagefactory.class);
		
//Action Class for mouse movement			
		Actions action = new Actions(driver);		
		WebElement newleadtab = driver.findElement(By.xpath("//*[@id=\"brandBand_1\"]/div/div/div/div/div[1]/div[1]/div[2]/ul/li[1]/a/div"));		
		action.moveToElement(newleadtab).build().perform();
		newleadtab.click();	
		Thread.sleep(2000); 
		
//Robot Class for pop up window		
		Robot rb =new Robot();			
		rb.keyPress(KeyEvent.VK_D);
		rb.keyRelease(KeyEvent.VK_D);
		Thread.sleep(2000);
		
		
		createlead.setPhone("2036789876");
		createlead.setfirstname("Madhav");
		createlead.setLastName("Max");
		createlead.setCompany("Quality Softwares");
		createlead.setTitle("Team Manager");
		createlead.setEmail("madhavmax@qualitysoftwares.ca");
		createlead.setStatus("Screening");	 
		createlead.setProvince("ON");
		createlead.setCountry("CA");
		createlead.setDescription("Website Enhancement Project");
		createlead.setClick();
		
		Thread.sleep(2000);
		String Leadurl = driver.getCurrentUrl();			
		System.out.println( "NewLead - Alex Monro is created successfully.");
		System.out.println( "The Lead Url is " + Leadurl);	     	    
  }
  
  
//quit the Test
  @AfterTest
  public void afterTest() {
	  System.out.println("Test Passed");	 
	  driver.quit(); 
  }
  }
