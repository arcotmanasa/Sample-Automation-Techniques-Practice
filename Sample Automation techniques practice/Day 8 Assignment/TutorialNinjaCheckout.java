package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialNinjaCheckout {
	
	public static void checkout() {
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Arivoli\\eclipse-workspace\\HelloWorld\\src\\test\\resources\\drivers\\chromedriver.exe ");
		
		WebDriver driver = new ChromeDriver();
		 
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		
		driver.manage().window().maximize();

		WebElement firstname = driver.findElement(By.id("input-firstname"));
		firstname.click();
		firstname.sendKeys("Manasa");
		
		WebElement lastname = driver.findElement(By.id("input-lastname"));
		lastname.click();
		lastname.sendKeys("Arcot Venkataram");
		
		WebElement email = driver.findElement(By.id("input-email"));
		email.click();
		email.sendKeys("arcot@gmail.com");
		
		
		WebElement PhoneNumber = driver.findElement(By.id("input-telephone"));
		PhoneNumber.click();
		PhoneNumber.sendKeys("8188058743");
		
		
		WebElement password = driver.findElement(By.id("input-password"));
		password.click();
		password.sendKeys("Manasa0909");
		
		WebElement confirm_password = driver.findElement(By.id("input-confirm"));
		confirm_password.click();
		confirm_password.sendKeys("Manasa0909");
		
		driver.findElement(By.xpath("//*[@id='content']/form/div/div/input[1]")).click();
		driver.findElement(By.xpath("//*[@id='content']/form/div/div/input[2]")).click();
		
		// Click on contact us 
		
		driver.findElement(By.xpath("//*[@id='content']/p[4]/a")).click();
		WebElement enquiry = driver.findElement(By.id("input-enquiry"));
				enquiry.sendKeys(" The overall website experience was good.Will be buying more items in the coming future!");
				
		WebElement Submit = driver.findElement(By.xpath("//*[@id='content']/form/div/div/input"));
		Submit.click();
		
		driver.findElement(By.xpath("//*[@id='content']/div/div/a")).click();
		
	}
	

	public static void main(String[] args) {
	
		checkout();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
