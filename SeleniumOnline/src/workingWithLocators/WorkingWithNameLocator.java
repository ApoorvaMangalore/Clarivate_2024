package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNameLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().fullscreen();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/register");
		//driver.findElement(By.name("Gender")).click();
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("FirstName")).click();
		driver.findElement(By.name("LastName")).click();
		driver.quit();
	}
}
