package SleniumCHromBrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLinkLocatorMethod {
	
   static WebDriver driver;
	
	public static void lanunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Sonali Testing Course\\Downloads\\chromedriver_96.exe");
		 driver = new ChromeDriver();

	}
	
	public static void openApplicationUrl(String url)
	{
		driver.get(url);
	}

	public static void clickOnLink()
	{
	//driver.findElement(By.linkText(" click here")).click();
	driver.findElement(By.partialLinkText("click")).click();
	
	}

	
	public static void main(String []args)
	{
		lanunchBrowser();
		openApplicationUrl("http://demo.guru99.com/test/link.html");
		clickOnLink();
		

	}
	}



