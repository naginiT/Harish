package Select;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Multiplewindow 
{
	@Test
	public void handling()
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\Harish\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("http://www.naukri.com/");
		   Set<String>s1=driver.getWindowHandles();
		// String parent=driver.getWindowHandle();
		   Iterator<String> it =s1.iterator();
		   while(it.hasNext())
		   {
			   String child_window=it.next();
			   for(int i=1; i<=3; i++)
			   {
			   driver.switchTo().window(Integer.toString(i));
			   driver.close();
			   }
			  /* if(!parent.equals(child_window))
			   {
			   driver.switchTo().window(child_window);
			    
			   System.out.println(driver.switchTo().window(child_window).getTitle());
			    
			   driver.close();
			   }
		   }
		   driver.switchTo().window(parent);*/  
	 }	   
    }

	}
