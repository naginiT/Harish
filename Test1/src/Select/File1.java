package Select;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Select.Listenerscls.class)
public class File1
{
	public static WebDriver driver;
	@Test
	public static void m() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Harish\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com//");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("jbjgjg"));
		
		/*
		TakesScreenshot ts = (TakesScreenshot)driver;
		File f= ts.getScreenshotAs(OutputType.FILE);
		File fs = new File("D:\\Harish\\ssss.png");
		FileUtils.copyFile(f,fs);
		//driver.close();
	 */
		
	}

}
