package hello_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sauce_demo {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/");
		
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		
		String [] products = {"Sauce Labs Backpack","Sauce Labs Bolt T-Shirt","Sauce Labs Onesie"};
		
		for(String product : products ) {
			
			WebElement addToCart = driver.findElement(By.xpath("//div[text()='"+product+"']/../../..//button[text()='Add to cart']"));
			addToCart.click();	
		}
		WebElement shoppingCart = driver.findElement(By.className("shopping_cart_link"));
		shoppingCart.click();
		
		WebElement checkOut = driver.findElement(By.id("checkout"));
		checkOut.click();
		
		WebElement firstName = driver.findElement(By.id("first-name"));
		firstName.sendKeys("Sirisha");
		
		WebElement lastName = driver.findElement(By.id("last-name"));
		lastName.sendKeys("Koduru");
		
		WebElement postalCode = driver.findElement(By.id("postal-code"));
		postalCode.sendKeys("30097");
		
		WebElement Continue = driver.findElement(By.id("continue"));
		Continue.click();
		
		WebElement finish = driver.findElement(By.id("finish"));
		finish.click();
		
		WebElement sucessmsg = driver.findElement(By.xpath("//div[@id='checkout_complete_container']/h2"));
		String msg = sucessmsg.getText();
		System.out.println();
		
	}
	

}
