package SleniumCHromBrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorForSearchBar {
	
static WebDriver driver;
	
	public static void lanunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Sonali Testing Course\\Downloads\\chromedriver_96.exe");
		 driver = new ChromeDriver();

	}
	
	public static void openApplicationUrl(String Url)
	{
		driver.get(Url);
	}
	
	public static void handleWebElement()
	{
		
	         driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
	         String placeholder=driver.findElement(By.cssSelector("input[name='q']")).getAttribute("placeholder");
             System.out.println("Actual Placeholder :" +placeholder);
	}
	public static void main(String[] args)
	{
		lanunchBrowser();
		openApplicationUrl("https://www.flipkart.com/");
		handleWebElement();


	}

}
