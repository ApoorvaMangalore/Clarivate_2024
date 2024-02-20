package workingWithJavaScript;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// ChromeDriver driver=new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("alert('Good eve')");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

		jse.executeScript("prompt('hello')");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

		jse.executeAsyncScript("confirm('okkk')");
		driver.switchTo().alert().accept();
		Thread.sleep(3000);

		driver.quit();
	}

}
