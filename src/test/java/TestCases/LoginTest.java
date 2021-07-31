package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ObjectsRepo.TXLoginPage;


public class LoginTest {
	
	private static final Logger logger = LogManager.getLogger(LoginTest.class);
	
	@Test
	public void SuccessfulLogin() throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
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
	
	@Test(description = "Random generator class usage")
	public void RandmonDataGeneraor() 
	{
		Random r = new Random();
		String firstName = "FirstName"+r.nextInt();
		System.out.println(firstName);
		logger.info("firstName initialized " + getClass().getName());
		String lastName = "LastName"+r.nextInt();
		System.out.println(lastName);
		logger.info("lastName initialized " + getClass().getName());
		String emailAddress = "EmailAddress"+r.nextInt()+"gmail.com";
		System.out.println(emailAddress);
		logger.info("EmailAddress initialized " + getClass().getName());

	}
	
	@Test(description="Faker API usage")
	public void FakerDataGenerator() 
	{
		//https://github.com/DiUS/java-faker
		Faker f = new Faker();
		
		String firstName = f.name().fullName();
		System.out.println(firstName);
		
		String Address = f.address().fullAddress();
		System.out.println(Address);
		
		String Country = f.address().country();
		System.out.println(Country);
		
		String emailAddress = f.internet().emailAddress();
		System.out.println(emailAddress);
		
		String myHero = f.superhero().name();
		System.out.println(myHero);
		
		String IBAN = f.finance().iban();
		System.out.println(IBAN);
		
		String BIC = f.finance().bic();
		System.out.println(BIC);
		
		System.out.println(f.currency().code());
	}
	
	


}
