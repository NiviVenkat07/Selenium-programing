package Firefox_driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fb_login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Geckodriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println("URL launched successfully");
		
		WebElement Email =driver.findElement(By.id("email"));
		Email.sendKeys("nivivenkat2125@gmail.com");
		
		System.out.println("Email entered");
		
		WebElement password =driver.findElement(By.id("pass"));
		password.sendKeys("Nivi123");
		
		System.out.println("Password entered");
		
		WebElement login =driver.findElement(By.name("login"));
		login.click();
		
		
		System.out.println(" login clicked ");
		
	}
	
	
	
	
	
	
	
	
	
}
