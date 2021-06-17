package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyPersonalInfoTests extends BaseTests {

	@BeforeMethod
	public void beforeEveryTest() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	}
	
	 @Test (priority = 0)
		public void editMyPersonalInfo() throws InterruptedException {
			String insertCurrentPassword = excelReader.getStringData("MyPersonalInfo", 10, 3);
			String insertNewPassword = excelReader.getStringData("MyPersonalInfo", 11, 3);
			String insertConfirmation = excelReader.getStringData("MyPersonalInfo", 12, 3);
			mainNavigation.signInTabClick();
			myPersonalInfoPage.insertCurrentPassword();
			myPersonalInfoPage.insertNewPassword();
			myPersonalInfoPage.insertConfirmation();
			myPersonalInfoPage.getsaveButton();
		}
	
	
	@AfterMethod
	public void afterEveryTest() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
	
	
	
}
