package memeberlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Gettesxttesting {
	WebDriver driver;
	
	
  @TestfirstHeading
  public void f() {
	String text =  driver.findElement(By.xpath("//*[@id=\"slider-3-slide-26-layer-5\"]")).getText();
    System.out.println("The text is "+ text);
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.get("https://agiletestingalliance.org");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
