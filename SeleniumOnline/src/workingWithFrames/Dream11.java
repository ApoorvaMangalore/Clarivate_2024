package workingWithFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dream11.com/");
		// driver.switchTo().frame(0);
		// WebElement frame1 = driver.findElement(By.id("send-sms-iframe"));
		// driver.switchTo().frame(frame1);

		driver.switchTo().frame("send-sms-iframe");
		driver.findElement(By.id("regEmail")).sendKeys("12345678787");
		driver.quit();

	}
}
