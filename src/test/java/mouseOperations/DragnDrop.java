package mouseOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args)
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://jqueryui.com/droppable/#default");
	driver.manage().window().maximize();

	
	driver.switchTo().frame(0);
	WebElement src=driver.findElement(By.id("draggable"));
	WebElement tar=driver.findElement(By.id("droppable"));
	
	Actions act=new Actions(driver);
	//act.clickAndHold(src).moveToElement(tar).release().build().perform();
	act.dragAndDrop(src, tar).build().perform();
	
	
	
	
	
	
	
	
	}

}
