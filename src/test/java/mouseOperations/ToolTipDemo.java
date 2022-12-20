package mouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import generic.Utility;

public class ToolTipDemo {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollTo(0,500)");
		//Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement ele=driver.findElement(By.id("age"));
				
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(ele).perform();
		
		String text=driver.findElement(By.xpath("//div[@class='ui-tooltip-content']")).getText();
		
		System.out.println(text);
		
		

	}

}
