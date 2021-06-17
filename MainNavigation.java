package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainNavigation {

	WebDriver driver;
	WebElement contactUsTab;
	WebElement signInTab;
	WebElement searchField;
	WebElement womenNavigationTab;
	WebElement dressesNavigationTab;
	WebElement tshirtsNavigationTab;
	WebElement cartDropDownTab;
	WebElement signOutTab;
	WebElement customerAccountTab;
	
	public MainNavigation(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getContactUsTab() {
		return driver.findElement(By.id("contact-link"));
	}

	public WebElement getSignInTab() {
		return driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
	}

	public WebElement getSearchField() {
		return driver.findElement(By.id("search_query_top"));
	}

	public WebElement getWomenNavigationTab() {
		return driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
	}

	public WebElement getDressesNavigationTab() {
		return driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
	}

	public WebElement getTshirtsNavigationTab() {
		return driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
	}

	public WebElement getSignOutTab() {
		return driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));
	}

	public WebElement getCustomerAccountTab() {
		return driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span"));
	}
	
    public void contactUsTabClick() {
		this.getContactUsTab().click();
	}
    public void signInTabClick() {
		this.getSignInTab().click();
	}
    public void searchFieldClick() {
		this.getSearchField().click();
	}
    public void womenNavigationTabClick() {
		this.getWomenNavigationTab().click();
	}
    public void dressesNavigationTabClick() {
		this.getDressesNavigationTab().click();
	}
    public void tshirtsNavigationTabClick() {
		this.getTshirtsNavigationTab().click();
	}
    public void signOutTabClick() {
		this.getSignOutTab().click();
	}
    public void customerAccountTabClick() {
		this.getCustomerAccountTab().click();
	}
}
