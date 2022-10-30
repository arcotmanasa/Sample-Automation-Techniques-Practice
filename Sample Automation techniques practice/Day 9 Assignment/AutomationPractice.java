package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationPractice {
	
	
	public static void Search() throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Arivoli\\eclipse-workspace\\HelloWorld\\src\\test\\resources\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		
		WebElement search= driver.findElement(By.id("search_query_top"));
		search.sendKeys("Summer Dress"  +Keys.ENTER);
		
         JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		executor.executeScript("window.scrollBy(0,500)","");
		
		
		WebElement AddToCart = driver.findElement(By.xpath("//*[@id='center_column']/ul/li[2]/div/div[2]/div[2]/a[1]/span"));
		AddToCart.click();
		
		Actions action = new Actions(driver);
		
		action.moveToElement(AddToCart).build().perform();
		action.click().build().perform();
		Thread.sleep(1000);
		
		
			
		
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		
		
		Search();
		

	}

}
