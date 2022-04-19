package Alert_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver 1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lvbank.com/search.aspx?zoom_query=");
		driver.manage().window().maximize();
		
		WebElement go = driver.findElement(By.xpath("//a[text()='Go to Homepage']"));
		     go.click();
		
		WebElement x = driver.findElement(By.xpath("//a[@class='boxclose']"));
		    x.click();
	}		
}
