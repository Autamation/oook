package com.prakat.Exide.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class Summary 
	{
	//Element locators for proceed with below page checkbox
		@FindBy(xpath="//label[@for='proceedPercentage'][1]")
		private WebElement procedwithchkbox;
		public WebElement getprocedwithchkbox()
		{
		  return procedwithchkbox;
		}
		
		//Elements locators for Required documents checkbox 8 page application form
		@FindBy(xpath="//label[@for='0'][1]")
		private WebElement pageAppform;
		public WebElement getpageAppform()
		{
		  return pageAppform;
		}
		
		
		
		//Elements locators for Required documents checkbox ECS and SI form
			@FindBy(xpath="//label[@for='1'][1]")
			private WebElement ecsandsichkbox;
			public WebElement getecsandsichkbox()
			{
			  return ecsandsichkbox;
			}
			

			//Elements locators for Required documents Age proof
				@FindBy(xpath="//label[@for='2'][1]")
				private WebElement Ageproofchkbox;
				public WebElement getAgeproofchkbox()
				{
				  return Ageproofchkbox;
				}
				
				//Elements locators for Required ECS and SI
				@FindBy(xpath="//input[@for='3'][1]")
				private WebElement ECSchkbox;
				public WebElement getECSchkbox()
				{
				  return ECSchkbox;
				}
				
				//Elements locators for save and validate
				
				@FindBy(xpath="//button[contains(text(),' Save and Validate ')]")
				private WebElement saveandvalidate;
				public WebElement getsaveandvalidate()
				{
				  return saveandvalidate;
				}
				
				@FindBy(xpath="//button[contains(text(),' Save and Proceed ')]")
				private WebElement saveandproceed;
				public WebElement getsaveandproceed()
				{
				  return saveandproceed;
				}
				
				@FindBy(xpath="//*[@class='list-group-item']/label")
				private WebElement checklists;
				public WebElement getchecklists()
				{
					return checklists;
				}
				
				@FindBy(xpath="//button[contains(text(),' Submit ')]")
				private WebElement submitButton;
				public WebElement getsubmitButton()
				{
					return submitButton;
				}
				
				WebDriver driver;
				
				public Summary(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
				}
				
				
	}




