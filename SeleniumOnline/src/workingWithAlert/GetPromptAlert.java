package workingWithAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPromptAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("apoorva");
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(3000);
		driver.quit();
	}

}
