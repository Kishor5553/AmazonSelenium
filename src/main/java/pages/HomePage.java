package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import action.Action;
import base.BaseClass;
import utility.Utility;

public class HomePage extends BaseClass{
	
	Action action = new Action();
	Utility utility = new Utility();
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']") private WebElement searchBar;
	@FindBy(xpath="//div[@class='s-suggestion s-suggestion-ellipsis-direction']") private List<WebElement> allSearchOptions;
	@FindBy(xpath="//a[@id='nav-link-accountList']") private WebElement Account_Lists;
	@FindBy(xpath="//div[@id='nav-flyout-ya-newCust']/a[contains(text(),'Start here')]") private WebElement NewCustomerRegisterLink;
	@FindBy(xpath="(//div[@class='s-main-slot s-result-list s-search-results sg-row']//descendant::span[contains(@class,'a-size-medium a-color-base a-text-normal')])[1]") private WebElement firstProductFromSearch;
	@FindBy(xpath="//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//span[@class='a-price-whole'][normalize-space()='13,499']") private WebElement productPrice;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void searchItem(String text) {
		action.type(this.searchBar, text);
	}
	
	public void mouseHoverOnAccountListLink() {
		action.mouseHover(Account_Lists);
	}
	
	public RegisterPage clickOnNewCustomerRegisterLink() {
		action.click(NewCustomerRegisterLink);
		return new RegisterPage();
	}
	
	public void clickOptionFromDropDown() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		action.pressArrowDownKey();
		action.pressEnter();
	}
	
	public void clickOnFirstProduct() {
		action.click(firstProductFromSearch);
	}
	
	public String getPriceOfProduct() {
		return action.getText(productPrice);
	}
	
	
}
