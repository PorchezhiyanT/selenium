package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xp_axes2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement buttonElement = driver.findElement(By.id("confirmButton"));
		buttonElement.click();
		
		Thread.sleep(2000);
	    buttonElement.getText();
		
		driver.switchTo().alert().accept();
		
		
	}

}
