package loginpage;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class login {
	    private WebDriver driver;

	   
	    	
	    
	    
	    @BeforeMethod
	    public void setUp() {
	        // Set up the Chrome driver
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Swapnil Zaware\\Downloads\\Libraries sel\\chromedriver_win32\\chromedriver.exe");

	        driver = new ChromeDriver();
	        // Maximize the window
	        driver.manage().window().maximize();
	    }

	    @Test
	    public void testLogin() {
	        // Navigate to the login page
	        driver.get("https://sakshingp.github.io/assignment/login.html");

	        // Find the email and password input fields
	        driver.findElement(By.id("username")).sendKeys("swapnil");
	        driver.findElement(By.id("password")).sendKeys("12345");
	        

	        // Check that we are logged in by finding the logout button
	        driver.findElement(By.xpath("//*[@id=\"log-in\"]")).click();
	     // Wait for the page to load
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        driver.quit();	    }

	   
	}



