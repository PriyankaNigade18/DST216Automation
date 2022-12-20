package hndlingDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		//alert
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		System.out.println("Text of alert is: "+alt.getText());
		alt.accept();//ok
		
		
		driver.findElement(By.id("login1")).sendKeys("Priyanka");
		
		
		

	}

}
