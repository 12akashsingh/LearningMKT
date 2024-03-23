package basic;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//Taking the ScreenShot with Class and CurrentDate Name
public class ScreenshotUsingFileHandler 
{
	public static void main(String[] args) throws Exception 
	{
		Date d1=new Date();
		//System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime());
		//System.out.println(d2);
		String s1=d2.toString().substring(4, 10);
		String s2=d2.toString().substring(23,28);
		//System.out.println(s1.concat(s2));
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		WebElement searchfield=driver.findElement(By.name("q"));
		searchfield.sendKeys("Akash Singh");
		
		TakesScreenshot ts=driver;//Step-1
		File source = ts.getScreenshotAs(OutputType.FILE);//Step-2
		
		File destination=new File("C:\\Users\\AkashSingh\\impdata\\selenium\\eclipseworkspace"
				+"\\JavaSelenium\\Screenshots\\"+new ScreenshotUsingFileHandler().getClass()+" "+s1.concat(s2)+".png");
		FileHandler.copy(source, destination);
		
		driver.quit();	
	}
}
