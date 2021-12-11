package SleniumCHromBrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserWithFindElementMethod
{

            static WebDriver driver;
			
			public static void lanunchBrowser()
			{
				System.setProperty("webdriver.chrome.driver", "F:\\Sonali Testing Course\\Downloads\\chromedriver_96.exe");
				 driver = new ChromeDriver();

			}
			
			public static void openApplicationUrl()
			{
				driver.get("file:///F:/Sonali%20Testing%20Course/Sample.html");
			}
			
			public static void FindWebElements()
			{
				WebElement usernameLbl = driver.findElement(By.name("Username"));
				System.out.println(usernameLbl.getText());
				
				driver.findElement(By.tagName("input")).sendKeys("String Format");
			}

			public static void main(String []args)
			{
				lanunchBrowser();
				openApplicationUrl();
				FindWebElements();
			
				
	}

}
