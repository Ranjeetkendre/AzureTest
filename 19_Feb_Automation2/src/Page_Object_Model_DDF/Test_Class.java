package Page_Object_Model_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Class {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	
		
		FileInputStream file =new FileInputStream("C:\\Users\\RKENDRE\\Desktop\\19Febdata.xlsx");
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		 Sheet sh =WorkbookFactory.create(file).getSheet("Sheet1");
		 
		  WebDriver driver = new ChromeDriver(); 
		  
		  driver.manage().window().maximize();  
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  driver.get("https://kite.zerodha.com/");
		  
		  //Create object of Pom class 1
		  
		  Kite_Login_Page1 Lp1 =new Kite_Login_Page1(driver);
		  //Fetch username data
		  String Userinformation = sh.getRow(0).getCell(0).getStringCellValue();
		  Lp1.UserID(Userinformation);  
		  
		  // Fetch password
		  String UserPassword = sh.getRow(0).getCell(1).getStringCellValue();
		  Lp1.Pass(UserPassword); 
		  
		  Lp1.LoginBton();
		  
		  
		  
		  
	}

}
