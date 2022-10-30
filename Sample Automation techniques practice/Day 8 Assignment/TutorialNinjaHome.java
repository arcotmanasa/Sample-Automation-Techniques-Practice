package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialNinjaHome {
	
	public static void tutorialNinjaTestcase2() throws InterruptedException{
		
		
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

	
	WebElement Iphone = driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/div/div[1]/a/img"));
	
	Iphone.click();
	Thread.sleep(1000);
	
	WebElement Quantity = driver.findElement(By.id("input-quantity"));
         Quantity.click();
         Quantity.clear();
       
         driver.findElement(By.id("input-quantity")).sendKeys("2");  
         driver.findElement(By.id("button-cart")).click();
         String Text= driver.findElement(By.xpath("//*[@id='product-product']/div[1]")).getText();
         System.out.println("Success message:"   +Text);
	           
        driver.findElement(By.id("cart-total")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='cart']/ul/li[2]/div/p/a[1]/strong")).click();
        WebElement Quantity1= driver.findElement(By.xpath("//*[@id='content']/form/div/table/tbody/tr/td[4]/div/input"));
        Quantity1.click();
        Quantity1.clear();
        driver.findElement(By.xpath("//*[@id='content']/form/div/table/tbody/tr/td[4]/div/input")).sendKeys("3");
        driver.findElement(By.xpath("//*[@id='content']/form/div/table/tbody/tr/td[4]/div/span/button[1]/i")).click();
       WebElement EcoTax= driver.findElement(By.xpath("//*[@id='content']/div[2]/div/table/tbody/tr[2]/td[2]"));
       EcoTax.getText();
        System.out.println("The EcoTax of the items in the cart are :"  +EcoTax.getText());
        WebElement VAT = driver.findElement(By.xpath("//*[@id='content']/div[2]/div/table/tbody/tr[3]/td[2]"));
        VAT.getText();
        System.out.println("The VAT of the items in the cart are :"  +VAT.getText());
        driver.findElement(By.xpath("//*[@id='content']/div[3]/div[2]/a")).click();
       WebElement Alert= driver.findElement(By.xpath("//*[@id='checkout-cart']/div[1]"));
       Alert.getText();
        System.out.println(Alert.getText());
       WebElement Remove =driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[2]/i"));
    		 Remove.click();
         
    	//driver.findElement(By.xpath("//*[@id='error-not-found']/ul/li[1]/a/i")).click();
    	//Thread.sleep(1000);
    		 
    		 
	}

	public static void main(String[] args) throws InterruptedException {
		
		tutorialNinjaTestcase2();
		

	}

}
