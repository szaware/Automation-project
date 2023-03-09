package DemoEcomm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BooksFunctionality {
	
	public class Books {
		
		WebDriver driver = null;
			
			@BeforeMethod
		public void doSetup() {
				
			driver=new ChromeDriver();
			
			}
			@Test(priority=1)
			public void sortingFunc() {
				 driver.get("https://demowebshop.tricentis.com/books");
				System.out.println("The website of title is" + driver.getTitle());
				driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a")).click();
		Select select = new Select(driver.findElement(By.xpath("//select[@id=\"products-orderby\"]")));
		Select displayPerPage = new Select (driver.findElement(By.xpath("//select[@name='products-pagesize']")));
		select.selectByVisibleText("Name: A to Z");
		displayPerPage.selectByValue("8");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/h2/a]")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		
		
		driver.close();
		
	}
	}}
	
	
	
	


