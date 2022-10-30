package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TechlisticFormTestCase {
	

	public static void Form() {
		
		// Assigning the path for chrome driver//
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Arivoli\\eclipse-workspace\\HelloWorld\\src\\test\\resources\\drivers\\chromedriver.exe");
		
		// Creating a object to open the browser//
		WebDriver driver = new ChromeDriver();
		
		// Call the URL in the browser
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
	    driver.manage().window().maximize();
	    
	    
	    JavascriptExecutor  js= (JavascriptExecutor)driver;
	    
	   js.executeScript("window.scrollBy(0,800)","");
	  //WebElement Form = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[6]/div/form/table/tbody/tr[1]/td[1]/strong"));
	   //js.executeScript("arguments[0],scrollIntoView()",Form);
	    
	    
		WebElement first_name= driver.findElement(By.name("firstname"));
		
		first_name.sendKeys("Manasa");
		
		WebElement last_name = driver.findElement(By.name("lastname"));
				
		last_name.sendKeys("Arcot Venkataram");	
				
		WebElement Female_radiobutton= driver.findElement(By.id("sex-1"));
		Female_radiobutton.click();
	
		WebElement YOE = driver.findElement(By.id("exp-2"));
		YOE.click();
		

	
		WebElement inputbox= driver.findElement(By.id("datepicker"));
	     inputbox.sendKeys("15th Sep 2022");
	
	     
	    WebElement ManualTesterCheckbox = driver.findElement(By.id("profession-0"));
	    ManualTesterCheckbox.click();
	    
	   // WebElement AutomationTesterCheckbox = driver.findElement(By.xpath("profession-1"));
	   // AutomationTesterCheckbox.click();
	    
	    WebElement SeleniumWebDriver = driver.findElement(By.id("tool-2"));
	    SeleniumWebDriver.click();
	    
	    Select TextBox = new Select(driver.findElement(By.id("continents")));
	    TextBox.selectByVisibleText("Asia");
	   
	    Select Dropdown = new Select(driver.findElement(By.id("selenium_commands")));
	    Dropdown.selectByVisibleText("Browser Commands");
	    
	    driver.findElement(By.id("photo")).sendKeys("C:\\Users\\Arivoli\\eclipse-workspace\\selenium\\pom.xml");
	    
	   // WebElement button= driver.findElement(By.name("selenium_commands"));
	   //  button.sendKeys("Browser Commands");
	    
	    driver.findElement(By.linkText("Click here to Download File"));
	   driver.quit();
	}


	public static void main(String[] args) {
		
		Form();

	}

}
