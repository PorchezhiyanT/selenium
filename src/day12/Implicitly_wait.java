package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitly_wait 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //implicitlyWait is a one time delaration
		
		driver.findElement(By.id("email")).sendKeys("chezhiyan1710@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("porchezhiyan");

	}

}
