package drivessolutions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class CreateLead {


		public static void main(String[] args) throws InterruptedException, Exception {
			
			System.setProperty("webdriver.chrome.driver", "C:\\drivers//chromedriver.exe");			
			WebDriver driver = new ChromeDriver();	
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
		

			driver.get(("https://drivesolutions-dev-ed.lightning.force.com"));
			driver.findElement(By.id("username")).sendKeys("venus@drivesolution.ca");
			driver.findElement(By.id("password")).sendKeys("");
			driver.findElement(By.id("Login")).click();
			driver.manage().window().maximize();
		 	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver. navigate().to("https://drivesolutions-dev-ed.lightning.force.com/lightning/o/Lead/list?filterName=00B5f000004lHibEAE");
			
			Thread.sleep(5000);
			Actions action = new Actions(driver);
			
			WebElement newleadtab = driver.findElement(By.xpath("//*[@id=\"brandBand_1\"]/div/div/div/div/div[1]/div[1]/div[2]/ul/li[1]/a/div"));		
			action.moveToElement(newleadtab).build().perform();
			newleadtab.click();	
			Thread.sleep(2000); 
			
			Robot rb =new Robot();			
			rb.keyPress(KeyEvent.VK_D); 
			rb.keyRelease(KeyEvent.VK_D);
			Thread.sleep(2000);
			
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@name='Phone']")).sendKeys("402-289-2356");
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Saniya");
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Max");
			driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("Excellent Warehouses");
			driver.findElement(By.xpath("//input[@name='Title']")).sendKeys("Head-Sales");
			driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("saniyamax@ewh.ca");
			driver.findElement(By.xpath("//input[@name='Website']")).sendKeys("excellentwarehouses.com");
			driver.findElement(By.xpath("//input[@name='AnnualRevenue']")).sendKeys("$21375645");
			driver.findElement(By.xpath("//input[@name='Status__c']")).sendKeys("Qualified");	
			driver.findElement(By.xpath("//button[@name='SaveEdit']")).sendKeys("Calgary");
			driver.findElement(By.xpath("//input[@name='province']")).sendKeys("AB");
			driver.findElement(By.xpath("//input[@name='country']")).sendKeys("CA");
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_lead___012000000000000aaa___full___create___recordlayout2/force-record-layout-block/slot/force-record-layout-section[4]/div/div/div/slot/force-record-layout-row/slot/force-record-layout-item/div/span/slot/slot/force-record-layout-text-area/lightning-textarea/div/textarea")).sendKeys("New warehouse Project est. $123456 in Saskatoon Region at 2 locations.");
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/force-form-footer/div/div/div/runtime_platform_actions-actions-ribbon/ul/li[3]/runtime_platform_actions-action-renderer/runtime_platform_actions-executor-lwc-headless/slot[1]/slot/lightning-button/button")).click();				
			Thread.sleep(2000);
			String Leadurl = driver.getCurrentUrl();
			
			System.out.println( "                     ");
			System.out.println( "Lead-Alex Monro is created successfully.");
			System.out.println( "The Lead Url is " + Leadurl);
			

		}
}


	
