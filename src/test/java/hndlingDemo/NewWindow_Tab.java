package hndlingDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow_Tab {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		for(int i=1;i<=10;i++)
		{
		WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
		newTab.get("https://www.amazon.in");
		}
		
		WebDriver newWindow=driver.switchTo().newWindow(WindowType.WINDOW);
		newWindow.get("https://www.facebook.com");
	}

}
