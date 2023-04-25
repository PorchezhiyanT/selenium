package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();   
        String title = driver.getTitle();
		System.out.println(title);
		
		
		WebElement emailElement = driver.findElement(By.id("email"));
		emailElement.sendKeys("chezhiyan1710@gmail.com");
		
		WebElement passElement = driver.findElement(By.id("pass"));
		passElement.sendKeys("porchezhiyanT");
		
		WebElement loginButton = driver.findElement(By.id("loginbutton"));
		loginButton.click();
		
		 String url = driver.getCurrentUrl();
	     System.out.println(url);

	}

}
