package com.lead.test;
	
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.lead.pages.DsLoginPage;


	public class LoginTest extends BaseTest{
	@Test
	public void init() throws Exception{
 
		DsLoginPage  loginpage = PageFactory.initElements(driver, DsLoginPage.class);
		loginpage.setUser("venus@drivesolution.ca");
		loginpage.setPassword(");
		loginpage.clickOnLoginButton();
		
	driver.navigate().to("https://drivesolutions-dev-ed.lightning.force.com/lightning/page/home");
	String currenturl = driver.getCurrentUrl();

	
	String Title = driver.getTitle();
	System.out.println("                      ");
	System.out.println("Current url is "+ currenturl);
	System.out.println(("Title of the page is " + Title));
	System.out.println("Test Passed");
	
	}
	}
