package com.prakat.Generic.Helper;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper extends BaseTest{
	
	public void implicitWait(int implicittime) throws IOException, Throwable {
		//String implicitWait=xlib.getExcelData("MMT", 5, 1);
		//int implicitWt =Integer.parseInt(implicitWait);
		BaseTest.driver.manage().timeouts().implicitlyWait(implicittime, TimeUnit.SECONDS);
	}
	public void waitForElementPresent(WebElement forElemennt,int explicitTime) throws IOException, Throwable {
		//String explicitWait=xlib.getExcelData("MMT", 6, 1);
		//int explicitWt =Integer.parseInt(explicitWait);
		WebDriverWait wait = new WebDriverWait(BaseTest.driver, explicitTime);
		wait.until(ExpectedConditions.elementToBeClickable(forElemennt));

	

	}
	public void threadSleep() throws InterruptedException {
		int numOfSec=0;
		Thread.sleep(numOfSec);
	}
	public void wait7secImpicit() {
		BaseTest.driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
	}
}
  