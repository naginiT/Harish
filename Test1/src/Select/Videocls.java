package Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Videocls
{
	@Test
	public void play() throws Exception
	{

		 System.setProperty("webdriver.chrome.driver", "D:\\Harish\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
           driver.get("https://www.w3.org/2010/05/video/mediaevents.html");
          WebElement ele= driver.findElement(By.id("video"));
          ele.click();
           driver.manage().window().wait(2000);
           ele.click();
}

}
