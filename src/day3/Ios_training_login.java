package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ios_training_login 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "E:/Eclipse/selenium/drivers/chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://www.greenstechnologys.com/apple-ios-training-in-chennai.html");
        driver.manage().window().maximize();
        String title = driver.getTitle();
		System.out.println(title);
		
		WebElement contactButton = driver.findElement(By.className("login-myact contactus"));
		contactButton.click();
		
		WebElement nameElement = driver.findElement(By.name("name"));
		nameElement.sendKeys("porchezhiyanT");
		
		WebElement nameElement1 = driver.findElement(By.name("Phone"));
		nameElement1.sendKeys("phone");
		
		WebElement emailElement = driver.findElement(By.name("email"));
		emailElement.sendKeys("chezhiyan1710@gmail.com");

		WebElement loginButton = driver.findElement(By.name("submit"));
		loginButton.click();
	}

}
