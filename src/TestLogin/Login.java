package TestLogin;

import org.testng.annotations.Test;

import pom.LoginPage;
import commonsActions.*;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class Login extends base{
	private WebDriver driver;
	private LoginPage lg;
	
	@BeforeClass
	public void beforeClass(){
		driver = setUp(BASE_BROWSER);
		lg = new LoginPage(driver);
		openLink(BASE_URL);
	}

	@Test
	public void LoginTest() throws Exception {
		lg.Login(USER_NAME,PASSWD);
	}

	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
	}

}
