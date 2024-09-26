package Facebooklogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class loginSD {
	WebDriver driver=null;
	
	@Given("browser is open")
	public void browser_is_open() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LAXMI\\eclipse-workspace\\cucumberproject\\src\\test\\java\\Drivers\\geckodriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}

}
