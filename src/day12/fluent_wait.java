package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class fluent_wait 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();  
		
		//Instantate fluent  wait
		FluentWait<WebDriver> f = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(20)).ignoring(Throwable.class);
        f.until(ExpectedConditions.elementToBeClickable(By.name("login")));
        
        WebElement login = driver.findElement(By.name("login"));
        login.click();
	}

}
