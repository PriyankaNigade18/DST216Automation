package mouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_onmouseover");

		driver.switchTo().frame("iframeResult");
		
		WebElement sml=driver.findElement(By.xpath("//img[@alt='Smiley']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(sml).perform();
		
	}

}
