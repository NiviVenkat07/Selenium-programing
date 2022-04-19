package Alert_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_7 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver 1\\chromedriver.exe");
								
				WebDriver driver = new ChromeDriver();
					driver.get("  https://netbanking.hdfcbank.com/netbanking/ ");
				driver.manage().window().maximize();
		
				driver.switchTo().frame(0);
				WebElement id = driver.findElement(By.xpath("//input[@type='text']"));
				 id.sendKeys("12345678");
				
				 WebElement con = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
				   con.click();
				
				driver.switchTo().alert().accept();
				   
				//mouse ri8 click is disabled
}
}