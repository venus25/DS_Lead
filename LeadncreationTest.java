package drivessolutions;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;



public class LeadsCreation {

			public static void main(String[] args) throws InterruptedException, Exception {
			
			
				
				
				System.setProperty("webdriver.chrome.driver", "C:\\drivers//chromedriver.exe");			
			
				WebDriver driver = new ChromeDriver();	
				
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				

				driver.get(("https://drivesolutions-dev-ed.lightning.force.com"));
				driver.findElement(By.id("username")).sendKeys("venus@drivesolution.ca");
				driver.findElement(By.id("password")).sendKeys("HareKrishna@2021");
				driver.findElement(By.id("Login")).click();
				driver.manage().window().maximize();
				driver. navigate().to("https://drivesolutions-dev-ed.lightning.force.com/lightning/o/Lead/list?filterName=00B5f000004lHibEAE");
				
				Thread.sleep(5000);
				Actions action = new Actions(driver);
				
		
	
				WebElement newleadtab = driver.findElement(By.xpath("//*[@id=\"brandBand_1\"]/div/div/div/div/div[1]/div[1]/div[2]/ul/li[1]/a/div"));		
				action.moveToElement(newleadtab).build().perform();
				newleadtab.click();
				
  public void leadncreation() {
    driver.get("https://drivesolutions-dev-ed.lightning.force.com/lightning/o/Lead/list?filterName=00B5f000004lHibEAE");
    driver.manage().window().setSize(new Dimension(1081, 703));
    {
      WebElement element = driver.findElement(By.cssSelector(".ascending .toggle"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".slds-button:nth-child(1) > .forceActionLink > div")).click();
    driver.findElement(By.id("input-165")).click();
    driver.findElement(By.id("input-166")).click();
    driver.findElement(By.id("input-172")).click();
    driver.findElement(By.id("input-198")).click();
    driver.findElement(By.cssSelector("#input-198-5-198 > .slds-media__body")).click();
    driver.findElement(By.id("input-224")).click();
    driver.findElement(By.id("input-180")).click();
    {
      WebElement element = driver.findElement(By.name("SaveEdit"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.name("SaveEdit")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    js.executeScript("window.scrollTo(0,0)");
    {
      WebElement element = driver.findElement(By.name("upcoming"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".slds-icon-utility-setup path:nth-child(1)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
  }
}
