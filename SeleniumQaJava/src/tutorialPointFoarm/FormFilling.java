package tutorialPointFoarm;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormFilling {
	WebDriver driver = new ChromeDriver();
	@BeforeMethod
	public void launchBrowser() {
		 driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	 driver.manage().window().maximize();}
	
	@Test
	 public void myName(){
	 driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[6]/div/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Swapnil");
	 driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[6]/div/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Zaware");
	 }
	
	@Test
	public void setInfo() {
		driver.findElement(By.name("sex")).click();
		 driver.findElement(By.name("exp")).click();
	}
	
	@Test
	public void dateOfBirth() {
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[6]/div/form/table/tbody/tr[5]/td[2]/input")).sendKeys("29/09/1997");
	}
	
	@Test
	public void main() {
		 driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[6]/div/form/table/tbody/tr[6]/td[2]/span[2]")).click();
	}
	
	@Test
	public void imageUpload() {
		WebElement uploadFile= driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[6]/div/form/table/tbody/tr[7]/td[2]/input"));
		 uploadFile.sendKeys("C:\\Users\\Swapnil Zaware\\Pictures\\swapnil creation.png");
		
	}
	
	@Test 
	public void selectRegion() {
		 Select select = new Select(driver.findElement(By.name("continents")));
		 select.selectByVisibleText("Europe");
		 Select selectCommand = new Select(driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[6]/div/form/table/tbody/tr[10]/td[2]/select")));
		 selectCommand.selectByVisibleText("WebElement Commands");
	}
	@Test
	public void printPage() {
		 driver.findElement(By.xpath("//*[@id=\"print-page\"]")).click();
		 driver.quit();
	}
	
	@AfterMethod
	public static void main(String[] args) {
	
		// driver.findElement(By.name("submit")).click();
		
		 
	}

}
