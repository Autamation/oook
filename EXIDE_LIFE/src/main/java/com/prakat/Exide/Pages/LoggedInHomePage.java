package com.prakat.Exide.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.prakat.Generic.Helper.MouseoverHelper;

public class LoggedInHomePage {
	@FindBy(xpath="//a[@class='user-menu-button']")
	private WebElement profile;
	
	@FindBy(xpath="//a[@rel='nofollow']")
	private WebElement logoutButton;
	
	
	WebDriver driver;
	public LoggedInHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void logout() {
		MouseoverHelper mOver= new MouseoverHelper();
		mOver.getMovetoElement(profile);
		//profile.click();
		logoutButton.click();
		
	}
	

}
