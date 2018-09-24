package Select;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Screenshotcls extends File1
{
	public void m1() throws Exception
	{
		
		TakesScreenshot st=(TakesScreenshot)driver;
	  	File src=st.getScreenshotAs(OutputType.FILE);
	  	File des=new File("D:\\Harish\\hsh.png");
	  	FileUtils.copyFile(src,des); 
}
}