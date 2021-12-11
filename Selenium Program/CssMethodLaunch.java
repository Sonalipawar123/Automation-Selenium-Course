package SleniumCHromBrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssMethodLaunch {

	static WebDriver driver;

	public static void lanunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\Sonali Testing Course\\Downloads\\chromedriver_96.exe");
		driver = new ChromeDriver();

	}

	public static void openApplicationUrl(String Url) {
		driver.get(Url);
	}

	public static void handleWebElement() {
		// Sign in Window close
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();

		WebElement searchBar = driver.findElement(By.cssSelector("input[name='q']"));
		Point placeholder = searchBar.getLocation();
		System.out.println("Search input Location of X: " + placeholder.getX() + "," + " Y: " + placeholder.getY());

		Dimension size = searchBar.getSize();
		System.out.println("Search input Width: " + size.getWidth() + "," + " Height :" + size.getHeight());

		Rectangle rect = searchBar.getRect();
		System.out.println("X-Axis - " + rect.x); // from left top corner of element
		System.out.println("Y-Axis - " + rect.y);
		System.out.println("Element Width - " + rect.width);
		System.out.println("Element Height - " + rect.height);
	}

	public static void main(String[] args) {
		lanunchBrowser();
		openApplicationUrl("https://www.flipkart.com/");
		handleWebElement();

	}

}
