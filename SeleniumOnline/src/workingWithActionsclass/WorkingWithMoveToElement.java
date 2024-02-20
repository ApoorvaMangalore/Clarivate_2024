package workingWithActionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithMoveToElement {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Actions actions = new Actions(driver);
		WebElement computers = driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
		actions.moveToElement(computers).perform();
		Thread.sleep(3000);
		WebElement notebooks = driver.findElement(By.xpath("//a[contains(text(),'Notebooks')]"));
		actions.click(notebooks).build().perform();
		Thread.sleep(3000);
		driver.quit();
	}
}
