package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitly_wait 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ww.facebook.com");

		WebElement txtmail = driver.findElement(By.id("email"));
		txtmail.sendKeys("chezhiyan1710@gmail.com");

		WebElement passmail = driver.findElement(By.id("pass"));
		passmail.sendKeys("Porchezhiyan");

		//instantiate WebDriverWait
		WebDriverWait ww = new WebDriverWait(driver,Duration.ofSeconds(15));
		ww.until(ExpectedConditions.elementToBeClickable(By.name("login")));
		WebElement login = driver.findElement(By.name("login"));
		login.click();

	}

}
