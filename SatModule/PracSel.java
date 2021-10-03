package memeberlogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracSel {

	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://yahoo.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"header-search-input\"]")).sendKeys("selenium");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[1]/div[1]/div[1]/div/form/div[1]/div/div/ul/li[1]/span/span/b")).click();
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[1]/div[1]/div[1]/div/form/div[2]/button/svg")).click();
		

	}

}
