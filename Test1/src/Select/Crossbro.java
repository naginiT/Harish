package Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbro 
{
	WebDriver driver;
	/*@BeforeTest
	@Parameters("browser")
	
  public void browser1(String browser)
  {
	  if(browser.equalsIgnoreCase("Chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "D:\\Harish\\chromedriver.exe");
		     driver = new ChromeDriver();
			 driver.manage().window().maximize();
	  }
	  else if(browser.equalsIgnoreCase("Firefox"))
	  {
		  System.setProperty("webdriver.chrome.driver", "D:\\Harish\\chromedriver.exe");
		   driver = new ChromeDriver();
			 driver.manage().window().maximize();
	  }
	 
  }
  
  @Test
  @Parameters({"username","password"})
  public void Login(String username,String password)
  {
	  driver.get
	  ("https://www.facebook.com/");
	  driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys(username);
	  driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys(password);
  }*/
  @DataProvider(name="da")
  public Object data()
  {
	 Object[][] d=new Object[2][2];
	 d[0][0]="harish";
	 d[0][1]="harish123";
	 d[1][0]="apraja";
	 d[1][1]="apraja123";
	return d;
	  
  }
  @Test(dataProvider="da")
  public void mthd(String username,String password)
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Harish\\chromedriver.exe");
	     driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys(username);
		 driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys(password);
	  
  }
  
  
}

