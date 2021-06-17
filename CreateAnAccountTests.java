package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAnAccountTests extends BaseTests {

	@BeforeMethod
	public void beforeEveryTest() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	}
	
	 @Test (priority = 0)
		public void createAnAccountInvalidEmail() throws InterruptedException {
			String insertInvalidPassword = excelReader.getStringData("CreateAnAccount", 7, 3);
			mainNavigation.signInTabClick();
			createAnAccountPage.getsignInButtonClick();
			createAnAccountPage.getinvalidEmailAddress();
			createAnAccountPage.getsignInButtonClick();
		}
	
	 @Test (priority = 0)
		public void createAnAccountValidEmail() throws InterruptedException {
			String insertValidPassword = excelReader.getStringData("CreateAnAccount", 19, 3);
			mainNavigation.signInTabClick();
			createAnAccountPage.getsignInButtonClick();
			createAnAccountPage.getvalidEmailAddress();
			createAnAccountPage.getsignInButtonClick();
			
		}
	 @Test (priority = 0)
		public void createAnAccountPersonalInfoFields() throws InterruptedException {
			String insertTitle = excelReader.getStringData("CreateAnAccount", 31, 3);
			String insertFirstName = excelReader.getStringData("CreateAnAccount", 32, 3);
			String insertLastName = excelReader.getStringData("CreateAnAccount", 33, 3);
			String insertValidEmail = excelReader.getStringData("CreateAnAccount", 34, 3);
			String insertvalidPassword = excelReader.getStringData("CreateAnAccount", 35, 3);
			String insertDateOfBirthDay = excelReader.getStringData("CreateAnAccount", 36, 3);
			String insertDateOfBirthMonth = excelReader.getStringData("CreateAnAccount", 36, 4);
			String insertDateOfBirthYear = excelReader.getStringData("CreateAnAccount", 36, 5);
			mainNavigation.signInTabClick();
		}
	 @Test (priority = 0)
		public void createAnAccountAddressFieldsRegistered() throws InterruptedException {
			String insertFirstName = excelReader.getStringData("CreateAnAccount", 48, 3);
			String insertLastName = excelReader.getStringData("CreateAnAccount", 49, 3);
			String insertAddress = excelReader.getStringData("CreateAnAccount", 50, 3);
			String insertCity = excelReader.getStringData("CreateAnAccount", 51, 3);
			String insertState = excelReader.getStringData("CreateAnAccount", 52, 3);
			String insertPostalCode = excelReader.getStringData("CreateAnAccount", 53, 3);
			String insertCountry = excelReader.getStringData("CreateAnAccount", 54, 3);
			String insertMobilePhone = excelReader.getStringData("CreateAnAccount", 55, 3);
			String insertAliasAddress = excelReader.getStringData("CreateAnAccount", 56, 3);
			mainNavigation.signInTabClick();
			createAnAccountPage.getRegister();
		}
	
	
	@AfterMethod
	public void afterEveryTest() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
	
}
