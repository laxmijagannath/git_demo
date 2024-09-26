package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();  
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		// xpath with single attribute
		
	//	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("shoes");
		
		// xpath with multiple attribute
		
	//	driver.findElement(By.xpath("//input[@name='q'][@placeholder='Search for Products, Brands and More']")).sendKeys("shoes");
		
		// xpath with 'and' operator
		
	//	driver.findElement(By.xpath("//input[@name='q' and @placeholder='Search for Products, Brands and More']")).sendKeys("shoes");
	//	driver.findElement(By.xpath("//input[@name='q' or @placeholder='Search for Products, Brands and More']")).sendKeys("T-shirts");
		
		// xpath with inner text()
		
	//	driver.findElement(By.xpath("//*[text()='Contact Us']")).click();
	//	boolean displaystatus =driver.findElement(By.xpath("//*[text()='Best of Electronics']")).isDisplayed();
	//	System.out.println(displaystatus);
		
//	String value =driver.findElement(By.xpath("//*[text()='Best of Electronics']")).getText();
//	System.out.println(value);
		
	//	xpath with contains()
		
	//	driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("shoes");
	//	xpath with start with()
		
	//	driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("shoes");
		
	//	chained xpath
		
	boolean	status=driver.findElement(By.xpath("//div[@id='container']")).isDisplayed();
	System.out.println(status);
		
		
		
		

	}

}
