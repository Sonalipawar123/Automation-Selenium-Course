package SleniumCHromBrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorMethod {
    
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
        String product = "Laptop Bag";
	   driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
	   WebElement searchBar = driver.findElement(By.cssSelector("input[name='q']"));
	   String placeholder = searchBar.getAttribute("placeholder");
       System.out.println("Actual Placeholder :"+placeholder);
       
	   searchBar.sendKeys(product);
	   String attributeValue = searchBar.getAttribute("value");
	   System.out.println("value :" +attributeValue);
	   
	   // Another New Funtionality 
	   String fontfamily = searchBar.getCssValue("font-family");
	   System.out.println("font-family : " +fontfamily);
	   

	   driver.findElement(By.cssSelector("button[class='L0Z3Pu']")).click();

	}
	public static void main(String[] args) {

		lanunchBrowser();
		openApplicationUrl("https://www.flipkart.com/");
		handleWebElement();

		
	}

}
