package workingWithWebDriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OmayoExplicitwait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,25);
		
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
		//WebElement flipkart = driver.findElement(By.xpath("//a[text()='Flipkart']"));
		//wait.until(ExpectedConditions.visibilityOf(flipkart));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Flipkart']")));
	    driver.findElement(By.linkText("Flipkart")).click();
		driver.quit();

	}
}
