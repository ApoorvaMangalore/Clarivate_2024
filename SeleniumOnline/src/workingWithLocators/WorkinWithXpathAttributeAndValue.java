package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkinWithXpathAttributeAndValue {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.xpath("//input[@value='Search store']")).sendKeys("books");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.quit();
	}
}
