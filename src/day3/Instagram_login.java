package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_login 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement email = driver.findElement(By.xpath("//input[@name='username']"));
		email.sendKeys("chezhiyan1710@gmail.com");
	}

}
