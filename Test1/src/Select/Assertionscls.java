package Select;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertionscls 
{
	@Test
public void m1()
{
	 /*System.setProperty("webdriver.chrome.driver", "D:\\Harish\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://cubicitsolution.co.in/");*/
		System.out.println("starting");
	   Assert.assertEquals("hari", "har");
	   System.out.println("ending");
	   SoftAssert a = new SoftAssert();
	   a.assertEquals(2, 4, "not same");
	   System.out.println("ghfhfgjfghfhfhfhgtjfc");
	   a.assertAll();
}
}
