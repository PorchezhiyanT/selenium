package day11;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Ex_6 
{

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
		driver.manage().window().maximize();         
		String title = driver.getTitle();
		System.out.println(title);
		

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		String height = jse.executeScript("return window.innerHeight;").toString();
		System.out.println(height);

		jse.executeScript("window.scrollBy(0,400)"); 
		
		//amazon Search motorolo and   take the screenshot.
		TakesScreenshot screenshot = (TakesScreenshot) driver;
	    File firstsource = screenshot.getScreenshotAs(OutputType.FILE);
	    File firstdestination = new File ("./Snapshots/motorolo.png");
	    FileHandler.copy(firstsource, firstdestination);
	    	

	}

}
