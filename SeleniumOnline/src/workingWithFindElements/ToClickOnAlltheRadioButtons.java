package workingWithFindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnAlltheRadioButtons {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		// List<WebElement> radioButtons =
		// driver.findElements(By.xpath("//input[@type='radio']"));
		List<WebElement> radioButtons = driver.findElements(By.tagName("label"));
		for (WebElement elemet : radioButtons) {

			elemet.click();
			System.out.println(elemet.getText());
			Thread.sleep(3000);
		}
		driver.quit();
	}

}