package day13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation 
{

	public static void main(String[] args) throws InterruptedException 
	{
     System.setProperty("Webdriver.chrome.driver", "./drivers/chromederiver.exe");
     WebDriver driver = new ChromeDriver(); 
     driver.manage().window().maximize();
     
     driver.get("https://www.amazon.org/");
     Thread.sleep(2000);
     
     driver.navigate().to("https://www.flipkart.com/");
     Thread.sleep(2000);
     
     driver.navigate().back();
     driver.navigate().forward();
     driver.navigate().refresh();
     
	}

}
