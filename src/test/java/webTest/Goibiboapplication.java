package webTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibiboapplication {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/flights/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[1]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("p");
		Thread.sleep(2000);
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//li//span[@class='autoCompleteTitle ']"));
		System.out.println("Total options are: "+list.size());
		
		for(WebElement i:list)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Paris, France"))
			{
				i.click();
				break;
			}
		}
		
		
		
		
	}

}
