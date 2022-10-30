package selenium;

import java.util.List;

import javax.swing.text.html.Option;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TutorialNinja {

	
	public static void tutorialNinjaTestcase() throws InterruptedException{
		
		
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
	 
	
	 WebElement AddToCart = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[4]/div/div[3]/button[1]/span"));
	 AddToCart.click();
	 Thread.sleep(1000);  
	 driver.findElement(By.id("button-cart")).click();
	 
	 
	 Thread.sleep(1000);
	 
		String Error_message = driver.findElement(By.className("text-danger")).getText();
		System.out.println("Error Message :"+Error_message);
	
	   
	 driver.navigate().back();
	 
	 
	 

	   
	    		 
	   

	 }
		
	public static void main(String[] args) throws InterruptedException {
		
      tutorialNinjaTestcase();
			
		
	}

}
