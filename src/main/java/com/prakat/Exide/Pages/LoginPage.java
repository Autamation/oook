package com.prakat.Exide.Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.prakat.Generic.Helper.ExcelHelper;

public class LoginPage {
	@FindBy(id = "username")
	private WebElement userNameEdit;
	@FindBy(id = "password")
	private WebElement passwordEdit;

	@FindBy(xpath = "//button[text()='Login']")
	private WebElement loginButton;
	
	
	@FindBy(id="profileDropdown")
	private WebElement ProfileDropdown;
	public WebElement getProfileDropdown() {
		return ProfileDropdown;
	}
	
	
	@FindBy(xpath = "//img[@alt='Logout']")
	private WebElement logoutButton;	
	public WebElement getLogoutButton() {
		return logoutButton;
	}	

	/*
	 * @FindBy(linkText="Skip for now")
	 * 
	 * private WebElement skipForMobileLink;
	 * 
	 * public WebElement getSkipForMobileLink() { return skipForMobileLink; }
	 */

	public WebElement getUserNameEdit() {
		return userNameEdit;
	}

	public WebElement getPasswordEdit() {
		return passwordEdit;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void login() throws IOException, Throwable {
		ExcelHelper xlib = new ExcelHelper();
		// Getting username from excel sheet
		String un = xlib.getExcelData("Exide", 1, 0);
		// Getting password from excel sheet
		String pw = xlib.getExcelData("Exide", 1, 1);
		userNameEdit.sendKeys(un);

		passwordEdit.sendKeys(pw);

		loginButton.click();

	}

}
