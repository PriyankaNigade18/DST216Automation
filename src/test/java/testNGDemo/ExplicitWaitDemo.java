package testNGDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import generic.Utility;

public class ExplicitWaitDemo
{
	
  public static void main(String args[])
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
	  
	  //By locator
	  By emailid=By.name("email");
	  By psw=By.name("password");
	  By loginbtn=By.xpath("//button[@type='submit']");
	  
//	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//	 // wait.until(ExpectedConditions.presenceOfElementLocated(emailid));
//	  wait.until(ExpectedConditions.elementToBeClickable(loginbtn));
//	  
	  
//	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//	  wait.until(ExpectedConditions.urlContains("opencart"));
	  
	  System.out.println("Is url contains demo?: "+Utility.waitForUrlcontains(driver,"demo"));
	  
	  
	  WebElement email=Utility.waitForPresenceOfElement(driver,emailid);
	  email.sendKeys("test123@gmail.com");
	  
//	  Utility.waitForPresenceOfElement(driver,psw).sendKeys("test123");
//	  
//	  Utility.waitforElementClickable(driver,loginbtn).click();
	  
	  //driver.findElement(emailid).sendKeys("test@gmail.com");
	  
	  Utility.waitforVisibilityOfEle(driver, psw).sendKeys("test123");
//	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(psw)).sendKeys("test123");
	  
	  //TimeoutException: Expected condition failed: waiting for visibility of element located by By.name: 
	  //password111 (tried for 10 second(s) with 500 milliseconds interval
	  //interval time =polling time
	  
	  
	  
	  
	  
	  
  }
}
