package SleniumCHromBrowserLaunch;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLaunchWithMethod {
	
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
	
	public static void closeBrowser()
	{
		//driver.close(); -close the current window tab
		driver.quit();   // close allwindow tab/discard the webdriver object
	}

	public static void webApplicationValidation()
	{
		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";
		if(actualTitle.equals(expectedTitle))
			System.out.println("Application title is equal to expectedd title");
		else
			System.out.println("Application title is not equals to expected title [Actual Title = "+actualTitle +"]");
	}
	
	public static void getCurrentUrlAndPageSource()
	{
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL = "+currentUrl);
		
		String pageSource = driver.getPageSource();
		System.out.println("Page Source = "+pageSource);
	}
	public static void navigationOperation()
	{
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		driver.navigate().to("https://www.flipkart.com/");
}
	public static void manageOperation()
	{
	//	driver.manage().window().maximize();
	//	driver.manage().window().fullscreen();
		
		System.out.println("Size of window before maximize=" +driver.manage().window().getPosition());
		
		Point point= new Point(500,400);
		driver.manage().window().setPosition(point);
		
		System.out.println("Size of window after maximize=" +driver.manage().window().getPosition());
       
		System.out.println(driver.manage().getCookies());
		driver.manage().deleteAllCookies();
		System.out.println("After delete method = " +driver.manage().getCookies());
		
		Cookie cookie = new Cookie("Cookie1", "AMCV_17EB401053DAF4840A4904C%40AdobeOrg");
		driver.manage().addCookie(cookie);
		System.out.println("After add method = " +driver.manage().getCookies());
      

	}

	public static void main(String[] args)
	{
		lanunchBrowser();
		openApplicationUrl();
		webApplicationValidation();
		getCurrentUrlAndPageSource();
		closeBrowser();
		navigationOperation();
		manageOperation();
	}

}
