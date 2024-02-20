package readDataFromExtenalFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFRomPropFile {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        //step1 : create obj file
        File file=new File("./testData/TestData.properties");
      //step2 : create obj fileInputStream
        FileInputStream fis=new FileInputStream(file);
        
        // step3 : create obj file
        Properties prop=new Properties();
        prop.load(fis);
        
        String url = prop.getProperty("url");
        System.out.println(url);
        String Un = prop.getProperty("un");
        System.out.println(Un);
        
       // driver.get(url);
        driver.get(prop.getProperty("url"));
       
	}

}
