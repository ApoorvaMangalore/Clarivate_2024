package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClassLocator {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().fullscreen();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.className("forcheckbox")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}