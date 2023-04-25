package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Reactnativetraining 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/react-native-training-in-chennai.html");

		driver.manage().window().maximize();   

		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getTitle());

	}

}
