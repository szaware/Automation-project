package DemoEcomm;

import java.lang.reflect.Method;
import org.asynchttpclient.util.HttpConstants.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class commputers {
WebDriver driver  = null;
@BeforeMethod
	public void dosetup() {
		driver = new ChromeDriver();
	}
		
		@Test
	public void computersTest() {
		driver.get("https://demowebshop.tricentis.com/computers");
		System.out.println("Starting Test Case ");
		System.out.println("The Title of this Page is "+ driver.getTitle());
		sleep(5);
	
		driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.header-menu > ul.top-menu > li:nth-child(2) > a")).click();
		driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div.page.category-page > div.page-body > div.sub-category-grid > div:nth-child(1) > div > div > a")).click();
		Select select = new Select (driver.findElement(By.xpath("//*[@id=\"products-orderby\"]")));
		select.selectByVisibleText("Price: High to Low");
		driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div.page.category-page > div.page-body > div.product-grid > div:nth-child(1) > div > div.details > h2 > a")).click();
		driver.findElement(By.id("product_attribute_74_5_26_80")).click();
		driver.findElement(By.id("product_attribute_74_8_29_88")).click();
		driver.findElement(By.xpath("//*[@id=\"addtocart_74_EnteredQuantity\"]\r\n")).sendKeys("2");
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-74\"]")).click();
		
		
		
		
		
		String expected_title = "Demo Web Shop. Computers";
		String actual_title = "Demo Web Shop. Computers";
		
		/*if (expected_title.equals(actual_title)) {
			System.out.println("Test Case PASS");
		}
		else {
			System.out.print("Test Case FALSE");
		}
		
	
		System.out.println("Ending test case");
		*/
		//Assert.assertEquals(actual_title, expected_title);
		org.testng.Assert.assertEquals(actual_title, expected_title);
		sleep(2000);
		driver.close();
	}
		
	private static void sleep(int i) {
		
		// TODO Auto-generated method stub
	}
	}
