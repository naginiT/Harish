package Select;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Scrollcls 
{
	
 public void m1()
 {
	 System.setProperty("webdriver.chrome.driver", "D:\\Harish\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
	 driver.get("http://webmail.cubicitsolution.co.in/logout/?locale=en");
	 driver.manage().window().maximize();
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,250)", "");
	 
 }
 @Test
	public void m()
	{
	 
	 int a=10;
	/* SoftAssert as = new SoftAssert();
	 as.assertEquals(a, 1);*/
	 Assert.assertEquals(a, 2);
	 System.out.println("hellodjsdhf");
	 System.out.println("hellodjsdhf");
	 System.out.println("hellodjsdhf");
	 System.out.println("hellodjsdhf");
	 System.out.println("hellodjsdhf");
	 System.out.println("hellodjsdhf");
	 
	// as.assertAll();
	 
		
	}
 @Test
 public void m2()
 {
	 System.out.println("hellodjsdhf");
 }
 
}
