package Adactin_practice_project;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner_Class_2 {
 public static void main(String[] args) throws Throwable {
	

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Project_Class\\Driver\\chromedriver.exe");
		
	            	WebDriver driver = new ChromeDriver();
		
             driver.get("https://adactinhotelapp.com/");
		
		        driver.manage().window().maximize(); 
	 //username
		        
		    WebElement Us = driver.findElement(By.id("username"));
		             Us.sendKeys("nivivenkat1");
	//password
		             
		    WebElement Ps =driver.findElement(By.id("password"));
		             Ps.sendKeys("Nivi12345");
	//login 
	 
            WebElement Lg = driver.findElement(By.id("login"));
                      Lg.click();                  
    //Location
                       
           WebElement Ln= driver.findElement(By.id("location"));
                  Ln.sendKeys("Paris");
	// Hotel
	        
	        WebElement Ht = driver.findElement(By.id("hotels"));
	               Ht.sendKeys("Hotel Sunshine");
	// Roomtype
	                  
	        WebElement Rt = driver.findElement(By.id("room_type"));
	                   Rt.sendKeys("Super Deluxe");
   // no of rooms
	            
	        WebElement Ns = driver.findElement(By.id("room_nos"));
	                  Ns.sendKeys("2- Two");
    // check in date
	             
	         WebElement Cd = driver.findElement(By.id("datepick_in"));   Cd.clear();
	                   Cd.sendKeys("01/03/2022");
	 //check out date
	                   
	         WebElement Co = driver.findElement(By.id("datepick_out"));  Co.clear();
	                    Co.sendKeys("03/03/2022");
	// adult per room  
	                    
	          WebElement Ar = driver.findElement(By.id("adult_room"));
	                Ar.sendKeys("2 - Two");
	// Child per room
	              
	          WebElement Cr = driver.findElement(By.id("child_room"));
	                  Cr.sendKeys("2 - Two");
   // Search 
	                
	          WebElement Sh = driver.findElement(By.id("Submit"));
	                     Sh.click();
	//select
	                     
	           WebElement Se = driver.findElement(By.id("radiobutton_0"));
	                       Se.click();
	//continue
	                       
	           WebElement Cn = driver.findElement(By.id("continue"));
	                       Cn.click();
	 
	          JavascriptExecutor js = (JavascriptExecutor) driver;
	          
	  js.executeScript("window.scrollBy(0,600)");
	 
	 // First name
	    
	          WebElement Fn = driver.findElement(By.id("first_name"));
	                     Fn.sendKeys("nivi");
	 //Last name 
	                     
	          WebElement L =driver.findElement(By.id("last_name"));
	                     L .sendKeys("venkat");
	//address                     
	 
	          WebElement Add = driver.findElement(By.id("address"));
	                     Add.sendKeys("no:52,third floor,1st street,chennai,Tamilnadu");
	//Credit card no 
	                     
	          WebElement Cc = driver.findElement(By.id("cc_num"));
	                  Cc.sendKeys("1234567890123456");
	//credit card type 
	                  
	          WebElement Ct = driver.findElement(By.id("cc_type"));
	                      Ct.sendKeys("Master Card ");
	 //Expiry month 
	                      
	           WebElement Cm = driver.findElement(By.id("cc_exp_month"));
	                       Cm.sendKeys("December");
	 //Expiry Year 
	                       
	           WebElement Cy = driver.findElement(By.id("cc_exp_year"));
	                       Cy.sendKeys("2022");
	// CCV No
	                       
	           WebElement CCV = driver.findElement(By.id("cc_cvv"));
	                        CCV.sendKeys("123");
	 //book now 
	                        
	           WebElement bk = driver.findElement(By.id("book_now"));
	                         bk.click();
	                         
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 
	           js.executeScript("window.scrollBy(0,600)");
	 //my ltinerary
	 
	           WebElement Ml = driver.findElement(By.id("my_itinerary"));
	                   Ml.click();
	 
	                       // ScreenShot
	               TakesScreenshot T = (TakesScreenshot)driver;
	               File Sr = T.getScreenshotAs(OutputType.FILE);
	               File D = new File("C:\\Users\\Admin\\eclipse-workspace\\Project_Class\\Screenshot/hotel.png");
	               FileUtils.copyFile(Sr, D);
	 //logout
	               
	               WebElement Lout = driver.findElement(By.id("logout"));
	                         Lout.click();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 }
	
	
}
	
	
	
	
	

