package com.prakat.Exide.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Questionnarie {
	// Elements Locator For Questionnarie 51-54 For No Radio Botton
	@FindBy(xpath = "(//Label[@class='radioLabel'])[2]")
	private WebElement noRadioBtn;

	public WebElement getnoRadioBtn() {
		return noRadioBtn;
	}

	// Elements Locator For Questionnarie 55 For No Radio Botton
	@FindBy(xpath = "//label[@for='minsuranceNo']")
	private WebElement noradiobtn;

	public WebElement getnoradiobtn() {
		return noRadioBtn;
	}

	// ExitingInsuranceDetails Text
	@FindBy(xpath = "//div[contains(text(),'Existing Insurance Details')]")
	private WebElement ExitingInsuranceDetailsText;

	public WebElement getExitingInsuranceDetailsText() {
		return ExitingInsuranceDetailsText;
	}

	// Questionaries
	@FindBy(xpath = "(//button[contains(text(),'Save and Proceed')])[1]")
	private WebElement saveandproceedQuestionInsuCover;

	public WebElement getsaveandproceedQuestionInsuCover() {
		return saveandproceedQuestionInsuCover;
	}

	// Height, health and life style
	@FindBy(xpath = "//input[@placeholder='Enter height']")
	private WebElement healthHeight;

	public WebElement gethealthHeight() {
		return healthHeight;
	}

	// weight, health and life style
	@FindBy(xpath = "//input[@placeholder='Enter weight']")
	private WebElement healthWeight;

	public WebElement gethealthWeight() {
		return healthWeight;
	}
	
	//Tobbaco/gutka Yes radio button
	@FindBy(id = "tobaccoYes")
	private WebElement tobaccoYesBtn;

	public WebElement gettobaccoYesBtn() {
		return tobaccoYesBtn;
	}
	
	
	//Tobbaco/gutka No radio button
	@FindBy(id = "tobaccoNo")
	private WebElement tobaccoNoBtn;

	public WebElement gettobaccoNoBtn() {
		return tobaccoNoBtn;
	}	
	
	

	@FindBy(xpath = "(//button[2][contains(text(),'Save and Proceed')])[2]")
	private WebElement saveandproceedQuestionHealth;

	public WebElement getsaveandproceedQuestionHealth() {
		return saveandproceedQuestionHealth;
	}

	// Elements Locator For health and life save and draft
	@FindBy(xpath = "(//button[@class='btn btn-default'])[1]")
	private WebElement savendraft;

	public WebElement getsavendraft() {
		return savendraft;
	}

	// Elements Locator For Questionnarie Save And Proceed Botton
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement saveanproceed;

	public WebElement getsaveanproceed() {
		return saveanproceed;
	}

	// Elements Locator For Any Disease Radio Botton
	@FindBy(xpath = "//label[@for='diseaseNo']")
	private WebElement diseasebtn;

	public WebElement getdiseasebtn() {
		return diseasebtn;
	}

	// Elements Locator For Height Text Field
	@FindBy(xpath = "//input[@placeholder='Enter height']")
	private WebElement height;

	public WebElement getheigh() {
		return height;
	}

	// Elements Locator For weight Text Field
	@FindBy(xpath = "//input[@placeholder='Enter weight']")
	private WebElement weight;

	public WebElement getweight() {
		return weight;
	}

	// Elements Locator For Tobacco Radio Button
	@FindBy(xpath = "//label[@for='tobaccoNo']")
	private WebElement tobbaco;

	public WebElement gettobbaco() {
		return tobbaco;
	}

	// Elements Locator For smoking habit select option
	@FindBy(xpath = "//select[@class='ng-valid ng-dirty ng-touched']")
	private WebElement smoking;

	public WebElement getsmoking() {
		return smoking;
	}

	// Elements Locator For alcohol drinking check box
	// @FindBy(xpath="//label[@for='noDrink']")
	@FindBy(xpath = "//*[text()='Does not drink']")
	// div[@class='form-check']/input[@id='noDrink']/following-sibling::label")
	private WebElement drink;

	public WebElement getdrink() {
		return drink;
	}

	// Elements Locator For 64-83 radio button
	@FindBy(xpath = "(//label[@class='radioLabel'])[5]")
	private WebElement secno;

	public WebElement getsecno() {
		return secno;
	}

	// Elements Locator For vaccine radio button
	@FindBy(xpath = "//label[@for='vaccineYes']")
	private WebElement vaccine;

	public WebElement getvaccine() {
		return vaccine;
	}

	// Elements Locator For political person radio button
	@FindBy(xpath = "//label[@for='legalNo']")
	private WebElement political;

	public WebElement getpolitical() {
		return political;
	}

	// Elements Locator For Declaration for radio button
	@FindBy(xpath = "//label[@for='premiumLegalYes']")
	private WebElement proposal;

	public WebElement getproposal() {
		return proposal;
	}

	// Elements Locator For health and life save and draft
	@FindBy(xpath = "(//button[@class='btn btn-default'])[1]")
	private WebElement savedraft;

	public WebElement getsavedraft() {
		return savedraft;
	}

	// Elements Locator For health and life save and proceed
	@FindBy(xpath = "(//button[@class='btn btn-primary'])[2]")
	private WebElement saveproceed;

	public WebElement getsaveproceed() {
		return saveproceed;
	}

	// Elements Locator questionarie Non Smoker select field
	@FindBy(xpath = "(//div[@class='form-group']//select)[2]")
	private WebElement nonsmoke;

	public WebElement getnonsmoke() {
		return nonsmoke;
	}

	WebDriver driver;

	public Questionnarie(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
