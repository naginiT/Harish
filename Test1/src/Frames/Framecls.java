package Frames;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Framecls 
{
  @Test
  public void frame()
  {
	  System.setProperty("webdriver.chrome.driver","D:\\Harish\\chromedriver.exe");
  	WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///D:/Harish/New%20folder/HtmlTask1/WebContent/frames.html");
		List<WebElement> li = driver.findElements(By.tagName("frame"));
		int i=0;
		while(i<li.size())
		{
			try
			{
			driver.switchTo().frame(i);
			WebElement ele=driver.findElement(By.name("pinkrose"));
			if(ele.isDisplayed())
			{
				ele.click();
				System.out.println("The element found in frame"+i);
			}
			else
			{
				System.out.println("The element not found in frame"+i);
			}
			}
			catch(Exception e)
			{
			System.out.println("frame not found"+i);	
			}
			driver.switchTo().defaultContent();
			i++;
		}
  }
}
