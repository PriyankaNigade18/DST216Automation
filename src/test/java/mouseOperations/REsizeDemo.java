package mouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class REsizeDemo {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement ele=driver.findElement(By.xpath("//div[contains(@class,' ui-resizable-se ')]"));

		Actions act=new Actions(driver);
		act.moveToElement(ele).dragAndDropBy(ele, 200, 100).build().perform();		
		
		
		
		
		
		
	}

}
