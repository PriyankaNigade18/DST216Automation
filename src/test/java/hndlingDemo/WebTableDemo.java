package hndlingDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		
		//signin
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password")).sendKeys("1234");
		driver.findElement(By.id("submit-id")).click();
		
		//web table
		
		System.out.println("******************capture headings***************");
		List<WebElement> heading=driver.findElements(By.xpath("//table//thead//tr//th"));
		System.out.println("Total headings are: "+heading.size());
		
		for(WebElement i:heading)
		{
			System.out.println(i.getText());
		}
		
		//count total rows
		System.out.println("******************Total number of rows***************");
		List<WebElement> rows=driver.findElements(By.xpath("//table//tbody//tr"));
		
		System.out.println("Total rows are: "+rows.size());
		
		//count total column
		System.out.println("******************Total number of columns***************");
		List<WebElement> cells=driver.findElements(By.xpath("//table//tbody//tr[1]//td"));
		
		System.out.println("Total columns are: "+cells.size());
		
		//print any specific row
		
		System.out.println("******************Print specific row***************");
		
		List<WebElement> rowdata=driver.findElements(By.xpath("//table//tbody//tr[4]//td"));
		for(WebElement i:rowdata)
		{
			System.out.print(i.getText()+" ");
		}
		
		//print any specific coulmn
		
		System.out.println("******************Print specific column***************");
		List<WebElement> allfirstname=driver.findElements(By.xpath("//table//tbody//tr//td[2]"));
		
		for(WebElement i:allfirstname)
		{
			System.out.println(i.getText());
		}
		
		
		//To iterate complete table
		System.out.println("********Complete table infomartion******");
		
		List<WebElement> alldata=driver.findElements(By.xpath("//table//tbody//tr//td"));
		
		for(WebElement i:alldata)
		{
			System.out.print(i.getText()+" ");
			//System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
