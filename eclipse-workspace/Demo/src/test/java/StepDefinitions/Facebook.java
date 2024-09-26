package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Facebook {
	

	WebDriver driver=null;
	@Given("user is on browser")
	public void user_is_on_browser() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\LAXMI\\eclipse-workspace\\Demo\\src\\test\\resources\\Driver\\geckodriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	    driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php/");
	}
	@When("user enters username and password")
	public void user_enters_username_and_password() {
		
	}

	@When("user click on login")
	public void user_click_on_login() {
	}

	@When("user should be navigated to homepage")
	public void user_should_be_navigated_to_homepage() {
	}

	
}
	




