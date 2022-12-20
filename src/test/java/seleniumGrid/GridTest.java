package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTest {
  @Test
  public void chromeTest() throws MalformedURLException, InterruptedException 
  {
	  ChromeOptions cap=new ChromeOptions();
	 System.out.println("Test is connection remotly");
	  
	  WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/"),cap);
	  Thread.sleep(10000);
	  driver.get("https://www.amazon.in");
	  System.out.println("Application title: "+driver.getTitle());
	  
	  
	  
  }
}
