package day16;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();	
		
		WebElement table = driver.findElement(By.id("customers"));
		
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		int length = allRows.size()-1;
		System.out.println("length--->"+length);
		
		System.out.println("firstRow--->"+allRows.get(1).getText());
		
		System.out.println("lastRow--->"+allRows.get(length).getText());
		
		WebElement secondRow = allRows.get(2);
		System.out.println("secondRow--->"+secondRow.getText());
		
		List<WebElement> lastDatas = secondRow.findElements(By.tagName("td"));
		System.out.println("lastDatas--->"+lastDatas.get(2).getText());
		
		for (WebElement data:lastDatas) {
			String name = data.getText();
			System.out.println("name---->"+name);
		}
			
	}

}
