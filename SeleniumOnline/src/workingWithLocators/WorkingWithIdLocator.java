package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIdLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("aaaaa");
		Thread.sleep(3000);
		String firstnameTextBox = firstName.getAttribute("value");
		System.out.println(firstnameTextBox);//Apoorva
		firstName.clear();
		Thread.sleep(3000);
		firstName.sendKeys("bhoomika");
		String firstnameTextBox2 = firstName.getAttribute("value");
		System.out.println(firstnameTextBox2);//bhoomika
		driver.findElement(By.id("LastName")).sendKeys("mangalore");
		Thread.sleep(3000);
		driver.quit();
	}
}
