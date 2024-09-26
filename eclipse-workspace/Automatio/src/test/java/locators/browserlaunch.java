package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class browserlaunch {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();  
		WebDriver driver=new ChromeDriver();
		
	//	driver.get("https://www.flipkart.com/");  
		driver.get("https://demo.opencart.com/");
	//	driver.findElement(By.name("q")).sendKeys("T-shirts"); 
		driver.manage().window().maximize();
		// name locator
	//	driver.findElement(By.name("search")).sendKeys("mac");
		// id locator
	//	boolean logoDisplaystatus=driver.findElement(By.id("logo")).isDisplayed();
	//	System.out.println(logoDisplaystatus);
		//linktext and partial linktext locator
	//	driver.findElement(By.linkText("Tablets")).click();
	//	driver.findElement(By.partialLinkText("Tab")).click();
		// className
	//	List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
	//	System.out.println("Total number of header links:"+headerLinks.size());
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("Total number of images:"+images.size());
		
		
		
		

	}  

}
 