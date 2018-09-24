package LOG4J;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import net.bytebuddy.description.annotation.AnnotationList.Empty;

public class Brokenlinks
{
	@Test
 public void broken()
 {
	String homepage="http://cubicitsolution.co.in/";
	  System.setProperty("webdriver.chrome.driver", "D:\\Harish\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get(homepage);
	   String url;
	   //List<WebElement> li = driver.findElements(By.tagName("a"));
	   List<WebElement> li = driver.findElements(By.tagName("a"));
	   Iterator<WebElement> it = li.iterator();
	   while(it.hasNext()) 
	   {
		   url=it.next().getAttribute("href");
		  // System.out.println(url);
		  
		   try
		   {
		    URL link = new URL(url);
		    HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
		    httpConn.setConnectTimeout(2000);
		    httpConn.connect();
		    if(httpConn.getResponseCode()== 200)
		    { 
		    System.out.println(url+" - "+httpConn.getResponseMessage());
		    }
		    if(httpConn.getResponseCode()== 404)
		    {
		    System.out.println(url+" - "+httpConn.getResponseMessage());
		    }
		    }
		    catch (Exception e)
		    {
		   	 
		    }
		   if(url == null || url.isEmpty())
		   {
			   System.out.println("URL is either not configured for anchor tag or it is empty");
			   continue;
		   }
		   if(!url.startsWith(homepage)){
               System.out.println("URL belongs to another domain, skipping it.");
               continue;
           }
          
	   }
	
	   
 }
}
