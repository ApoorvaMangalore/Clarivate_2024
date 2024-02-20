package workingWithScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebPage {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		// step 1:
		TakesScreenshot tk_scr_shot = (TakesScreenshot) driver;

		File src = tk_scr_shot.getScreenshotAs(OutputType.FILE);
		File dest = new File("./errorshots/webpage.jpg");
		FileHandler.copy(src, dest);
		driver.quit();

	}

}
