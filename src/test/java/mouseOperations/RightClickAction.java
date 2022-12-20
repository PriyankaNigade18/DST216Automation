package mouseOperations;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/context_menu");
		
		WebElement ele=driver.findElement(By.id("hot-spot"));
		
		
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
				
		Alert alt=driver.switchTo().alert();
		System.out.println("Alert message: "+alt.getText());

		alt.accept();
		
		
		
		
		
		
	}

}
