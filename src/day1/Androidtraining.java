package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Androidtraining 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/Android-training-institute-Chennai.html");

		driver.manage().window().maximize();   

		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getTitle());

	}

}
