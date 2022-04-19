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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Runner_class_2 {
public static void main(String[] args) throws Throwable {

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver 1\\chromedriver.exe");
		
	        	WebDriver driver = new ChromeDriver();
	                    driver.get("http://automationpractice.com/index.php");
		     driver.manage().window().maximize();
		        WebElement Sg =driver.findElement(By.xpath("//a[normalize-space()='Sign in']"));
	                                      Sg.click();
	                         JavascriptExecutor js = (JavascriptExecutor)driver;	                              		
	   	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	                              	  		
	  js.executeScript("window.scrollBy(0,400);"); 
	  //mail id
	         WebElement Em = driver.findElement(By.id("email"));	                                   
	                                    Em .sendKeys("It's_ME_BABY_8_@gmail.com");
	 //password                                   
	          WebElement Ps =  driver.findElement(By.id("passwd"));
	                                     Ps.sendKeys("12345");
	//sign in                                     
	          WebElement S = driver.findElement(By.xpath("//span[normalize-space()='Sign in']"));
	                                      S.click();     
	//womens click                                      
	          WebElement CK = driver.findElement(By.xpath("//img[@class='logo img-responsive']"));                        
	   		                             CK.click();		
	  js.executeScript("window.scrollBy(0,900)");
	  
	   	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 	   	
	 	  Actions act = new Actions(driver);	
	 //tshirt	  
	   	      WebElement  open =driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
	   	                          act.click(open).build().perform();  
	 //Quantity  	                          
	                                driver.switchTo().frame(1);
	   	      WebElement P = driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
	   	                            act.click(P).build().perform();
	   	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
	//submit
	   		  WebElement Ac =driver.findElement(By.name("Submit"));
	   		                        Ac.click();
	  Actions a= new Actions(driver);	                       
	   		WebDriverWait wait = new WebDriverWait(driver,20);     		
	   		                       driver.switchTo().parentFrame();
	//Proceed to check out   		                       
	   	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']"))));
	   		                      // driver.switchTo().parentFrame();
	   		         a.click(driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']"))).build().perform();
   js.executeScript("window.scrollBy(0,800)");                                   
                    a.click(driver.findElement(By.xpath("(//span[normalize-space()='Proceed to checkout'])[2]"))).build().perform();
   js.executeScript("window.scrollBy(0,800)");                     
         WebElement e = driver.findElement(By.name("message"));
                                    e.sendKeys("styleesaloon opp");                                 
	   		         a.click(driver.findElement(By.xpath("(//span[normalize-space()='Proceed to checkout'])[2]"))).build().perform();
  js.executeScript("window.scrollBy(0,800)");         
	     WebElement R =driver.findElement(By.id("cgv")); 
	   		                        R.click();
	   		         a.click(driver.findElement(By.xpath("(//span[normalize-space()='Proceed to checkout'])[2]"))).build().perform();
  js.executeScript("window.scrollBy(0,400)");   
                                     // ScreenShot
    
                         TakesScreenshot Ts = (TakesScreenshot)driver;
                           File Src = Ts.getScreenshotAs(OutputType.FILE);
                           File Des = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Screenshot/Payment.png");
                           FileUtils.copyFile(Src, Des);
  
    }
  
}  
  
  
  
  
  

