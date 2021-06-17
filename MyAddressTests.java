package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class MyAddressTests extends BaseTests {

	@BeforeMethod
	public void beforeEveryTest() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	}
	
	
	
	
	
	
	@AfterMethod
	public void afterEveryTest() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
	
	
	
}
