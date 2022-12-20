package generic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility
{
	public static WebElement waitForPresenceOfElement(WebDriver driver,By loc)
	{
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		  return wait.until(ExpectedConditions.presenceOfElementLocated(loc));
	}
	
	public static WebElement waitforElementClickable(WebDriver driver,By loc)
	{		 
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.elementToBeClickable(loc));
	}
	
	
	public static boolean waitForUrlcontains(WebDriver driver,String url)
	{
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		  return wait.until(ExpectedConditions.urlContains(url));
	}
	
	public static WebElement waitforVisibilityOfEle(WebDriver driver,By loc)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		  return wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
	}
	
	
	
	
	public static void selectBaseDropdown(WebElement ele,String value)
	{
		Select daysc=new Select(ele);
		System.out.println("Is drop down support multiple selection?: "+daysc.isMultiple());
		//all options
		List<WebElement> alloptions=daysc.getOptions();
		System.out.println("Total elements from Dropdown are: "+alloptions.size());
		
		for(WebElement i:alloptions)
		{
			System.out.println(i.getText());
			if(i.getText().equals(value))
			{
				i.click();
				break;
			}
		}
	}
	
	
	
	
	public static void scrollDown(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}

	public static void scrollUp(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		
	}
	
	
	
}
