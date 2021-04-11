package etsyopenbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class openbrowser {


	public static WebDriver driver = null;
	public static String testUrl ="https://www.etsy.com/shop/DaisyOnyx";

	@BeforeTest
	public void driverbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Brian\\Desktop\\Eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test	
	public void openbrowseretsy() throws InterruptedException {
		driver.get(testUrl);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		driver.close();

		try {
			driver.quit();
		}
		catch (Exception e) {
			System.out.println("Unable to close browser after login header exception caught: " + e);
		}
	}


}
