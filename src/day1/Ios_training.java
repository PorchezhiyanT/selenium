package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Ios_training 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/apple-ios-training-in-chennai.html");

		driver.manage().window().maximize();   

		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getTitle());
	}

}
