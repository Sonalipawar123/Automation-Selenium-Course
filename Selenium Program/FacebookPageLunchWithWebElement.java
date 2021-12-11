package SleniumCHromBrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookPageLunchWithWebElement {
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
    	public static void facabookhandWebElement()
		{
			 WebElement email = driver.findElement(By.id("email")); 
			 WebElement password =driver.findElement(By.name("pass"));
			 
			 email.sendKeys("selenium@gmail.com");
			 password.sendKeys("seleniumjava1");
			 System.out.println("Text Field Set");
			 WebElement login =driver.findElement(By.className("u_0_d_Pj"));
			 email.sendKeys("selenium@gmail.com");
			 password.sendKeys("seleniumjava1");
             login.click();
             System.out.println("Login Done with Click");
               driver.get("https://www.facebook.com/");
               driver.findElement(By.id("email1")).sendKeys("selenium@gmail.com");
               driver.findElement(By.name("password")).sendKeys("seleniumjava1");
               driver.findElement(By.id("SubmitLogin")).submit();
               System.out.println("Login Done with Submit");
		}
	     public static void main(String[] args) {
			lanunchBrowser();
			openApplicationUrl();
			facabookhandWebElement();
	}

}
