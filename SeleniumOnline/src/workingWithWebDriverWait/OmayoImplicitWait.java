package workingWithWebDriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoImplicitWait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://omayo.blogspot.com/");
		System.out.println("omayo");
		driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
		System.out.println("dropdown");
		//Thread.sleep(3000);
		driver.findElement(By.linkText("Flipkart")).click();
		System.out.println("Flipkart");
		driver.quit();
	}
}
