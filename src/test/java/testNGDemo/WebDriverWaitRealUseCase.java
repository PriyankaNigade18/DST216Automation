package testNGDemo;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import generic.Utility;


//WebDriverWait(C) extends FluentWait(C) implements Wait(I)
public class WebDriverWaitRealUseCase {
  @Test
  public void dynamicLoading()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	
	  By btn=By.xpath("//button[text()='Start']");
	  By text=By.xpath("//h4[text()='Hello World!']");
	  
	  driver.findElement(btn).click();
//	  
//	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(text));
	  
	  
	 // Utility.waitforVisibilityOfEle(driver, text);
	  
	  //fluentWait
	  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			  .withTimeout(Duration.ofSeconds(10))
			  .pollingEvery(Duration.ofSeconds(2))
			  .ignoring(NoSuchElementException.class);

			wait.until(ExpectedConditions.visibilityOfElementLocated(text));
	  
	  
	  String textofele=driver.findElement(text).getText();
	  System.out.println(textofele);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
