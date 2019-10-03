package com.prakat.Generic.Helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseoverHelper extends BaseTest {
	Actions act = new Actions(driver);
	
	public void getMovetoElement(WebElement toElement) {
		act.moveToElement(toElement).perform();
	}

	public void getRightClick(WebElement toElement) {
		act.contextClick(toElement).perform();
	}

	public void getDoubleClick(WebElement toElement) {
		act.doubleClick(toElement).perform();
	}

	public void getClickAndHold(WebElement toElement) {
		act.clickAndHold(toElement).perform();
	}

	public void getDragAndDrop(WebElement sourceEle, WebElement targetEle) {
		act.dragAndDrop(sourceEle, targetEle).perform();
	}

}
