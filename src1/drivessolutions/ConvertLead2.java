package drivessolutions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConvertLead2 {
	
	

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers//chromedriver.exe");			
		WebDriver driver = new ChromeDriver();	
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	

		driver.get(("https://drivesolutions-dev-ed.lightning.force.com"));
		driver.findElement(By.id("username")).sendKeys("venus@drivesolution.ca");
		driver.findElement(By.id("password")).sendKeys("!!D#6!N*");
		driver.findElement(By.id("Login")).click();
		driver.manage().window().maximize();
	 	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver. navigate().to("https://drivesolutions-dev-ed.lightning.force.com/lightning/r/Lead/00Q5f000002ro02EAA/view");
		Thread.sleep(3000);
	
		//convert tab
      	WebElement converttab = driver.findElement(By.xpath("//span[@class='uiOutputText']"));
      	JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
      	javascriptExecutor.executeScript("arguments[0].focus(); arguments[0].click()", converttab);
      	 Thread.sleep(2000);

      	//mark as converted status
        WebElement status = driver.findElement(By.xpath("//div[@class='modal-footer slds-modal__footer']"));
        JavascriptExecutor newjavascriptExecutor = (JavascriptExecutor) driver;
      	newjavascriptExecutor.executeScript("arguments[0].focus(); arguments[0].click()", status);
        status.click();		        
        Thread.sleep(2000);
        
     
        
        Robot rb =new Robot();			
		rb.keyPress(KeyEvent.VK_D);
		rb.keyRelease(KeyEvent.VK_D);
		Thread.sleep(2000);
        
        WebElement convert = (new WebDriverWait(driver, 30))
        .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(("body > div.desktop.container.forceStyle.oneOne.navexDesktopLayoutContainer.lafAppLayoutHost.forceAccess.tablet > div.DESKTOP.uiContainerManager > div.DESKTOP.uiModal--leadConvert.uiModal.leadConvertModal.open.active > div.panel.slds-modal.slds-fade-in-open > div > div.modal-footer.slds-modal__footer > button.slds-button.slds-button--neutral.uiButton--default.uiButton--brand.uiButton.runtime_sales_leadConvertModalFooter"))));      
        convert.click();
        
        
	}
	}

