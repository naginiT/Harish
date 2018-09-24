package Select;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Gridcls
{
	@Test
	@Parameters({"browser"})
  public void Browser(String browser ) throws Exception
  {
	 if(browser.equalsIgnoreCase("chrome"))
	 {
      DesiredCapabilities cap= DesiredCapabilities.chrome();
	  cap.setPlatform(Platform.WINDOWS);
	  URL url= new URL("http://192.168.0.23:4455/wd/hub");
	  WebDriver driver =new RemoteWebDriver(url, cap);
	 driver.get("https://github.com/SeleniumHQ/selenium/issues/5149");
     }
	 else  if(browser.equalsIgnoreCase("firefox"))
	 {
		  DesiredCapabilities cap= DesiredCapabilities.firefox();
		  cap.setPlatform(Platform.WINDOWS);
		  URL url= new URL("http://192.168.0.23:4455/wd/hub");
		  WebDriver driver =new RemoteWebDriver(url, cap);
		  driver.get("https://github.com/SeleniumHQ/selenium/issues/5149");
	 }
}
}