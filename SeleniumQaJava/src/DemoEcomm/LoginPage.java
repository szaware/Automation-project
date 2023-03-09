package DemoEcomm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPage {

	WebDriver driver = null;

	@BeforeMethod
	public void doSetup() {

		driver = new ChromeDriver();
	}

	@Test(priority = 1)
	public void launchWebApp() {
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println("The website of title is" + driver.getTitle());
		driver.close();
	}

	@Test(priority = 2)
	public void registerUserFunctionality() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@class=\"button-1 register-button\"]")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Swapnil");
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Zaware");
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("electronicspathshala@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Szaware@123");
		driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("Szaware@123");
		driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
		driver.close();

	}

	@Test(priority = 3, dependsOnMethods = { "registerUserFunctionality" })
	public void loginFunctionality() {
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("electronicspathshala@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Szaware@123");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(
				By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"))
				.click();
		driver.close();
	}
	
}
