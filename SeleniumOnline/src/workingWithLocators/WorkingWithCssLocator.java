package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCssLocator {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("Health Book");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
