package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import action.Action;
import base.BaseClass;

public class RegisterPage extends BaseClass{
	
Action action = new Action();
	
	@FindBy(xpath="//input[@id='ap_customer_name']") private WebElement yourName;
	@FindBy(xpath="//input[@id='ap_phone_number']") private WebElement mobileNumber;
	@FindBy(xpath="//input[@id='ap_password']") private WebElement password;
	@FindBy(xpath="//input[@id='continue']") private WebElement continueButton;
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterYourName(String text) {
		action.type(yourName, text);
	}
	
	public void enterMobileNumber(String text) {
		action.type(mobileNumber, text);
	}
	
	public void enterNewPassword(String text) {
		action.type(password, text);
	}
	
	public void clickOnContinueButton() {
		action.click(continueButton);
	}

}
