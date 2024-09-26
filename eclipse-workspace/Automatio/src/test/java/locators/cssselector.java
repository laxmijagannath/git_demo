package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cssselector {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();  
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		// tag#id
	  //  driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		
		// tag class  tag.classname
	
	//	driver.findElement(By.cssSelector(".Pke_EE")).sendKeys("T-shirts");
	
	//	tag attribute
		//	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("T-shirts");
	//	driver.findElement(By.cssSelector("input[name='q']")).sendKeys("T-shirts");
		
		
	//	driver.findElement(By.cssSelector("input[placeholder='Search for Products, Brands and More']")).sendKeys("shoes");
		
		
		// tag.class attribute  tag.classname[attribute="value"]
		
		
		driver.findElement(By.cssSelector(".Pke_EE[name='q']")).sendKeys("shoes");
		
		
		
		
		
		

	}  

 

	}


