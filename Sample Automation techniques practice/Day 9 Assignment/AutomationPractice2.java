package selenium;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice2 {

	
	WebDriver driver;
	public static void compareAndCheckout() throws InterruptedException {
		
		
		
System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Arivoli\\eclipse-workspace\\HelloWorld\\src\\test\\resources\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement T_Shirts= driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[3]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(T_Shirts).build().perform();
		action.click().build().perform();
		Thread.sleep(1000);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("window.scrollBy(0,700)","");
		WebElement Mouseover1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
		action.moveToElement(Mouseover1).build().perform();
		//WebDriverWait wait = new WebDriverWait(driver,null);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='center_column']/ul/li/div/div[3]/div[2]/a")));
		WebElement AddToCompare1= driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[3]/div[2]/a"));
		action.moveToElement(AddToCompare1).build().perform();
		action.click().build().perform();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='center_column']/ul/li/div/div[3]/div[2]/a")));
		Thread.sleep(2000);
		
		
		WebElement Compare1= driver.findElement(By.className("total-compare-val"));
		action.moveToElement(Compare1).build().perform();
		action.doubleClick().build().perform();
		Thread.sleep(3000);
		
		
		
		
		// Add Dress to the compare 
		
		WebElement Dresses = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[2]/a"));
		action.moveToElement(Dresses).build().perform();
		action.click().build().perform();
		Thread.sleep(3000);
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("window.scrollBy(0,700)","");
		WebElement Mouseover2 = driver.findElement(By.xpath("//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img"));
		action.moveToElement(Mouseover2).build().perform();
		
		WebElement AddToCompare2 = driver.findElement(By.xpath("//*[@id='center_column']/ul/li[1]/div/div[3]/div[2]/a"));
		action.moveToElement(AddToCompare2).build().perform();
		action.click().build().perform();
			
		
		// Comparing 
		
		WebElement Compare = driver.findElement(By.xpath("//*[@id='center_column']/div[3]/div[2]/form/button/span"));
		action.moveToElement(Compare).build().perform();
		action.click().build().perform();
		Thread.sleep(2000);
		
		
		// Add The high price dress to cart and remove the other dress
		
		WebElement Add = driver.findElement(By.xpath("//*[@id='product_comparison']/tbody/tr[1]/td[3]/div[5]/div/div/a[1]/span"));
		action.moveToElement(Add).build().perform();
		action.click(Add).build().perform();
		Thread.sleep(1000);
		
		
		//Remove the lowest dress from the compare
		
		WebElement Remove = driver.findElement(By.xpath("//*[@id=\"product_comparison\"]/tbody/tr[1]/td[2]/div[1]/a/i"));
		action.moveToElement(Remove).build().perform();
		action.click(Remove).build().perform();
		Thread.sleep(2000);
		
		// MouseOver Cart 
		WebElement MouseOverCart = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
		action.moveToElement(MouseOverCart).build().perform();
		
		Thread.sleep(1000);
			
			
		
		// Checkout 
		
		WebElement Checkout = driver.findElement(By.xpath("//*[@id=\"button_order_cart\"]/span"));
		action.moveToElement(Checkout).build().perform();
		action.click().build().perform();
		
		//Proceed to Checkout 
		
		WebElement PCheckout = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		action.moveToElement(PCheckout).build().perform();
		action.click().build().perform();
		
		
		// Enter Email Address for Signing in as the account is already created 
		
		WebElement Email = driver.findElement(By.id("email_create"));
		action.moveToElement(Email).build().perform();
		action.click().build().perform();
		action.sendKeys("arcot.manasa@gmail.com").build().perform();
		
		/*WebElement Password = driver.findElement(By.id("passwd"));
		action.moveToElement(Password).build().perform();
		action.click().build().perform();
		action.sendKeys("Sanjith1988").build().perform();
		
		WebElement SignIn = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		action.moveToElement(SignIn).build().perform();
		action.click().build().perform();*/
		

		// Create an account 
		WebElement Create = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
		action.moveToElement(Create).build().perform();
		action.click().build().perform();
		
		
		Thread.sleep(4000);
		//Enter Personal Information
		
		/*WebElement radiobutton = driver.findElement(By.id("id_gender2"));
		action.moveToElement(radiobutton).build().perform();
		action.click().build().perform();*/
		
		WebElement firstname = driver.findElement(By.id("customer_firstname"));
		action.moveToElement(firstname).build().perform();
		action.click().build().perform();
		action.sendKeys("Manasa").build().perform();
		
		WebElement lastname = driver.findElement(By.id("customer_lastname"));
		action.moveToElement(lastname).build().perform();
        action.click().build().perform();
        action.sendKeys("Arcot Venkataram").build().perform();
		
		WebElement Email1= driver.findElement(By.id("email"));
		action.moveToElement(Email1).build().perform();
		action.click().build().perform();
		action.sendKeys("arcot.manasa@gmail.com").build().perform();
		
		
		WebElement password=driver.findElement(By.id("//*[@id=\"account-creation_form\"]/div[1]/div[5]"));
		action.moveToElement(password).build().perform();
		action.click().build().perform();
		action.sendKeys("Sanjith1988").build().perform();
		
		
		WebElement dropdown1= driver.findElement(By.id("days"));
		action.moveToElement(dropdown1).build().perform();
		action.click().build().perform();
	    Select  option= new Select(dropdown1);{
	    	
	    	option.selectByIndex(10);
	 	
	    }
	    
	    WebElement dropdown2= driver.findElement(By.id("months"));
	    action.moveToElement(dropdown2).build().perform();
	    action.click().build().perform();
	    Select option1= new Select(dropdown2);{
	    	
	    	option1.selectByIndex(10);
	    	
	    	
	    }
		
	    WebElement dropdown3= driver.findElement(By.id("years"));
	    action.moveToElement(dropdown3).build().perform();
	    action.click().build().perform();
	    Select option2=new Select(dropdown3);{
	    	
	    	option.selectByVisibleText("1988");
	    }
		
	    WebElement checkbox=driver.findElement(By.id("newsletter"));
	    action.moveToElement(checkbox).build().perform();
	    action.click().build().perform();
	    
	    WebElement Checkbox2=driver.findElement(By.id("optin"));
	    action.moveToElement(Checkbox2).build().perform();
	    action.click().build().perform();
	    
	    WebElement firstname1 =driver.findElement(By.id("firstname"));
	    action.moveToElement(firstname).build().perform();
	    action.click().build().perform();
	    action.sendKeys("Manasa").build().perform();
	    
	    WebElement lastname1=driver.findElement(By.id("lastname"));
	    action.moveToElement(Checkbox2).build().perform();
	    action.click().build().perform();
	    action.sendKeys("Arcot Venkataram").build().perform();
	    
	    WebElement Address = driver.findElement(By.id("address1"));
	    action.moveToElement(Address).build().perform();
	    action.click().build().perform();
	    action.sendKeys("H.no 203/39").build().perform();
	    
	    
	    WebElement City = driver.findElement(By.id("city"));
	    action.moveToElement(City).build().perform();
	    action.click().build().perform();
	    action.sendKeys("Woodland Hills").build().perform();
	    
	    

	    WebElement dropdown4= driver.findElement(By.id("id_state"));
	    action.moveToElement(dropdown4).build().perform();
	    action.click().build().perform();
	    Select option3=new Select(dropdown4);{
	    	
	    	option.selectByIndex(5);
	    }
	    WebElement postcode = driver.findElement(By.id("postcode"));
	    action.moveToElement(postcode).build().perform();
	    action.click().build().perform();
	    action.sendKeys("91367").build().perform();
	    
		

	    WebElement dropdown5= driver.findElement(By.id("id_country"));
	    action.moveToElement(dropdown5).build().perform();
	    action.click().build().perform();
	    Select option4=new Select(dropdown5);{
	    	
	    	option.selectByVisibleText("United States");}
	     
	    
	    WebElement phonenumber = driver.findElement(By.id("phone_mobile"));
	    action.moveToElement(phonenumber).build().perform();
	    action.click().build().perform();
	    action.sendKeys("8188056789").build().perform();
	    
	 
	    
	    WebElement MyAliasAddress = driver.findElement(By.id("alias"));
	    action.moveToElement(MyAliasAddress).build().perform();
	    action.click().build().perform();
	    action.sendKeys("H.no-203/39, Woodland Hills,CA").build().perform();
	    
	    WebElement Register = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
	    action.moveToElement(Register).build().perform();
	    action.click().build().perform();
	    
	    
	    WebElement ProcessAddress = driver.findElement(By.name("processAddress"));
	    action.moveToElement(ProcessAddress).build().perform();
	    action.click().build().perform();
	    
	    
	    
	  
		WebElement CGV = driver.findElement(By.id("cgv"));
		action.moveToElement(CGV).build().perform();
		action.click().build().perform();
		
		
		WebElement ProcessCarrier = driver.findElement(By.name("processCarrier"));
		action.moveToElement(ProcessCarrier).build().perform();
		action.click().build().perform();
		
		
		WebElement PayCheck = driver.findElement(By.name("Paybycheck"));
		action.moveToElement(PayCheck).build().perform();
		action.click().build().perform();
		
		
		WebElement ConfirmOrder= driver.findElement(By.name("confirmorder"));
		action.moveToElement(ConfirmOrder).build().perform();
		action.click().build().perform();
		
	    
	    
	    
	    
	    
	}
	
	public static void main(String[] args) throws InterruptedException {
		compareAndCheckout();


}
}