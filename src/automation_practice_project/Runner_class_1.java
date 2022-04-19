package automation_practice_project;

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

public class Runner_class_1 {

public static void main(String[] args) throws Throwable {

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver 1\\chromedriver.exe");
		
	        	WebDriver driver = new ChromeDriver();
	        	driver.get("http://automationpractice.com/index.php");
		       driver.manage().window().maximize();
		
	         	WebElement Signin =driver.findElement(By.xpath("//a[normalize-space()='Sign in'] "));
	            Signin.click();
		
	  JavascriptExecutor js = (JavascriptExecutor)driver;
		
	  	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  		
	   js.executeScript("window.scrollBy(0,800);");
	       
		   WebElement Em =driver.findElement(By.id("email_create"));
	                   Em.sendKeys("It's_ME_BABY_8_@gmail.com");	         
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	       WebElement clk =driver.findElement(By.xpath("//span[normalize-space()='Create an account']"));
		                        clk.click();		                      
		   WebElement Mrs = driver.findElement(By.id("uniform-id_gender2"));
		                         Mrs.click();		       
		   WebElement FN = driver.findElement(By.id("customer_firstname"));
		                          FN.sendKeys("cute");		      
		   WebElement LN =driver.findElement(By.id("customer_lastname"));
		                          LN.sendKeys("teddy");		
		   WebElement  pas =driver.findElement(By.id("passwd"));
		                          pas.sendKeys("12345");  
	js.executeScript("window.scrollBy(0,900)");	                          
		   WebElement Dt =driver.findElement(By.id("days"));   
		                           Dt.sendKeys("30");
		   WebElement mon =driver.findElement(By.id("months"));    
		                           mon.sendKeys("December");
		   WebElement Yr = driver.findElement(By.id("years"));   
		                          Yr.sendKeys("1995");
		   WebElement C = driver.findElement(By.id("company"));  
		                          C.sendKeys("SUCCESS");
		   WebElement A = driver.findElement(By.id("address1"));  
		                          A.sendKeys("No.62 ");
		   WebElement ADD = driver.findElement(By.id("address2"));  
		                          ADD.sendKeys("2nd floor,Greens appartment,Anna Nagar");
     js.executeScript("window.scrollBy(0,1000)");	  
		   WebElement City = driver.findElement(By.id("city"));                      
		                           City.sendKeys("Chennai");
		   WebElement st =driver.findElement(By.id("id_state"));                       
		                           st.sendKeys("Tamilnadu");
		   WebElement Pc = driver.findElement(By.id("postcode"));
		                           Pc.sendKeys("60000");
		  WebElement Ct = driver.findElement(By.id("id_country"));  
		                           Ct.sendKeys("United states");
		   WebElement Ad = driver.findElement(By.id("other"));
		                           Ad.sendKeys("Stylemesaloon opp");
	js.executeScript("window.scrollBy(0,900)");	                          
		   WebElement Ph =driver.findElement(By.name("phone"));                       
		                           Ph.sendKeys("1234567890");
    js.executeScript("window.scrollBy(0,-900)");	
                            	//screenshot
                TakesScreenshot Ts = (TakesScreenshot)driver;
		        File Source = Ts.getScreenshotAs(OutputType.FILE);                   
		        File des = new File ("C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Screenshot/reg.png");                  
		        FileUtils.copyFile(Source, des);  
		        
	      WebElement Reg = driver.findElement(By.xpath("//span[normalize-space()='Register']"));	                           
		            Reg.click();
		 
  }                              
                               
}                        
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
		
	



	
	
	

