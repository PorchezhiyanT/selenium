package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Flutter_and_dart_training 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/flutter-and-dart-training-in-chennai.html");

		driver.manage().window().maximize();   

		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getTitle());
	}

}
