package hndlingDemo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDemo1 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//parent window
		String Pid=driver.getWindowHandle();
		System.out.println(Pid);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		//child window
		Set<String> allWindows=driver.getWindowHandles();
		System.out.println(allWindows);
		
		for(String childid:allWindows)//[101,201]
		{
			if(!Pid.equals(childid))
			{
				driver.switchTo().window(childid);
				driver.findElement(By.id("myText")).sendKeys("test@gmail.com");
				//driver.close();//current open window
				//driver.quit();//close all windows
			}
			
		}
		
		//parent window
		driver.switchTo().window(Pid);
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		
		

	}

}
