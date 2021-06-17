package pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAnAccountPage {

	WebDriver driver;
	WebElement EmailAddress;
	WebElement CreateAnAccount;
	WebElement TitleGender1;
	WebElement TitleGender2;
	WebElement FirstName;
	WebElement LastName;
	WebElement Password;
	WebElement DateOfBirthDay;
	WebElement DateOfBirthMonth;
	WebElement DateOfBirthYear;
	WebElement SignUpNewsletter;
	WebElement RecieveSpecialOffers;
	
	WebElement Company;
	WebElement Address;
	WebElement AddressLine2;
	WebElement City;
	WebElement State;
	WebElement ZipPostalCode;
	WebElement Country;
	WebElement AdditionalInformation;
	WebElement HomePhone;
	WebElement MobilePhone;
	WebElement AssignForReference;
	WebElement Register;
	
	public CreateAnAccountPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getEmailAddress() {
		return driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
	}

	public WebElement getCreateAnAccount() {
		return driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
	}

	public WebElement getTitleGender1() {
		return driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
	}
	
	public WebElement getTitleGender2() {
		return driver.findElement(By.xpath("//*[@id=\"id_gender2\"]"));
	}

	public WebElement getFirstName() {
		return driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
	}

	public WebElement getLastName() {
		return driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
	}

	public WebElement getPassword() {
		return driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
	}

	public WebElement getDateOfBirthDay() {
		return driver.findElement(By.xpath("//*[@id=\"days\"]"));
	}

	public WebElement getDateOfBirthMonth() {
		return driver.findElement(By.xpath("//*[@id=\"months\"]"));
	}

	public WebElement getDateOfBirthYear() {
		return driver.findElement(By.xpath("//*[@id=\"years\"]"));
	}

	public WebElement getSignUpNewsletter() {
		return driver.findElement(By.xpath("//*[@id=\"newsletter\"]"));
	}

	public WebElement getRecieveSpecialOffers() {
		return driver.findElement(By.xpath("//*[@id=\"optin\"]"));
	}

	public WebElement getCompany() {
		return driver.findElement(By.xpath("//*[@id=\"company\"]"));
	}

	public WebElement getAddress() {
		return driver.findElement(By.xpath("//*[@id=\"address1\"]"));
	}

	public WebElement getAddressLine2() {
		return driver.findElement(By.xpath("//*[@id=\"address2\"]"));
	}

	public WebElement getCity() {
		return driver.findElement(By.xpath("//*[@id=\"city\"]"));
	}

	public WebElement getState() {
		return driver.findElement(By.xpath("//*[@id=\"id_state\"]"));
	}

	public WebElement getZipPostalCode() {
		return driver.findElement(By.xpath("//*[@id=\"postcode\"]"));
	}

	public WebElement getCountry() {
		return driver.findElement(By.xpath("//*[@id=\"id_country\"]"));
	}

	public WebElement getAdditionalInformation() {
		return driver.findElement(By.xpath("//*[@id=\"other\"]"));
	}

	public WebElement getHomePhone() {
		return driver.findElement(By.xpath(""));
	}

	public WebElement getMobilePhone() {
		return driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
	}

	public WebElement getAssignForReference() {
		return driver.findElement(By.xpath("//*[@id=\"alias\"]"));
	}

	public WebElement getRegister() {
		return driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
	}
	
	public void getsignInButtonClick() {
		this.getsignInButtonClick();
	}
	
	public void getinvalidEmailAddress() {
		this.getinvalidEmailAddress();
	}
	
	public void getvalidEmailAddress() {
		this.getvalidEmailAddress();
	}
	
	public void createAnAccountButtonClick() {
		this.createAnAccountButtonClick();
	}
	
	
}
