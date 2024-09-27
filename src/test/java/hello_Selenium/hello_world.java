package hello_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class hello_world {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		System.out.println("test commit log");
	}

}
