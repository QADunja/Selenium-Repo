package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.AutentificationPage;
import pages.CreateAnAccountPage;
import pages.MainNavigation;
import pages.MyAccountPage;
import pages.MyAddressesPage;
import pages.MyPersonalInfoPage;
import pages.MyWishlistPage;
import pages.LogInPage;

public class BaseTests { 

	WebDriver driver;
	ExcelReader excelReader;
	String homeUrl;
	
	MainNavigation mainNavigation;
	CreateAnAccountPage createAnAccountPage;
	AutentificationPage autentificationPage;
	LogInPage logInPage;
	MyAccountPage myAccountPage;
	MyAddressesPage myAddressesPage;
	MyWishlistPage myWishlistPage;
	MyPersonalInfoPage myPersonalInfoPage;
	
	@BeforeClass
	public void beforeTests() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		excelReader = new ExcelReader("data/AutomationTestPlanSelenium.xlsx");
		homeUrl = "http://automationpractice.com/index.php";
		
		mainNavigation = new MainNavigation(driver);
		createAnAccountPage = new CreateAnAccountPage(driver);
		autentificationPage = new AutentificationPage(driver);
		logInPage = new LogInPage(driver);
		myAccountPage = new MyAccountPage(driver);
		myAddressesPage = new MyAddressesPage(driver);
		myWishlistPage = new MyWishlistPage(driver);
		myPersonalInfoPage = new MyPersonalInfoPage(driver);
	}

	@AfterClass
	public void afterTests() {
		driver.close();
	}
}
