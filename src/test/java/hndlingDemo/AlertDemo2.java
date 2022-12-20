package hndlingDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AlertDemo2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Thread.sleep(2000);
		//alert
		Alert alt1=driver.switchTo().alert();
		
		System.out.println("Alert text is: "+alt1.getText());
		alt1.accept();
		String res=driver.findElement(By.id("result")).getText();
		System.out.println(res);
		
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		Alert alt2=driver.switchTo().alert();		
		System.out.println("Alert text is: "+alt2.getText());
		alt2.dismiss();//cancel
		String res1=driver.findElement(By.id("result")).getText();
		System.out.println(res1);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		Alert alt3=driver.switchTo().alert();	
		
		System.out.println("Text of alert is: "+alt3.getText());
		alt3.sendKeys("Hello All");
		alt3.accept();
		
		String res3=driver.findElement(By.id("result")).getText();
		System.out.println(res3);
		
		
		
		
		
		
	}

}
