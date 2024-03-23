package basic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
//**Screenshot with Date name+Class Name**
public class ScreenshotUsingFileUtil_DataDriven_POI 
{
	public static void main(String[] args) throws Exception 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.linkedin.com/login?");
		
		EdgeDriver ts1=driver;
		File source= ts1.getScreenshotAs(OutputType.FILE);
		
		//**Screenshot with Date name**
		Date d1=new Date();
		Date d2=new Date(d1.getTime());
		String s1=d2.toString();
		String s2=s1.replaceAll(":", " ");
		
		File destination=new File("C:\\Users\\AkashSingh\\impdata\\selenium\\eclipseworkspace"+
		"\\JavaSelenium\\Screenshots\\"+s2+" "+new ScreenshotUsingFileUtil_DataDriven_POI().getClass()+".png");
		
		FileUtils.copyFile(source, destination);
		Thread.sleep(2000);
		driver.quit();
	}
}