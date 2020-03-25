package pom;

import static org.junit.Assert.assertEquals;
import commonsActions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends base{
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void Login(String username, String password) throws Exception {
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		String actualTitle = driver.getTitle();
    	assertEquals(actualTitle,EXPECT_TITLE);
	}
}
