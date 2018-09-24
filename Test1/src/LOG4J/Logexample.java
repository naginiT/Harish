package LOG4J;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Logexample
{
	@Test
  public void log() throws Exception
  {
	  Logger lg= Logger.getLogger("Logexample.class");
	  PropertyConfigurator.configure("D:\\Harish\\testng\\Test1\\src\\LOG4J\\Log.properties");
	  System.setProperty("webdriver.chrome.driver", "D:\\Harish\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   lg.info("invoking");
	   
	   driver.manage().window().maximize();
	   driver.get("https://www.facebook.com/"); 
	   lg.debug("this is debug msg223");
	   driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("harsish");
	   driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("harish123");
	   lg.error("this is error msg");
	   driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();
	 
	   Reporter.log("reporter data here");
	   TakesScreenshot ts=(TakesScreenshot)driver;
	 	File f1=ts.getScreenshotAs(OutputType.FILE);
	   File f2= new File("D:\\harish\\gh.png");
	  FileUtils.copyFile(f1, f2);
	  Reporter.log("<img src='"+f2+"'/>");
	   
  }
}
