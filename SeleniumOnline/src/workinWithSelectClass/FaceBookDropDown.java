package workinWithSelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Cb%7Cfacebook%20log%20in%7C&placement=&creative=589460569900&keyword=facebook%20log%20in&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409266755%26loc_physical_ms%3D9062072%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gad_source=1&gclid=Cj0KCQiAoKeuBhCoARIsAB4WxtcOowbEY6p6FmMAmFnzMNsweQEPo8ex5Rs6cLFWXXweowCW5cqO88gaAjg_EALw_wcB");
		WebElement daySelect = driver.findElement(By.id("day"));
		Select select=new Select(daySelect);
		select.selectByIndex(5);
		/*
		 * Thread.sleep(3000); select.selectByValue("10"); Thread.sleep(3000);
		 * select.selectByVisibleText("18");
		 */
		WebElement monthSelect = driver.findElement(By.id("month"));
		Select select1 =new Select(monthSelect);
		select1.selectByValue("4");
		Thread.sleep(3000);
		driver.quit();
	}

}
