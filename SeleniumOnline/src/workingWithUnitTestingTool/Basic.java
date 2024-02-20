package workingWithUnitTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Basic {
	WebDriver driver;

	@Test(invocationCount = 4, threadPoolSize = 4)
	public void mercedes() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.merced-benz.co.in/");
		Thread.sleep(3000);

	}

	@Test(alwaysRun = true)
	public void run() {
		System.out.println("i am run");

		driver.quit();

	}
}
