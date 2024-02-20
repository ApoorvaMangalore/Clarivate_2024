package workingWithFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoPage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(3000);
		// driver.switchTo().frame(0);//by index
		// driver.switchTo().frame("navbar-iframe");//string value
		WebElement frameEle = driver.findElement(By.id("navbar-iframe"));
		driver.switchTo().frame(frameEle);
		driver.findElement(By.id("b-query")).sendKeys("apoorva");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector("input[name='fname']")).clear();
		Thread.sleep(3000);
		driver.quit();

	}

}
