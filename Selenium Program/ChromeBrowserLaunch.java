package SleniumCHromBrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLaunch {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Sonali Testing Course\\Downloads\\chromedriver_96.exe");
		WebDriver driver = new ChromeDriver();
	}

}
