package day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Five_url_chek 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
        driver.manage().window().maximize();   
        String title = driver.getTitle();
		System.out.println(title);
		
		
        driver.get("https://www.flipkart.com");
		driver.manage().window().maximize(); 
        String title2 = driver.getTitle();
		System.out.println(title2);
		
		driver.get("https://www.facebook.com");
        driver.manage().window().maximize();   
        String title3 = driver.getTitle();
		System.out.println(title);
		
		
        driver.get("https://www.twitter.com");
		driver.manage().window().maximize(); 
        String title4 = driver.getTitle();
		System.out.println(title2);
		
		driver.get("https://www.ajio.com");
		driver.manage().window().maximize(); 
        String title5 = driver.getTitle();
		System.out.println(title2);
	}

}
