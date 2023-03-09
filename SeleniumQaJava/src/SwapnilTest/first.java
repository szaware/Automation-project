package SwapnilTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class first {
	WebDriver driver = null;
	
	@Test (priority=1)
public void doSetup() {
		
	driver=new ChromeDriver();
	}
	
	@Test
public void launchbrowser() {
	driver.get("https://sakshingp.github.io/assignment/login.html");
	}
	
	@Test(priority=3)
public void maxScreen() {
		driver.manage().window().maximize();
	}
	
	@Test(priority=4)
public void login()
	{
		driver.findElement(By.id("username")).sendKeys("swapnil123");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id=\"log-in\"]")).click();
	}
	public void loginClick() 
	{
		}
	@Test(priority=5)
public void printScreen() {
		String title = driver.getTitle();
		System.out.println("Page title: " + title);
	}
	
	@AfterTest()
public void closeBrowser() {
		driver.quit();
	}
	public static void main(String[] args) throws Exception {
		
		System.out.println("Login Test Case");
	
	

	
// Closing the browser
	
	
	
	}

}
