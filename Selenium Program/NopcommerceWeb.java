package SleniumCHromBrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NopcommerceWeb extends SeleniumMethodAndReturnType {
   static WebDriver driver;

	public static void lanunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\Sonali Testing Course\\Downloads\\chromedriver_96.exe");
		driver = new ChromeDriver();
	}

	public static void openApplicationUrl(String Url) {
		driver.get(Url);
	}
	
	

	public static void main(String[] args) {
		lanunchBrowser();
		openApplicationUrl("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FProduct%2FList");
		
		
		WebElement emailField= driver.findElement(By.xpath("//input[contains(@class,'email')]"));
		clearText(emailField);
		sendKeys(emailField,"admin@yourstore.com");
		
		WebElement passwordFiled= driver.findElement(By.xpath("//input[contains(@class,'password')]"));
		clearText(passwordFiled);
		sendKeys(passwordFiled,"admin");

		WebElement RememberMeFiled= driver.findElement(By.xpath("//input[contains(@id,'RememberMe')]"));
		RememberMeFiled.click();
		
		WebElement LoginButtonFiled = driver.findElement(By.xpath("//button[contains(@class,'button-1')]"));
		LoginButtonFiled.click();
		
	}

}
