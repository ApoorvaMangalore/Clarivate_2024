package toLunchEmptyBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLunchEmptyChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
	}
}
