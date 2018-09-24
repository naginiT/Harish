package Select;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.App;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Notepadcls 
{
	@Test
	public void notepad()
	{
		 // System.setProperty("webdriver.chrome.driver", "D:\\Harish\\chromedriver.exe");
		 // WebDriver driver = new ChromeDriver();
		  //driver.manage().window().maximize();
		  Screen s= new Screen();
		  App.open("Notepad.exe");    
		  s.click();
		  s.type("ffjjfwjf");
}
}
