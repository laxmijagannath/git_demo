package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		System.out.println("launching the browser");
		WebDriver driver = new ChromeDriver();

		driver.get("www.google.com");
		System.out.println("browser launch sucessfully");
	}
}
