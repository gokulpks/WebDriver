package demotest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() 
  {
	  driver.get("http://www.demoaut.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
	  System.out.println(driver.getTitle());
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.05.01\\Desktop\\Server Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
