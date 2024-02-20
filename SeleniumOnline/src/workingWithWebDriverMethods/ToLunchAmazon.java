package workingWithWebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetPageSource;

public class ToLunchAmazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("User is able to to maximize");
		Thread.sleep(3000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		System.out.println("User is able to open amazon ");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String titleOfThepage = driver.getTitle();
		System.out.println(titleOfThepage);
		String getPageSource = driver.getPageSource();
		System.out.println(getPageSource);

		// driver.close();
		driver.quit();

	}

}
