package memeberlogin;

 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class HandlinFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        driver.switchTo().frame("draggable");   
	        driver.close();
	        
	}
	 
}
 
 /*	WebElement element = driver.findElement(By.xpath("div[@id='draggable"));
 System.out.println(element.getText());*/