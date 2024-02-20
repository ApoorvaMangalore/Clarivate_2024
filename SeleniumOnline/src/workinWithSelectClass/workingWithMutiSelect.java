package workinWithSelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class workingWithMutiSelect {

	private static Select select;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		WebElement multisel = driver.findElement(By.id("multiselect1"));
		Select select=new Select(multisel);
	    System.out.println(	select.isMultiple());
	    
	    select.selectByIndex(1);
	    Thread.sleep(3000);
	    select.selectByIndex(2);
	    Thread.sleep(3000);
	    select.selectByIndex(3);
	    Thread.sleep(3000);
		/*
		 * select.deselectByIndex(3); Thread.sleep(3000); select.deselectByIndex(2);
		 * Thread.sleep(3000); //select.deselectByIndex(1); Thread.sleep(3000); //
		 * select.deselectAll();
		 */	    
	    WebElement firstSelected = select.getFirstSelectedOption();
	    System.out.println(firstSelected);
	    System.out.println(firstSelected.getText());
	    
	    
	    select.getAllSelectedOptions();
	    
	    List<WebElement> alloptions = select.getOptions();
	    for(WebElement option:alloptions) {
	    	System.out.println(option.getText());
	    }
	    
	    driver.quit();
	    
	}

}
