package workingWithJavaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// ChromeDriver driver=new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor jse=(JavascriptExecutor )driver;
		
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,500)");
	}
}
