package Webdriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {

	public static void main(String[] args) throws InterruptedException {
	
        System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");   
		 
	     WebDriver driver = new ChromeDriver();
	     
	     driver.manage().window().maximize();	
		  driver.get("http://demo.automationtesting.in/Windows.html");
		  Thread.sleep(5000);

		  driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
		  
		  Thread.sleep(5000);
		  //driver.close();
		 driver.quit();
	

	}

}
