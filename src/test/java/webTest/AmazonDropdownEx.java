package webTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import generic.Utility;

public class AmazonDropdownEx {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		
		//identification of drop down
		WebElement ddele=driver.findElement(By.id("searchDropdownBox"));
		Utility.selectBaseDropdown(ddele,"Baby");
		
		
		
		/*
		//Select class from selenium
		
		Select sc=new Select(ddele);
		System.out.println("Is drop down support multiple selection?:"+sc.isMultiple());
		
		//single selection
		sc.selectByIndex(1);
		Thread.sleep(2000);
		sc.selectByValue("search-alias=beauty");
		Thread.sleep(2000);
		sc.selectByVisibleText("Gift Cards");
		
		//All options - total count /print
		List<WebElement> allOptions=sc.getOptions();
		
		System.out.println("Total options are: "+allOptions.size());
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
			if(i.getText().equals("Software"))
			{
				i.click();
				System.out.println("Match found ....test pass");
				break;
			}
		}
		
		*/
		
		

	}

}
