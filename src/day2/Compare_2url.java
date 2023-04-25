package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Compare_2url 
{

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
        driver.manage().window().maximize();   
        String title = driver.getTitle();
		System.out.println(title);
		
		
        driver.get("https://www.flipkart.com");
		driver.manage().window().maximize(); 
        String title2 = driver.getTitle();
		System.out.println(title2);
		
		driver.close();
		
		
		if(title.equals(title2)) 
		{
			System.out.println("Both the title are same");
		}
		else 
		{
			System.out.println("Both the title are different");
        }
	}
}
