package hndlingDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingDemo1 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/iframe");
		//driver.switchTo().frame(0);
		
		//driver.switchTo().frame("mce_0_ifr");
		
		//By fid=By.id("mce_0_ifr");
		WebElement fele=driver.findElement(By.id("mce_0_ifr"));
		
		driver.switchTo().frame(fele);
		
		By para=By.xpath("//p[text()='Your content goes here.']");
		WebElement ele=driver.findElement(para);
		Thread.sleep(2000);
		ele.clear();
		ele.sendKeys("Hello All");

	}

}
