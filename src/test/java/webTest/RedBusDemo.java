package webTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusDemo {

	public static void main(String[] args) throws InterruptedException 
	{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.redbus.in/");
			
			/*
			driver.findElement(By.id("src")).sendKeys("Pune");
			Thread.sleep(2000);
			List<WebElement> allOptions=driver.findElements(By.xpath("//ul[contains(@class,'autoFill')]//li"));
			System.out.println("Total Options: "+allOptions.size());
			
			for(WebElement i:allOptions)
			{
				System.out.println(i.getText());
				if(i.getText().equals("Kharadi, Pune"))
				{
					i.click();
					break;
				}
			}
			
	//To
			driver.findElement(By.id("dest")).sendKeys("Delhi",Keys.ENTER);
			
			*/
			//Calendar
			driver.findElement(By.id("onward_cal")).click();
			
			//Expected date,month year
			String date="30";
			String month="Apr";
			String year="2023";
			
			//Month selection		
			while(true)
			{
				String text=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
				System.out.println(text);
				String mon=text.split(" ")[0];
				String yer=text.split(" ")[1];
				
				System.out.println(mon);
				System.out.println(yer);
				
				if(mon.equals(month) && yer.equals(year))
				{
					break;
				}else
				{
					driver.findElement(By.xpath("//button[text()='>']")).click();
				}
				//break;
				
			}
			
			//date selection
			List<WebElement> dates=driver.findElements(By.xpath("//table//tbody//tr//td"));
			
			for(WebElement i:dates)
			{
				System.out.println(i.getText());
				if(i.getText().contains(date))
				{
					i.click();
					break;
				}
			}
			
			
			
			
			
			
			
			
			
			
			
	}

}
