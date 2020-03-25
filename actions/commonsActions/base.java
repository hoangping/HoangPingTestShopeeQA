package commonsActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import UiElements.*;

public class base extends Elements{
	WebDriver driver;
	
	public WebDriver setUp(String browser) {
		String path = System.getProperty("user.dir");
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", path + "\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", path + "\\driver\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		return driver;
	}
	
	public void openLink(String baseUrL) {
		driver.manage().timeouts().implicitlyWait(Elements.WAIT_TIME, TimeUnit.SECONDS);
		// Go to site
		driver.get(baseUrL);
	}
}
