package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyWishlistTests extends BaseTests {

	@BeforeMethod
	public void beforeEveryTest() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
		mainNavigation.signInTabClick();
		String emailAddress = excelReader.getStringData("LogIn", 60, 3);
		String password = excelReader.getStringData("LogIn", 61, 3);
		logInPage.signInButtonClick();
	}
	
	 @Test (priority = 0)
		public void AddWishlist () {
			String insertWishlist = excelReader.getStringData("MyWishlist", 9, 3);
			myWishlistPage.getmyWishlistButton();
			myWishlistPage.getnewWishlistInsert();
			myWishlistPage.getsaveButton();
		}
	 @Test (priority = 0)
		public void RemoveWishlist () {
			myWishlistPage.getmyWishlistButton();
		    myWishlistPage.getxButton();
		    myWishlistPage.getoKButton();
		}
	
	
	@AfterMethod
	public void afterEveryTest() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}

	
}
