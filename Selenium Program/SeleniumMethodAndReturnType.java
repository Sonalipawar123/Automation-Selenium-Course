package SleniumCHromBrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethodAndReturnType {
	
	static WebDriver driver;

	public static void lanunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Sonali Testing Course\\Downloads\\chromedriver_96.exe");
		 driver = new ChromeDriver();

	}
	
	public static void openApplicationUrl()
	{
		driver.get("https://www.facebook.com/");
	}
	
//	public static void getMethod()
//	{
		
	//}
	
	public static String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public static String getCurrentUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public static String getPageSource()
	{
		return driver.getPageSource();
	}

	
   public static void BacknavigationOperation()
	{
		driver.navigate().back();
	}

   
	public static void main(String[] args) {

		lanunchBrowser();
		openApplicationUrl();
	//	getMethod();
		getPageTitle();
		getCurrentUrl();
		getPageSource();
		BacknavigationOperation();
		
	}

}
