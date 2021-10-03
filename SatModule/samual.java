

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.Dimension;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class samual {
	
	
	  public void main(String[] args)  {
	  
		  System.setProperty("webdriver.chrome.driver", "C:\\drivers//chromedriver.exe");			
		  WebDriver driver = new ChromeDriver();	
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(("https://drivesolutions-dev-ed.lightning.force.com"));
			driver.findElement(By.id("username")).sendKeys("venus@drivesolution.ca");
			driver.findElement(By.id("password")).sendKeys("HareKrishna@2021");
			driver.findElement(By.id("Login")).click();
			driver.manage().window().maximize();

	
			JavascriptExecutor js = (JavascriptExecutor) driver;
			  HashMap<String, Object> vars = new HashMap<String, Object>();
	

		    driver = new ChromeDriver();
		    js = (JavascriptExecutor) driver;
		    vars = new HashMap<String, Object>();

	

	    driver.get("https://drivesolutions-dev-ed.lightning.force.com/lightning/r/Lead/00Q5f000002oLAhEAM/view");
	    driver.manage().window().maximize();
	
	    {
	    	 driver = new ChromeDriver();
			    js = (JavascriptExecutor) driver;
			    vars = new HashMap<String, Object>();
	      WebElement element = driver.findElement(By.linkText("Converted"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.linkText("Converted")).click();
	    {
	    	 driver = new ChromeDriver();
			    js = (JavascriptExecutor) driver;
			    vars = new HashMap<String, Object>();
	    	WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".slds-button > .uiOutputText")).click();
	    {
	    	 driver = new ChromeDriver();
			    js = (JavascriptExecutor) driver;
			    vars = new HashMap<String, Object>();
	      WebElement element = driver.findElement(By.cssSelector(".slds-button > .uiOutputText"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	    	 driver = new ChromeDriver();
			    js = (JavascriptExecutor) driver;
			    vars = new HashMap<String, Object>();
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.cssSelector(".uiButton--default > .label"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).clickAndHold().perform();
	    }
	    {
	    	 driver = new ChromeDriver();
			    js = (JavascriptExecutor) driver;
			    vars = new HashMap<String, Object>();
	      WebElement element = driver.findElement(By.cssSelector(".uiButton--default > .label"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	    	 driver = new ChromeDriver();
			    js = (JavascriptExecutor) driver;
			    vars = new HashMap<String, Object>();
	      WebElement element = driver.findElement(By.cssSelector(".uiButton--default > .label"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).release().perform();
	    }
	    driver.findElement(By.cssSelector(".uiButton--default > .label")).click();
	    {
	    	 driver = new ChromeDriver();
			    js = (JavascriptExecutor) driver;
			    vars = new HashMap<String, Object>();
	      WebElement element = driver.findElement(By.cssSelector(".uiButton--default"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.cssSelector(".slds-button--icon-inverse")).click();
	    {
	    	 driver = new ChromeDriver();
			    js = (JavascriptExecutor) driver;
			    vars = new HashMap<String, Object>();
	      WebElement element = driver.findElement(By.cssSelector(".slds-button--icon-inverse"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	    	 driver = new ChromeDriver();
			    js = (JavascriptExecutor) driver;
			    vars = new HashMap<String, Object>();
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();

	    }
	    }
	  }
