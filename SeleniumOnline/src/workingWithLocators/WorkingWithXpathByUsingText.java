package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpathByUsingText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("register-button")).click();
		WebElement errormsg = driver.findElement(By.xpath("//span[text()='First name is required.']"));
		String text = errormsg.getText();//getText
		System.out.println(errormsg);
		System.out.println(text);
	}
}
