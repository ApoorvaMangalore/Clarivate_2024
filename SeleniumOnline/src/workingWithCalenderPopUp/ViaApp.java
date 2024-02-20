package workingWithCalenderPopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ViaApp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://in.via.com/");
		driver.findElement(By.id("departure")).click();
	
		String month="Apr";
		String day="24";
		/*
		 * driver.findElement(By
		 * .xpath("//div[@id='depart-cal']//span[text()=' 2024']//span[text()='Feb']/../../..//div[text()='24']"
		 * )) .click();
		 */
		driver.findElement(By.xpath("(//span[@style='text-align: right;'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='depart-cal']//span[text()=' 2024']//span[text()='"+month+"']/../../..//div[text()='"+day+"']")).click();
	}
}
