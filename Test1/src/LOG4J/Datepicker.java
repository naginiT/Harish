package LOG4J;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Datepicker 
{
	
	@Test
	public void m1() throws Exception
	{
		int year=1996; String month="Aug"; String day="15";
		 System.setProperty("webdriver.chrome.driver", "D:\\Harish\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,250)", " ");
		driver.findElement(By.xpath("//*[@id=\'sandbox-container1\']/div/span/i")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[2]")).click();
		
		WebElement yer=driver.findElement(By.xpath("/html/body/div[3]/div[2]/table/thead/tr[2]/th[2]"));
		int y = Integer.parseInt(yer.getText());
	 try
  	{
	   if(y > year)
	   {
		 
		 WebElement prev= driver.findElement(By.xpath("/html/body/div[3]/div[2]/table/thead/tr[2]/th[1]"));
		  while(y!=year)
		  {
			  prev.click();
			  yer=driver.findElement(By.xpath("/html/body/div[3]/div[2]/table/thead/tr[2]/th[2]"));
			   y = Integer.parseInt(yer.getText()); 
			 
		  }	  
	   }
		List< WebElement> mon= driver.findElements(By.xpath("/html/body/div[3]/div[2]/table/tbody/tr/td/span"));
		for (WebElement m:mon)
		{
			
			 if(month.equalsIgnoreCase(m.getText()))
			 {
				 m.click();
			 }
		}
		}
		catch(Exception e)
		{
			WebElement d= driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody"));
			List<WebElement> da = d.findElements(By.tagName("td"));
			System.out.println(da.size());
			
			for(WebElement d1:da)
			{
				if(d1.getText().equalsIgnoreCase(day))
				{
					d1.click();
				}
			}
		}
	
		System.out.println("hello");
	   }
    }


