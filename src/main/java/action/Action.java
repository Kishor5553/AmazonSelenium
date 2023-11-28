package action;


import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.BaseClass;

public class Action extends BaseClass{

	Actions act = new Actions(driver);
	
	public void type(WebElement element, String text) {
		try {
			isDisplayed(element);
			element.clear();
			element.sendKeys(text);
		}catch(Exception e){
			System.out.println("WebElement is not displayed!");
		}
	}
	
	public void mouseHover(WebElement element) {
		isDisplayed(element);
		act.moveToElement(element).perform();
	}
	
	public void click(WebElement element) {
		isDisplayed(element);
		element.click();
	}
	
	public boolean isDisplayed(WebElement element) {
		return element.isDisplayed();
	}
	
	public void clickFromDropDown(List<WebElement> element, String text) {
		for(WebElement option:element) {
			if(option.getText().equals(text)) {
				option.click();
				break;
			}
		}
	}
	
	public void pressArrowDownKey() {
		act.sendKeys(Keys.ARROW_DOWN).perform();
	}
	public void pressEnter() {
		act.sendKeys(Keys.ENTER).perform();
	}
	
	public String getText(WebElement element) {
		return element.getText();
	}
}
