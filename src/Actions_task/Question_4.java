package Actions_task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question_4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver 1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.gettyimages.in/"); 
		driver.manage().window().maximize();
	Actions act = new Actions(driver);
	
		WebElement Editorial =driver.findElement(By.xpath("(//a[@class='text-link--sly action--with-emphasis'])[1]"));
		 act.click(Editorial).build().perform();                
		
		WebElement Entertainment =driver.findElement(By.xpath("(//a[@class='landing-secondary-menu__link landing-secondary-menu__link--unselected text-link--sly'])[3]"));
		  act.click(Entertainment).build().perform();                 
		
}
}