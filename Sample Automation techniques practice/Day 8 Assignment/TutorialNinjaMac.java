package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TutorialNinjaMac {
	
public static void MacOrder() throws InterruptedException{
	System.setProperty("WebDriver.chrome.driver","C:\\Users\\Arivoli\\eclipse-workspace\\HelloWorld\\src\\test\\resources\\drivers\\chromedriver.exe ");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://tutorialsninja.com/demo/index.php");
	
	driver.manage().window().maximize();


	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button/span"));
	    dropdown.click();
	    //Thread.sleep(1000);
	 WebElement dropdown1= driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/ul/li[1]/button"));
	 dropdown1.sendKeys("Euro");
	 driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/ul/li[1]/button")).click();
	 
	 
	 driver.findElement(By.xpath("//*[@id='content']/div[2]/div[1]/div/div[1]/a/img")).click();
	 driver.findElement(By.id("button-cart")).click();
	 WebElement Success_Message = driver.findElement(By.xpath("//*[@id='product-product']/div[1]"));
	 Success_Message.getText();
	 System.out.println("Success Message for adding the items to the cart:" +Success_Message.getText());
	WebElement View_Cart= driver.findElement(By.id("cart-total"));
	View_Cart.click();
	Thread.sleep(1000);
	 
	WebElement Use_Coupon= driver.findElement(By.xpath("//*[@id='cart']/ul/li[2]/div/p/a[1]/strong"));
	Use_Coupon.click();
	 WebElement Enter_Inputbox= driver.findElement(By.xpath("//*[@id='accordion']/div[1]/div[1]/h4/a"));
	 Enter_Inputbox.click();
	 Thread.sleep(1000);
	 WebElement Enter_Code=driver.findElement(By.id("input-coupon"));
	 Enter_Code.sendKeys("ABCD123");
	 driver.findElement(By.xpath("//*[@id='button-coupon']")).click();
	 WebElement Invalid_Coupon= driver.findElement(By.xpath("//*[@id='checkout-cart']/div[1]"));
	 Invalid_Coupon.getText();
	 System.out.println("The Error Message for Invalid Coupon Code is:"   +Invalid_Coupon.getText());
	   Thread.sleep(1000);

	 WebElement Gift = driver.findElement(By.xpath("//*[@id='accordion']/div[2]/div[1]/h4/a"));
	 Gift.click();
	 Thread.sleep(1000);
	 WebElement Input = driver.findElement(By.id("input-voucher"));
	   Input.click();
	   Input.sendKeys("AXDFGH123");
	  WebElement Apply = driver.findElement(By.id("button-voucher"));
	  Apply.click();
	  
	 WebElement print_error= driver.findElement(By.xpath("//*[@id='checkout-cart']/div[1]"));
	 print_error.getText();
	 System.out.println("Warning: Gift Certificate is either invalid or the balance has been used up!"  +print_error.getText());
	//Clearing both coupon code text boxes  
	 WebElement Input1 = driver.findElement(By.id("input-voucher"));
	   Input.click();
	   Input.clear();
	   WebElement Enter_Inputbox1= driver.findElement(By.xpath("//*[@id='accordion']/div[1]/div[1]/h4/a"));
		 Enter_Inputbox1.click();
		 Thread.sleep(1000);
	   WebElement Enter_Code1=driver.findElement(By.id("input-coupon"));
		 Enter_Code1.click();
		 Enter_Code1.clear();
	WebElement Checkout = driver.findElement(By.xpath("//*[@id='content']/div[3]/div[2]/a"));
	Checkout.click();

	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//*[@id='button-account']")).click();
	 
	 // Registration of the Account 
	    Thread.sleep(1000);
	 WebElement firstname = driver.findElement(By.id("input-payment-firstname"));
		firstname.click();
		firstname.sendKeys("Manasa");
		
		WebElement lastname = driver.findElement(By.id("input-payment-lastname"));
		lastname.click();
		lastname.sendKeys("Arcot Venkataram");
		
		WebElement email = driver.findElement(By.id("input-payment-email"));
		email.click();
		email.sendKeys("smi@gmail.com");
		
		
		WebElement PhoneNumber = driver.findElement(By.id("input-payment-telephone"));
		PhoneNumber.click();
		PhoneNumber.sendKeys("8188058743");
		
		
		WebElement password = driver.findElement(By.id("input-payment-password"));
		password.click();
		password.sendKeys("Manasa0909");
		
		WebElement confirm_password = driver.findElement(By.id("input-payment-confirm"));
		confirm_password.click();
		confirm_password.sendKeys("Manasa0909");
		
		driver.findElement(By.xpath("//*[@id='collapse-payment-address']/div/div[3]/div/input[1]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("input-payment-address-1")).sendKeys(" 22036 Woodland Hills ");
	    driver.findElement(By.id("input-payment-city")).sendKeys("Woodland Hills");
	    driver.findElement(By.id("input-payment-postcode")).sendKeys("91367");
	    WebElement Option =driver.findElement(By.id("input-payment-country"));
	    Option.click();
	    Select dropdown11 = new Select(Option);{
	    	
	    	dropdown11.selectByVisibleText("United States");
	    }
	    	WebElement Option2 = driver.findElement(By.id("input-payment-zone"));
	    	Option2.click();
	    	Select dropdown22 = new Select(Option2);{
            Thread.sleep(1000);
	    		dropdown22.selectByVisibleText("California");}	
	    		
	    		driver.findElement(By.xpath("//*[@id='content']/form/div/div/input[1]")).click();
	    		Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id='button-register']")).click();
				//driver.findElement(By.xpath("//*[@id='content']/form/div/div/input[2]")).click();
		    	Thread.sleep(2000);
				//driver.findElement(By.id("button-register")).click();
				
				//driver.findElement(By.xpath("//*[@id='content']/form/div/div/input[2]")).click();
		         }
  
	         
	        // Add Comments and Print the error message for payment and click checkbox and continue
	         
	         /*driver.findElement(By.xpath("//*[@id='collapse-payment-method']/div/p[2]/textarea")).sendKeys("Great experience");
	         WebElement error_msg=driver.findElement(By.xpath("//*[@id='collapse-payment-method']/div/div[1]"));
	         error_msg.getText();
	         System.out.println("The payment error message is as follows:" +error_msg.getText());
	         
	         driver.findElement(By.xpath("//*[@id='collapse-payment-method']/div/div[2]/div/input[1]")).click();
	         driver.findElement(By.id("button-payment-method")).click();*/
	    	
	    	
	         
	    
	      


	public static void main(String[] args) throws InterruptedException {
	 
		MacOrder();

	}

}
