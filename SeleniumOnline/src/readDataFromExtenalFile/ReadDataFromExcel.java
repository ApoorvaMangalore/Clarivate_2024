package readDataFromExtenalFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //step 1:
        File file=new File("./testData/testdata.xlsx");
        //step 2:Fis
        FileInputStream fis=new FileInputStream(file);
        
        //step3.
        
        Workbook workBook = WorkbookFactory.create(fis);
        String url = workBook.getSheet("login").getRow(1).getCell(0).getStringCellValue();
         String un = workBook.getSheet("login").getRow(1).getCell(1).getStringCellValue();
        driver.get(url);
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys(un);
	
	}

}
