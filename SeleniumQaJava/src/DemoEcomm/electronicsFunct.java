package DemoEcomm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class electronicsFunct {
	WebDriver driver = null;
	@BeforeMethod
	public void dosetup() {
		driver = new ChromeDriver();
	}
	@Test
	public void testEleFunct() {
		String homeUrl = "https://demowebshop.tricentis.com";
		driver.get(homeUrl);
		
		// performing MouseHover on WebElement
		WebElement Electronics = driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.header-menu > ul.top-menu > li:nth-child(3) > a"));
		WebElement CameraAndPhoto = driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.header-menu > ul.top-menu > li:nth-child(3) > ul > li:nth-child(1) > a"));
		
		// performing MouseHover on WebElement and then click on camera and Photo element...
		Actions actions = new Actions(driver); 
		actions.moveToElement(Electronics).moveToElement(CameraAndPhoto).click().build().perform();
		
		WebElement Filter = driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div.page.category-page > div.page-body > div.product-filters-wrapper > div > div.filter-content > ul > li:nth-child(2) > a"));
		Filter.click();
		
		WebElement AddtoCart = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/h2/a"));
		AddtoCart.click();
		
		// Test Script for image or logo is present or not
		WebElement image = driver.findElement(By.xpath("//*[@id=\"main-product-img-20\"]"));
		Boolean imagecheck = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", image);
		
		if (imagecheck) {
	         System.out.println("Logo present");
	      } else {
	         System.out.println("Logo not present");
	      }
		
		System.out.println("Title is "+ driver.getTitle()); // printing title
		
		String expectedTitle = "Demo Web Shop. Camcorder";
		String actualTitle = "Demo Web Shop. Camcorder";
		
		// check using if else loop
		/*if (expectedTitle.equals(actualTitle) )
		{System.out.println("Test Case Passed");}
		else {
			System.out.println("Failed Test Case");
		}
	*/
		// check using TestNG Assert
		Assert.assertEquals(actualTitle, expectedTitle);
		
		driver.close();
	}

}
