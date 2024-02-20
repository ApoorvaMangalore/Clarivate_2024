package workingWithWebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllThewebElementsMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");

		WebElement firstName = driver.findElement(By.id("txtUsername"));
		firstName.sendKeys("apporva");// sendKeys
		firstName.clear();// clear
		firstName.sendKeys("Apoorva");
		String getCssValue = firstName.getCssValue("color");// getCssValue
		System.out.println(getCssValue);

		WebElement passWord = driver.findElement(By.id("txtPassword"));
		System.out.println(passWord.getTagName());// getTagName
		Point loc = passWord.getLocation();// getLocation();
		System.out.println(loc.getX());
		System.out.println(loc.getY());

		WebElement loginButton = driver.findElement(By.id("btnLogin"));// click or submit
		loginButton.submit();
		System.out.println(loginButton.isDisplayed());// isDisplayed()
		System.out.println(loginButton.isEnabled());// isEnabled()
		System.out.println(loginButton.isSelected());// isSelected()
		
		driver.quit();

	}
}
