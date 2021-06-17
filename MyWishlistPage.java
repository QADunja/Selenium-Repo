package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyWishlistPage {

	WebDriver driver;
    WebElement myWishlistButton;
    WebElement newNameWishlistInsert;
    WebElement saveButton;
    WebElement xButton;
    WebElement oKButton;
	
    public MyWishlistPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getmyWishlistButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[2]/ul/li/a/span"));
	}
	
	public WebElement getnewWishlistInsert() {
		return driver.findElement(By.id("name"));
	}
	
	public WebElement getsaveButton() {
		return driver.findElement(By.id("submitWishlist"));
	}
	
	public WebElement getxButton () {
		return driver.findElement(By.xpath("//*[@id=\"wishlist_35383\"]/td[6]/a/i"));
	}
	
	public WebElement getoKButton () {
		return driver.findElement(By.id(""));  //??
	}
	
	public void myWishlisButtonClick() {
		this.getmyWishlistButton().click();
	}
	
	public void newNameWishlistInsert() {
		this.getnewWishlistInsert().getText();
	}
	
	public void saveButtonClick() {
		this.getsaveButton().click();
	}
	
	public void xButtonClick() {
		this.getxButton().click();
	}
	
	
}
