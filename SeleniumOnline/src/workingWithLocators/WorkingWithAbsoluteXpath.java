package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div/div/div/div/a/img")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
