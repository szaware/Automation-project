package DemoEcomm;

import java.net.HttpURLConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class brokenLinkFindOut {
	WebDriver driver = null;
	@BeforeMethod
	public void dosetup() {
		driver = new ChromeDriver();
	}
	public void broken_links() {
		String homePage = "https://demowebshop.tricentis.com";
		String url = "";
		HttpURLConnection huc = null;
		int respCode = 200;
		driver.manage().window().maximize();

		driver.get(homePage);
		
	}

}
