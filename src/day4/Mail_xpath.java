package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mail_xpath 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("title");
		
		WebElement googlesearch = driver.findElement(By.xpath("//input [@name='q']"));
		googlesearch.sendKeys("gmail login"+Keys.ENTER);
		
		WebElement sighin = driver.findElement(By.xpath("//a[text()='Sign in to Gmail']"));
		sighin.click();                     
		
		WebElement sighin2 = driver.findElement(By.xpath("//a[text()='SIGN IN TO GMAIL']"));
		sighin2.click();
		
		WebElement mailid = driver.findElement(By.xpath("//input[@type='email']"));
		mailid.sendKeys("chezhiyan1710@gmail.com");
		
		
		
	}

}
