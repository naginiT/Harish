package Select;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Incognitowindow 
{
	@Test
  public void window() throws Exception
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Harish\\chromedriver.exe");
	  // WebDriver driver = new ChromeDriver();
	  


ChromeOptions options = new ChromeOptions();
options.addArguments("--incognito");
DesiredCapabilities capabilities = DesiredCapabilities.chrome();
capabilities.setCapability(ChromeOptions.CAPABILITY, options);
WebDriver driver=new ChromeDriver(capabilities);
driver.get("https://seshajobs.com/");
driver.manage().window().maximize();
	   
	/* Robot r = new Robot();
	   r.keyPress(KeyEvent.VK_SHIFT); 
	   r.keyPress(KeyEvent.VK_CONTROL);
	   r.keyPress(KeyEvent.VK_N);
	   System.out.println("this is incognito window");
	   r.keyRelease(KeyEvent.VK_CONTROL);
	   r.keyRelease(KeyEvent.VK_N);
	   r.keyRelease(KeyEvent.VK_SHIFT);
	   Thread.sleep(2000);
	   driver.get("https://seshajobs.com/");*/
	   
}

}
