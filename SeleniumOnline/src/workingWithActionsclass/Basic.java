package workingWithActionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basic {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.simplilearn.com/");
		WebDriverWait wait=new WebDriverWait(driver, 30);
	
		driver.findElement(By.xpath("//a[text()=' Log in']")).click();
		//driver.findElement(By.linkText("Sign Up")).click();
		driver.findElement(By.xpath("//span[text()='Sign Up with Email']")).click();
		driver.findElement(By.name("firstName")).sendKeys("Apoorva");
		driver.findElement(By.name("lastName")).sendKeys("mangalore");
		driver.findElement(By.name("user_email")).sendKeys("apoorvau@gmail.com");
		WebElement selectTag = driver.findElement(By.id("country_code"));
		Select select=new Select(selectTag );
		select.selectByValue("IN");
		driver.findElement(By.name("phone_no")).sendKeys("9876543210");
		driver.findElement(By.id("password")).sendKeys("Aa1!2345b");
		driver.findElement(By.name("TnCCheckbox")).click();
		driver.findElement(By.id("btn_register")).click();
		driver.get("https://lms.simplilearn.com/dashboard/skillup-oob/onboarding");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Female']")).click();
		
	}
}
