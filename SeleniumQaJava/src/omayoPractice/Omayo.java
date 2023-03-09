package omayoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


	

@Test
public class Omayo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swapnil Zaware\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
	   driver.get("https://omayo.blogspot.com/");
	   driver.manage().window().maximize();
	   	  
	   Select select = new Select(driver.findElement(By.id("drop1")));
	   select.selectByVisibleText("doc 4");
	   
	   driver.findElement(By.cssSelector("#ta1")).sendKeys("I am Swapnil Baba Zaware. I want to become a Succesful Software Tester in Automation");
	   driver.quit();
	   
	 
	   
	   
	   
	}

}
