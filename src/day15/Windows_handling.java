package day15;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Windows_handling 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		driver.manage().window().maximize();		
        
		WebElement textsearch = driver.findElement(By.id("inputValEnter"));
		textsearch.sendKeys("iphone");
		
		WebElement btnsearch = driver.findElement(By.xpath("//span[text()='Search']"));
		btnsearch.click();
		
		WebElement btnpro = driver.findElement(By.xpath("(//div[@class='product-tuple-description '])[3]"));
		btnpro.click();//this xpath each timechanging needto retify it later
		
		String parentwind = driver.getWindowHandle();
		
		Set<String>allwind = driver.getWindowHandles();
		
		for(String cd:allwind)
		{
			if(!(parentwind.equals(cd)));
			{
				driver.switchTo().window(cd);
			}
		}
		
		WebElement btnadd = driver.findElement(By.id("add-card-button-id"));
		btnadd.click();
	}

}
