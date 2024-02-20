package workingWithScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WebElements {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		WebElement logo = driver.findElement(By.tagName("img"));
		File src = logo.getScreenshotAs(OutputType.FILE);
		File dest = new File("./errorshots/webelemt.jpg");
		Files.copy(src, dest);
		driver.quit();
	}
}
