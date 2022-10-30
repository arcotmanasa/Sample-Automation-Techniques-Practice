package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CovidBedAvailability {

	public static void BedAvailability() throws InterruptedException {
	
  System.setProperty("Webdriver.chrome.driver","C:\\Users\\Arivoli\\eclipse-workspace\\HelloWorld\\src\\test\\resources\\drivers\\chromedriver.exe");
			
  WebDriver driver = new ChromeDriver();
			
  driver.get("http://office.suratsmartcity.com/SuratCOVID19/Home/COVID19BedAvailabilitydetails");
			
  driver.manage().window().maximize();
  
  List<WebElement>  hospitals_nameText= driver.findElements(By.xpath("//div[@class='card custom-card']"));
  int Hospital_Text= hospitals_nameText.size();
  
  System.out.println(Hospital_Text);
 
   for(int i=1;i<=Hospital_Text;i++) { 
		
	WebElement hospital_Names = driver.findElement(By.xpath("//div[@class='card custom-card']["+i+"]//a"));
	System.out.println(hospital_Names.getText());
		
		
	WebElement totalBedsAvailable = driver.findElement(By.xpath("//div[@class='card custom-card']["+i+"]//span[@class='count-text']"));
	System.out.println(totalBedsAvailable.getText());
		
		
	WebElement totalVacantBeds = driver.findElement(By.xpath("//div[@class='card custom-card']["+i+"]//span[@class='count-text pr-2']"));
	System.out.println(totalVacantBeds.getText());
     

    WebElement O2N = driver.findElement(By.xpath("//div[@class='card custom-card']["+i+"]//li[2]//div[@class='count-text']"));
    System.out.println("Number of Oxygen Cylinders Available are :  "+O2N.getAttribute("innerHTML"));
    
    WebElement totalVentilators = driver.findElement(By.xpath("//div[@class='card custom-card']["+i+"]//li[4]//div[@class='count-text']"));
    System.out.println("Number of Ventilators Available are: "+totalVentilators.getAttribute("innerHTML"));
	

    hospital_Names.click();
    Thread.sleep(500);
   
	WebElement address = driver.findElement(By.id("lblhosaddress"));
	System.out.println("Address : " + address.getText() );

	WebElement contact = driver.findElement(By.id("lblhosCno"));
	System.out.println("contact : " + contact.getText() );

	driver.findElement(By.xpath("//button[@class='close']/span")).click();

  Thread.sleep(500);}
	
	}
  


	public static void main(String[] args) throws InterruptedException {
		
		BedAvailability() ;
	
		
	

}}
