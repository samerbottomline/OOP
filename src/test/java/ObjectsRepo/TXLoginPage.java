package ObjectsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TXLoginPage {
	
	WebDriver driver;
	
	public TXLoginPage (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String URL = "https://txdemouk-auth.treasuryxpress.com/Account/Login?ReturnUrl=%2Fconnect%2Fauthorize%2Fcallback%3Fclient_id%3Dtxv1%26response_type%3Did_token%26scope%3Dopenid%2520profile%26state%3DOpenIdConnect.AuthenticationProperties%253D-_Y6g6RoE5HJPcPTbHiZt8bXlur98OqslgnCp1Mq6GfJGUxxdnhZhHXSRb7XWx-yvgu0-lv1rqp0jb_IED9DICxZ1YCcwucZuTM2qTeibxY%26response_mode%3Dform_post%26nonce%3D637627099212596413.MTY5OThhNzQtZTRmNS00N2FiLTg5OTctYTM0YWMxYzRkMzc1MTJjOTBlMDgtOGI5MS00OGM4LTg1MGQtNGUwOWJiODRjMjVh%26redirect_uri%3Dhttps%253A%252F%252Ftxdemouk.treasuryxpress.com%252Fauth%252Fidentity-signin%26post_logout_redirect_uri%3Dhttps%253A%252F%252Ftxdemouk.treasuryxpress.com%26x-client-SKU%3DID_NET461%26x-client-ver%3D6.5.0.0";
	
	@FindBy(name="Username")
	WebElement txtusename;
	
	@FindBy(name="Password")
	WebElement txtpassword;
	
	@FindBy(name="button")
	WebElement btnlogin;
	
	public void SendPass()
	{
		txtpassword.sendKeys("P@ssw0rd");
	}
	
	public void SendUser()
	{
		txtusename.sendKeys("samuser");
	}
	
	public void ClickLogin()
	{
		btnlogin.click();
	}

}
