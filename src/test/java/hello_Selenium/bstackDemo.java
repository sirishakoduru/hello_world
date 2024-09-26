package hello_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bstackDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://bstackdemo.com/signin");
		
		WebElement username = driver.findElement(By.className( "css-1hwfws3"));
		username.click();
		driver.findElement(By.xpath("//div[text()='demouser']")).click();
		
		WebElement password = driver.findElement(By.id( "password"));
		password.click();
		driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
		
		WebElement loginbtn = driver.findElement(By.id( "login-btn"));
		loginbtn.click();
		
		String [] products = {"iPhone 12 Pro Max","Galaxy Note 20","One Plus 8 Pro","Pixel 4"};
		
		
		
		for(String product : products) {
			WebElement addToCart = driver.findElement(By.xpath("//p[text()='"+product+"']/../div[text()='Add to cart']"));
			addToCart.click();
			//WebElement closebtn = driver.findElement(By.xpath( "//div[@class='float-cart__close-btn']"));
			//closebtn.click();
			}
		
		WebElement checkOut = driver.findElement(By.xpath("//div[text()='Checkout']"));
		checkOut.click();
		
		WebElement firstName = driver.findElement(By.id("firstNameInput"));
		firstName.sendKeys("Sirisha");
		
		WebElement lastName = driver.findElement(By.id("lastNameInput"));
		lastName.sendKeys("Koduru");
		
		WebElement address = driver.findElement(By.id("addressLine1Input"));
		address.sendKeys("johnscreek");
		
		WebElement state = driver.findElement(By.id("provinceInput"));
		state.sendKeys("georgia");
		
		WebElement postalcode = driver.findElement(By.id("postCodeInput"));
		postalcode.sendKeys("30097");
		
		WebElement submit = driver.findElement(By.id( "checkout-shipping-continue"));
		submit.click();
		
		WebElement successmessge = driver.findElement(By.id("confirmation-message"));
		String msg = successmessge.getText();
		System.out.println(msg);
	}

}
