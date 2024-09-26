package hello_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UIbank {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://uibank.uipath.com/welcome");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("kodurusirisha");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("abc123");
		
		WebElement signin = driver.findElement(By.xpath("//button[text()='Sign In']"));
		signin.click();
		
		WebElement privacy = driver.findElement(By.xpath("//button[@class='btn center-button btn-black']"));
		privacy.click();
		
		WebElement newaccount = driver.findElement(By.xpath("//div[text()='Apply For New Account ']"));
		newaccount.click();
		
		WebElement nickname = driver.findElement(By.id("accountNickname"));
		nickname.sendKeys("Zelda");
		
		WebElement accounttype = driver.findElement(By.name("typeOfAccount"));
		Select dropdown = new Select(accounttype);
		dropdown.selectByVisibleText("Savings");
		
		WebElement apply = driver.findElement(By.xpath("//button[text()='Apply']"));
		apply.click();
		
		WebElement successmessge = driver.findElement(By.xpath("//h1[text()=' Congratulations! ']"));
		String msg = successmessge.getText();
		System.out.println(msg);
		
		WebElement message = driver.findElement(By.xpath("//h4[@class='text-center text-white small-text']"));
		String mesg = message.getText();
		System.out.println(mesg);
		
		boolean accountid = driver.findElement(By.id("accountId")).isDisplayed();
		System.out.println(accountid);
		
		boolean accountname = driver.findElement(By.id("accountName")).isDisplayed();
		System.out.println(accountname);
		
		WebElement viewaccount = driver.findElement(By.id("viewAccounts"));
		viewaccount.click();
		
		
		
		
		//button[@class='btn center-button btn-black']
	}

}
