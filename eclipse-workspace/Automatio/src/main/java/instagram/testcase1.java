package instagram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();  
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.instagram.com/accounts/login/?hl=en");  
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("laxmi_chikanagow");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("laxmijc@6362");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type=\"button\"]")).click();
		Thread.sleep(2000);
	//	driver.findElement(By.className("//*[text()='_a9-- _ap36 _a9_1']")).click();
		
	//	Thread.sleep(2000);
		
	
		
		
	//	WebElement ele = driver.findElement(By.xpath("//div[@class='x78zum5 xdt5ytf x1e56ztr']"));
	//	Alert alt = driver.switchTo().alert();
	//	ele.click();
	//	alt.dismiss();

	}

}
