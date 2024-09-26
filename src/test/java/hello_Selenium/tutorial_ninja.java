package hello_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tutorial_ninja {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement Selectcurrency = driver.findElement(By.id("form-currency"));
		Selectcurrency.click();
		Selectcurrency.findElement(By.xpath("//button[text()='€Euro']")).click();
		
		WebElement addtocart = driver.findElement(By.xpath("//a[text()='Canon EOS 5D']"));
		addtocart.click();
		
		WebElement addcannon = driver.findElement(By.xpath("//button[text()='Add to Cart']"));
		addcannon.click();
		
		WebElement error = driver.findElement(By.xpath("//div[text()='Select required!']"));
		String err = error.getText();
		System.out.println(err);
		
		WebElement backhome = driver.findElement(By.xpath("//i[@class='fa fa-home']"));
		backhome.click();
		
		WebElement iphone = driver.findElement(By.xpath("//a[text()='iPhone']"));
		iphone.click();
		
		WebElement Qty = driver.findElement(By.id("input-quantity"));
		Qty.click();
		Qty.clear();
		Qty.sendKeys("2");
		
		WebElement addiphones = driver.findElement(By.id("button-cart"));
		addiphones.click();
		
		WebElement successmsg = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		String msg = successmsg.getText();
		System.out.println(msg);
		
		WebElement cart = driver.findElement(By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']"));
		cart.click();
		
		WebElement viewcart = driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart']"));
		viewcart.click();
		
		WebElement cartQty = driver.findElement(By.xpath("//div[@class='input-group btn-block']/input"));
		cartQty.click();
		cartQty.clear();
		cartQty.sendKeys("3");
		WebElement update = driver.findElement(By.xpath("//i[@class='fa fa-refresh']"));
		update.click();
		
		WebElement ecotax = driver.findElement(By.xpath("(//td/strong[contains(text(), 'Eco Tax')])[2]/../../td[2]"));
		String tax = ecotax.getText();
		System.out.println(tax);
		
		WebElement vat = driver.findElement(By.xpath("(//td/strong[contains(text(), 'VAT')])[2]/../../td[2]"));
		String v = vat.getText();
		System.out.println(v);
		
		WebElement checkout = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
		checkout.click();
		
		WebElement checkouterror = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		String checkerror = checkouterror.getText();
		System.out.println(checkerror);
		
		WebElement remove = driver.findElement(By.xpath("//i[@class='fa fa-times-circle']"));
		remove.click();
		
		WebElement Continue = driver.findElement(By.xpath("//a[text()='Continue']"));
		Continue.click();
		
		WebElement selectele = driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
		selectele.click(); 
		selectele.findElement(By.xpath("//a[text()='Show AllLaptops & Notebooks']")).click();
		
		WebElement HPcart = driver.findElement(By.xpath("//a[text()='HP LP3065']/../../../../../div/div/div/button/span[text()='Add to Cart']"));
		HPcart.click();
		
		WebElement quantity = driver.findElement(By.xpath("//input[@name='quantity']"));
		String quant = quantity.getText();
		System.out.println(quant);
		
		WebElement HPaddcart = driver.findElement(By.id("button-cart"));
		HPaddcart.click();
		
		WebElement Hpsuccessmsg = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		String mesg = Hpsuccessmsg.getText();
		System.out.println(mesg);
		
		WebElement shoppingcart = driver.findElement(By.linkText("shopping cart"));
		shoppingcart.click();
		
		WebElement couponcode = driver.findElement(By.xpath("(//h4/a[contains(text(), 'Use Coupon Code ')])"));
		couponcode.click(); 
	    WebElement addcode = driver.findElement(By.xpath("//div/input[@id='input-coupon']"));
	    addcode.sendKeys("ABCD123");
	    
	    WebElement applycoupon = driver.findElement(By.id("button-coupon"));
	    applycoupon.click();
	    
	    WebElement errorcoupon = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
	    String errcou = errorcoupon.getText();
	    System.out.println(errcou);
	    addcode.clear();

	    WebElement giftcert = driver.findElement(By.xpath("//h4/a[text()='Use Gift Certificate ']"));
	    giftcert.click(); 
	    WebElement addgift = driver.findElement(By.xpath("//div/input[@id='input-voucher']"));
	    addgift.sendKeys("AXDFGH123 ");
	    
	    WebElement applygift = driver.findElement(By.id("button-voucher"));
	    applygift.click();
	    
        WebElement errorgift= driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
	    String errgift = errorgift.getText();
	    System.out.println(errgift);
	    
	    addgift.clear();
	    
	    WebElement checkouthp = driver.findElement(By.xpath("//a[text()='Checkout']/../../div[2]"));
	    checkouthp.click();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    WebElement checkoutoption = driver.findElement(By.xpath("//input[@value='register']"));
	    checkoutoption.click();
	    driver.findElement(By.id("button-account")).click();

	    
	    
	    WebElement firstname = driver.findElement(By.id("input-payment-firstname"));
	    firstname.sendKeys("sirisha");
	    
	    WebElement lastname = driver.findElement(By.id("input-payment-lastname"));
	    lastname.sendKeys("koduru");
	    
	    WebElement email = driver.findElement(By.id("input-payment-email"));
	    email.sendKeys("sirishakoduru2@gmail.com");
	    
	    WebElement company = driver.findElement(By.id("input-payment-company"));
	    company.sendKeys("verizon");
	    
	    WebElement telephone = driver.findElement(By.id("input-payment-telephone"));
	    telephone.sendKeys("9440699990");
	    
	    WebElement address1 = driver.findElement(By.id("input-payment-address-1"));
	    address1.sendKeys("2515 vinings dr");
	    
	    WebElement address2 = driver.findElement(By.id("input-payment-address-2"));
	    address2.sendKeys("southcobb");
	    
	    WebElement city = driver.findElement(By.id("input-payment-city"));
	    city.sendKeys("Atlanta");
	    
	    WebElement postalcode = driver.findElement(By.id("input-payment-postcode"));
	    postalcode.sendKeys("30097");
	    
	    WebElement country = driver.findElement(By.name("country_id"));
		Select dropdown = new Select(country);
		dropdown.selectByVisibleText("United States");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement region = driver.findElement(By.name("zone_id"));
		Select dropdown1 = new Select(region);
		dropdown1.selectByValue("3631");
		
		WebElement password = driver.findElement(By.id("input-payment-password"));
		password.sendKeys("abc123");
		 
		WebElement confirmpassword = driver.findElement(By.id("input-payment-confirm"));
		confirmpassword.sendKeys("abc123");
		
		WebElement delivercheckbox = driver.findElement(By.xpath("//input[@name='shipping_address']"));
		delivercheckbox.click();
	    
		WebElement checkbox = driver.findElement(By.xpath("//input[@name='agree']"));
		checkbox.click();
		
		WebElement Continue1 = driver.findElement(By.id("button-register"));
		Continue1.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement delivery = driver.findElement(By.xpath("//a[@class='accordion-toggle collapsed']"));
		delivery.click();

	    
	    
	    
		
		
		
		
		
		
		
		
		
		
				
		
		
	}

}
