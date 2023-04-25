package day12;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.geeksforgeeks.org/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Data Structures and Algorithms")));
		
		WebElement algoLinkText = driver.findElement(By.linkText("Data Structures and Algorithms"));
		algoLinkText.click();
		
		WebDriverWait alertWait = new  WebDriverWait(driver,Duration.ofSeconds(15));
		alertWait.until(ExpectedConditions.alertIsPresent());
		
		Thread.sleep(5000);
		driver.close();
	}

}
