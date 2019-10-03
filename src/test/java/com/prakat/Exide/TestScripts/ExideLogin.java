package com.prakat.Exide.TestScripts;

import java.io.IOException;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.prakat.Exide.Pages.LoginPage;
import com.prakat.Generic.Helper.BaseTest;
import com.prakat.Generic.Helper.ScreenshotHelper;
@Listeners(ScreenshotHelper.class)
public class ExideLogin extends BaseTest {
	
	
	@Test
	public void LoginToExide() throws IOException, Throwable {
		test = extent.createTest("Login To Exide");
		//homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		//homePage.getLoginLink().click();

		loginPage.login();

		//loginPage.getSkipForMobileLink().click();
		//String actTitle = driver.getTitle();
		//Assert.assertEquals(actTitle, ConstantHelper.ExpPageTitle);
		//System.out.println("Login success");
		test.log(Status.PASS, "Logged In successfully");

	}

/*	@Test
	public void logout() {
		logout = new LoggedInHomePage(driver);
		logout.logout();
		

	}*/
	
	  @AfterMethod
	  public void getExtentReports(ITestResult result) {
		  BaseTest.getResult(result);
	  }	

}
