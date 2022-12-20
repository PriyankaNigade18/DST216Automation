package mouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		WebElement ele=driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle ')]"));
		
		Actions act=new Actions(driver);
		act.clickAndHold(ele).moveToElement(ele,300,0).build().perform();
		
		
		
		

	}

}
