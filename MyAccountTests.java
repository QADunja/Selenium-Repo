package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.MyAccountPage;

public class MyAccountTests extends BaseTests {

	@BeforeMethod
	public void beforeEveryTest() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	}
	
	 @Test (priority = 0)
		public void myAccountOrderPageTest() throws InterruptedException {
			myAccountPage.goToOrderHistoryAndDetailsClick();
			
		}
	
	 @Test (priority = 0)
		public void myAccountCreditPageTest() throws InterruptedException {
			myAccountPage.goToMyCreditSlipsClick();
			
		}
	 @Test (priority = 0)
		public void myAccountAddressessPageTest() throws InterruptedException {
			myAccountPage.goToMyAddressesClick();
			
		}
	 @Test (priority = 0)
		public void myAccountPrsonalPageTest() throws InterruptedException {
			myAccountPage.goToMyPersonalInformationClick();
			
		}
	 @Test (priority = 0)
		public void myAccountWishlistPageTest() throws InterruptedException {
			myAccountPage.goToMyWishlistClick();
			
		}
	
	
	@AfterMethod
	public void afterEveryTest() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
	
	
}
