package hndlingDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameDemo {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		driver.switchTo().frame("frame-top").switchTo().frame("frame-left");
		//driver.switchTo().frame("frame-left");
		String text=driver.findElement(By.xpath("//body[normalize-space()='LEFT']")).getText();
		
		System.out.println(text);
		
		driver.switchTo().defaultContent();//parent frame
		driver.switchTo().frame("frame-top").switchTo().frame("frame-middle");
		//driver.switchTo().frame("frame-middle");
		String text2=driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText();
		System.out.println(text2);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-top").switchTo().frame("frame-right");
		
		String text3=driver.findElement(By.xpath("//body[normalize-space()='RIGHT']")).getText();
		System.out.println(text3);
		
		//bottom
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-bottom");
		System.out.println(driver.getPageSource());
		
	}

}
