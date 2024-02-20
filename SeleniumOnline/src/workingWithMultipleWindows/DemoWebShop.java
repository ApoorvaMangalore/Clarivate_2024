package workingWithMultipleWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Facebook")).click();

		String parentWindow = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();// parent +child
		System.out.println(parentWindow);
		System.out.println(allWindow);

		allWindow.remove(parentWindow);
		System.out.println(allWindow);
		//System.out.println(driver.getTitle());

		for (String eacHwindow : allWindow) {
			driver.switchTo().window(eacHwindow);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			//driver.quit();
			driver. close();
		}

	}

}
