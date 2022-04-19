package Adactin_practice_project;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Runner_class_1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Project_Class\\Driver\\chromedriver.exe");
		
	            	WebDriver driver = new ChromeDriver();
		
                driver.get("https://adactinhotelapp.com/");
		
		        driver.manage().window().maximize();
	//new user register
		        
		WebElement NR = driver.findElement(By.xpath("//a[normalize-space()='New User Register Here']"));
		                     NR .click();
    //username
		                     
		WebElement Us = driver.findElement(By.name("username"));
		                 Us.sendKeys("nivivenkat4");
	//Password
		                 
		WebElement Ps = driver.findElement(By.id("password"));
		                 Ps.sendKeys("Nivi12345");
	//confirm password
		                 
		WebElement Cp = driver.findElement(By.id("re_password"));
		                 Cp.sendKeys("Nivi12345");
	//Full name
		                 	
		 WebElement Fn = driver.findElement(By.id("full_name"));
		                 Fn.sendKeys("Nivedhaa shri");
	//Email-id
		                 
		WebElement Em = driver.findElement(By.id("email_add"));
		                 Em.sendKeys("nivivenkat2125@gmail.com");
	//Captcha name
		       
		      String captchaval = JOptionPane.showInputDialog(driver.findElement(By.id("captcha"))); // popup typing
		     WebElement Cn = driver.findElement(By.id("captcha-form"));
		                  Cn.sendKeys(captchaval);	        
	//terms
		                  
		      WebElement Tc = driver.findElement(By.id("tnc_box"));
		                 Tc.click();
	//Register
		                 
		      WebElement Reg = driver.findElement(By.id("Submit"));
		                  Reg.click();
   //login to register
		                  
		      WebElement Login = driver.findElement(By.xpath("//a[normalize-space()='Click here to login']"));
		                  Login.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}		
	
}
