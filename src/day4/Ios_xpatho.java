package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ios_xpatho
{

	public static void main(String[] args) 
	{
	System.setProperty("WebDriver.chrome.driver","E:\\Eclipse\\selenium\\drivers\\chromedriver.exe" );	
	
	WebDriver driver = new ChromeDriver();            
	driver.get("https://www.google.com/");                                       //
	driver.manage().window().maximize();
	String title = driver.getTitle( );                     //
	System.out.println(title);
	
	WebElement search = driver.findElement(By.xpath("//input[@name='q']"));          //
	search.sendKeys("amazon shopping"+Keys.ENTER);                                            //
	
	WebElement search1 = driver.findElement(By.xpath("//h3[text()='Online Shopping site in India: Shop Online for Mobiles, Books ...']"));          //
	search1.click();   
	
	WebElement search2 = driver.findElement(By.xpath("//input[@type='text']"));          //
	search2.sendKeys("attitude is everything by jeff keller"+Keys.ENTER);
	
	WebElement search3 = driver.findElement(By.xpath(title));          //
	search3.sendKeys(args);   
	
	WebElement search4 = driver.findElement(By.xpath(title));          //
	search4.sendKeys(args);   
	
	WebElement search5 = driver.findElement(By.xpath(title));          //
	search5.sendKeys(args);   

	
	
	}

}
