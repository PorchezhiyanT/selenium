package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_search 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:/Eclipse/selenium/drivers/chromedriver.exe");
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement qElement = driver.findElement(By.name("q"));
		qElement.sendKeys("gmail login");
		
		WebElement btnKButton = driver.findElement(By.id("btnK"));
		btnKButton.click();
		
		
	}

}
