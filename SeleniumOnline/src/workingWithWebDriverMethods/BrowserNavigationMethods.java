package workingWithWebDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationMethods {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("User is able to to maximize");
		Thread.sleep(3000);
		// driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		// driver.get("https://demowebshop.tricentis.com/");

		driver.navigate().to(new URL("https://demowebshop.tricentis.com/"));

		Thread.sleep(3000);
		driver.navigate().back();// amazon
		Thread.sleep(3000);
		driver.navigate().forward();// demowebshop
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.quit();
	}
}
