package workingWithActionsclass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithKeyBoardActions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		driver.get("https://demowebshop.tricentis.com/");
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(3000);
		actions.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(3000);
		actions.sendKeys(Keys.SPACE).perform();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
