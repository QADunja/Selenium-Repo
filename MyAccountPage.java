package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {

	WebDriver driver;
	WebElement orderHistoryAndDetails;
	WebElement myCreditSlips;
	WebElement myAddress;
	WebElement myPersonalInformation;
	WebElement myWishlist;
	
	public  MyAccountPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getOrderHistoryAndDetails() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span"));
	}

	public WebElement getMyCreditSlips() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[2]/a/span"));
	}

	public WebElement getMyAddresses() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a/span"));
	}

	public WebElement getMyPersonalInformation() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a/span"));
	}

	public WebElement getMyWishlist() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[2]/ul/li/a/span"));
	}
	
	public void goToOrderHistoryAndDetailsClick() {
		this.getOrderHistoryAndDetails().click();
	}
	
	public void goToMyCreditSlipsClick() {
		this.getMyCreditSlips().click();
	}
	
	public void goToMyAddressesClick() {
		this.getMyAddresses().click();
	}
	
	public void goToMyPersonalInformationClick() {
		this.getMyPersonalInformation().click();
	}
	
	public void goToMyWishlistClick() {
		this.getMyWishlist().click();
	}
	
	
}
