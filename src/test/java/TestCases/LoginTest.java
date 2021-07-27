package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ObjectsRepo.TXLoginPage;

public class LoginTest {
	
	private static final Logger logger = LogManager.getLogger(LoginTest.class);
	
	@Test
	public void SuccessfulLogin() throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samer.rahal\\Downloads\\chromedriver92\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//logger.info("Driver initialized " + getClass().getName());
		
		TXLoginPage objTXLoginpage = new TXLoginPage(driver);
		
		driver.get(objTXLoginpage.URL);
		//logger.info("URL initialized " + getClass().getName());
		objTXLoginpage.SendPass();
		//logger.info("Password initialized " + getClass().getName());
		objTXLoginpage.SendUser();
		//logger.info("Username initialized " + getClass().getName());
		Thread.sleep(3000);
		driver.quit();
		//logger.info("Quit initialized " + getClass().getName());
		
		//objTXLoginpage.ClickLogin();
	}

}
