package Alert_Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_5 {

	public static void main(String[] args) {
	
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver 1\\chromedriver.exe");
									
					WebDriver driver = new ChromeDriver();
						driver.get("  https://retail.onlinesbi.com/retail/login.htm");
					driver.manage().window().maximize();
			
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
