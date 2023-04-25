package day9;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon_downpress 
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();   
		String title = driver.getTitle();
		System.out.println(title);
		
		
		Robot robotkey = new Robot();
		for(int i=0;i<8;i++)
		{
		robotkey.keyPress(KeyEvent.VK_TAB);
		robotkey.keyRelease(KeyEvent.VK_TAB);
		}
		
		robotkey.keyPress(KeyEvent.VK_ENTER);
	}

}
