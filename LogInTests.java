package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTests extends BaseTests {

	@BeforeMethod
	public void beforeEveryTest() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	}
	
    @Test (priority = 0)
	public void logInInvalidEmail() throws InterruptedException {
		String insertInvalidEmail = excelReader.getStringData("LogIn", 7, 3);
		String insertValidPassword = excelReader.getStringData("LogIn", 8, 3);
		mainNavigation.signInTabClick();
		logInPage.signInButtonClick();
	}
	
	@Test (priority = 0)
	public void logInInvalidPassword() throws InterruptedException {
		String insertValidEmailAddress = excelReader.getStringData("LogIn", 20, 3);
		String insertInvalidPassword = excelReader.getStringData("LogIn", 21, 3);
		mainNavigation.signInTabClick();
		logInPage.signInButtonClick();
	}
	
	@Test(priority = 0)
	public void logInEmptyEmail() throws InterruptedException {
		String insertEmptyEmail = excelReader.getStringData("LogIn", 34, 3);
		String insertValidPassword = excelReader.getStringData("LogIn", 35, 3);
		mainNavigation.signInTabClick();
		logInPage.signInButtonClick();
	}
	
	@Test(priority = 0)
	public void logInEmptyPassword() throws InterruptedException {
		String insertValidEmailAddress = excelReader.getStringData("LogIn", 46, 3);
		String insertEmptyPassword = excelReader.getStringData("LogIn", 47, 3);
		mainNavigation.signInTabClick();
		logInPage.signInButtonClick();
	}
	
	@Test (priority = 0)
	public void logInValidCredentials() {
		String emailAddress = excelReader.getStringData("LogIn", 60, 3);
		String password = excelReader.getStringData("LogIn", 61, 3);
		mainNavigation.signInTabClick();
		logInPage.signInButtonClick();
		String textForAssertion = excelReader.getStringData("LogIn", 62, 3);
	    assertEquals(textForAssertion, textForAssertion);
	}
	
	@AfterMethod
	public void afterEveryTest() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
	
	
	
}
