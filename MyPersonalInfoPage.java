package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyPersonalInfoPage {

	WebDriver driver;
	WebElement CurrentPassword;
	WebElement NewPassword;
	WebElement Confirmation;
	WebElement SaveButton;
	
	public  MyPersonalInfoPage (WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getcurrentPassword () {
		return driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
	}
	
	public WebElement getnewPassword () {
		return driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
	}
	
	public WebElement getconfirmation () {
		return driver.findElement(By.xpath("//*[@id=\"confirmation\"]"));
	}
	
	public WebElement getsaveButton () {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/form/fieldset/div[11]/button"));
	}
	
	public void insertCurrentPassword() {
		this.getcurrentPassword().getText();
	}
	
	public void insertNewPassword() {
		this.getnewPassword().getText();
	}
	
	public void insertConfirmation() {
		this.getconfirmation().getText();
	}
	
	public void saveButtonClick () {
		this.getsaveButton().click();
	}
	
	
}
