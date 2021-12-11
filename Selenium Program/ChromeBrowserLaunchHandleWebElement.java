package SleniumCHromBrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLaunchHandleWebElement {


		
		
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
			
			public static void handWebElement()
			{
				 WebElement usernameLbl = driver.findElement(By.name("Username"));
				 String usernameTxt = usernameLbl.getText();
				 System.out.println(usernameTxt);
				 
				 driver.findElement(By.tagName("input")).sendKeys("selenium");
				 
				 driver.findElement(By.id("456")).sendKeys("selenium@123");
				 
				 driver.findElement(By.className("password #123")).clear();
		
			}

		
			public static void main(String[] args) {
				lanunchBrowser();
				openApplicationUrl("file:///F:/Sonali%20Testing%20Course/Sample.html");
				handWebElement();
	}

}
