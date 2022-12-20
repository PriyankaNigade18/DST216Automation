package webTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import generic.Utility;

public class FacebookDropdownEx
{
	
	

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();

		//day
		WebElement daydd=driver.findElement(By.id("day"));
		Utility.selectBaseDropdown(daydd,"27");
		
		//month
		WebElement mondd=driver.findElement(By.id("month"));
		Utility.selectBaseDropdown(mondd,"Dec");
		
		//year
		WebElement yerdd=driver.findElement(By.id("year"));
		Utility.selectBaseDropdown(yerdd,"2010");
		
		
		
		
		
		
		
//		Select daysc=new Select(daydd);
//		System.out.println("Is drop down support multiple selection?: "+daysc.isMultiple());
//		//all options
//		List<WebElement> alloptions=daysc.getOptions();
//		System.out.println("Total elements from Dropdown are: "+alloptions.size());
//		
//		for(WebElement i:alloptions)
//		{
//			System.out.println(i.getText());
//			if(i.getText().equals("27"))
//			{
//				i.click();
//				break;
//			}
//		}
		
		
		
		//Select sc=new Select(mondd);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
