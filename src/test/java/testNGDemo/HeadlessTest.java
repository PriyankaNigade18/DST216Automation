package testNGDemo;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HeadlessTest
{
	@Test
	public void headlessTest() throws InterruptedException
	{
		ChromeOptions cr=new ChromeOptions();
		cr.setHeadless(true);
		WebDriver driver=new ChromeDriver(cr);
		driver.get("https://www.google.com");
		System.out.println("Title is: "+driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li//div[contains(@class,'wM6W7d')]//span"));
		
		
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
	}
	
	
	
	
	
	
  //@Test
  public void capabilityTest()
  {
	  ChromeDriver driver=new ChromeDriver();
	 Capabilities cap= driver.getCapabilities();
	 
	 System.out.println(cap.getBrowserName());
	 System.out.println(cap.getBrowserVersion());
	 System.out.println(cap.getPlatformName());
	 //To get all properties
	 
	 Map<String,Object> map=cap.asMap();
	 System.out.println(map);
	 /*
	  * {acceptInsecureCerts=false, browserName=chrome,
	  *  browserVersion=108.0.5359.99, 
	  *  chrome={chromedriverVersion=108.0.5359.71 (1e0e3868ee06e91ad636a874420e3ca3ae3756ac-refs/branch-heads/5359@{#1016}), userDataDir=C:\Users\Ganes\AppData\Local\Temp\scoped_dir19644_1932851995},
	  *   goog:chromeOptions={debuggerAddress=localhost:57740}, 
	  *   networkConnectionEnabled=false, 
	  *   pageLoadStrategy=normal, platformName=WINDOWS,
	  *    proxy=Proxy(), 
	  *    se:cdp=ws://localhost:57740/devtools/browser/52fd3d99-ded9-460c-aa43-951568c92869, se:cdpVersion=108.0.5359.99, 
	  *    setWindowRect=true, strictFileInteractability=false, 
	  *    timeouts={implicit=0, pageLoad=300000, script=30000},
	  *     unhandledPromptBehavior=dismiss and notify,
	  *      webauthn:extension:credBlob=true, 
	  *      webauthn:extension:largeBlob=true,
	  *       webauthn:virtualAuthenticators=true}

	  */
	 
  }
}
