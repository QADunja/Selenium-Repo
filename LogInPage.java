package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {

	WebDriver driver;
	WebElement emailaddressField;
	WebElement passwordField;
	WebElement signInButtonClick;
	WebElement forgotYourPasswordClick;
	WebElement invalidEmailAddressField;
	WebElement invalidPasswordField;
	WebElement emptyEmailAddressField;
	WebElement emptyPasswordField;
	WebElement signOutButton;
	
	public LogInPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getEmailaddressField() {
		return driver.findElement(By.id("email"));
	}

	public WebElement getPasswordField() {
		return driver.findElement(By.id("passwd"));
	}

	public WebElement getSignInButtonClick() {
		return driver.findElement(By.id("SubmitLogin"));
	}

	public WebElement getForgotYourPasswordClick() {
		return driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/p[1]/a"));
	}

	public WebElement getInvalidEmailAddressField() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]"));  
	}

	public WebElement getInvalidPasswordField() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));
	}

	public WebElement getEmptyEmailAddressField() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol"));
	}

	public WebElement getEmptyPasswordField() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol"));
	}
	
	public WebElement getSignOutButton() {
		return driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));
	}
	
	public void insertEmailAddress(String emailAddress) {
		this.getEmailaddressField().sendKeys(emailAddress);
	}
	
	public void insertPassword(String password) {
		this.getPasswordField().sendKeys(password);
	}
	
	public void signInButtonClick() {
		this.getSignInButtonClick().click();
	}
	
	public void forgotYourPasswordClick() {
		this.getForgotYourPasswordClick().click();
	}
	
	public void insertInvalidEmailAddreess() {
		this.getInvalidEmailAddressField().sendKeys("dunja@gmail.com");
	}

	public void insertInvalidPassword() {
		this.getInvalidPasswordField().sendKeys("abcd");
	}
	
	public void emptyEmailAddress() {
		this.getEmptyEmailAddressField().clear();
	}
	
	public void emptyPassword() {
		this.getEmptyPasswordField().clear();
	}
	
	public void signOutButtonClick() {       
		this.getSignOutButton().click();
	}
	
	public void logInFormFilling(String emailAddress, String password) {
		this.insertEmailAddress(emailAddress);
		this.insertPassword(password);
	}
	
}
