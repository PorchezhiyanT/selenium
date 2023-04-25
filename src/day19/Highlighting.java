package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import day17.ReuseMethodSample;

public class Highlighting 
{

	public static void main(String[] args) 
	{

//		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
//
//		WebDriver driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://ww.facebook.com");
//		WebElement textHighlight = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the people in your life.')]"));
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].setAttribute('style','background:yellow')", textHighlight);
//		WebElement username = driver.findElement(By.id("email"));
//		js.executeScript("arguments[0].setAttribute('style','background:pink')", username);
		
		ReuseMethodSample r = new ReuseMethodSample();
		WebDriver driver=r.WebdriverSetup();
		r.launchUrl("https://www.facebook.com");
		r.MaximizeWindow();
		WebElement facebook = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps ')]"));
        r.textHighlight(facebook, "blue");
		
		
		
	}

}
