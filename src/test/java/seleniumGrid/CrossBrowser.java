package seleniumGrid;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class CrossBrowser
{
	WebDriver driver;
  @Test
  @Parameters({"bname"})
  public void ctest(String bname) throws MalformedURLException, InterruptedException 
  {
	  if(bname.equalsIgnoreCase("chrome"))
	  {
		  ChromeOptions cap=new ChromeOptions();
			 System.out.println("Test is connection remotly");
			  driver=new RemoteWebDriver(new URL("http://localhost:4444/"),cap);
			
		  
	  }else if(bname.equalsIgnoreCase("firefox"))
	  {
		  FirefoxOptions cap=new FirefoxOptions();
		 System.out.println("Test is connection remotly");
		 driver=new RemoteWebDriver(new URL("http://localhost:4444/"),cap);
		
		  
	  }else if(bname.equalsIgnoreCase("edge"))
	  {
		  EdgeOptions cap=new EdgeOptions();
			 System.out.println("Test is connection remotly");
			 driver=new RemoteWebDriver(new URL("http://localhost:4444/"),cap);
			  
	  }
	  
	  Thread.sleep(10000);
	  driver.get("https://www.google.com");
	  System.out.println(driver.getTitle());
	  
  }
}
