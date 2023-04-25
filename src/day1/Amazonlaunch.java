package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonlaunch 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");

		driver.manage().window().maximize();   

		String title = driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().minimize();
		
		
		driver.manage().window().maximize();  
		
		driver.get("https://www.flipkart.com");	 

		String title2 = driver.getTitle();
		System.out.println(title2);
		
		if(title.equals(title2)) {
			System.out.println("Both the title are same");
		}
		
		else {
			System.out.println("Both the title are different");
			
		}
		
		//System.out.println(driver.getTitle());
	}

}
