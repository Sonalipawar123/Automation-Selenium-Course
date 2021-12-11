package SleniumCHromBrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookPageLaunchSignUpPage {
	static WebDriver driver;

	public static void lanunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\Sonali Testing Course\\Downloads\\chromedriver_96.exe");
		driver = new ChromeDriver();
	}

	public static void openApplicationUrl(String Url) {
		driver.get(Url);
	}
	
	public static void signUpFacebook() {
		String firstName = "Sample";
		String surName = "test";
		String mobileNumber = "1234567890";
		String password = "1234567890";
		
		driver.findElement(By.cssSelector("a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		try {
			Thread.sleep(3500);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		WebElement inputFirstName = driver.findElement(By.cssSelector("input[name='firstname']"));
		WebElement inputSurName = driver.findElement(By.cssSelector("input[name='lastname']"));
		WebElement inputEmail = driver.findElement(By.cssSelector("input[name='reg_email__']"));
		WebElement inputNewPass = driver.findElement(By.cssSelector("input[name='reg_passwd__']"));
		
		inputFirstName.sendKeys(firstName);
		inputSurName.sendKeys(surName);
		inputEmail.sendKeys(mobileNumber);
		inputNewPass.sendKeys(password);
		
	}
	
	
	
	
	public static void main(String[] args) {
		lanunchBrowser();
		openApplicationUrl("https://www.facebook.com/");
		signUpFacebook();
	}

}
