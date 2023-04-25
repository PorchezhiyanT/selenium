package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex_2 
{

	public static void main(String[] args) throws InterruptedException       //  PRINT ALL TEXT OPTIONS YEARS
	{
		System.setProperty("WebDriver.chrome.driver",
				"E:\\Eclipse\\selenium\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();            
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle( );                     
		System.out.println(title);

		WebElement createaccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));          
		createaccount.click();

		Thread.sleep(2000);

		WebElement kyear = driver.findElement(By.id("year"));
		kyear.click();
		Select selectobj = new Select(kyear);

		List<WebElement> options = selectobj.getOptions();
		System.out.println("Total months size " + options.size());

		int i=1;
		for(WebElement o : options)
		{
			System.out.println(i+"."+o.getText());
			i++;
		}

	}

}
