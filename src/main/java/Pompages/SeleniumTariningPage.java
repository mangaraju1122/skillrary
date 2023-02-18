package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.WebDriverUtility;

public class SeleniumTariningPage {
	
	//Decleration
	@FindBy(xpath = "//h1[@class='page-header']")
	private WebElement PageHeader;
	@FindBy(id = "add")
	private WebElement plusbutton;
	@FindBy(xpath = " Add to Cart")
	private WebElement addTocartbutton;
	@FindBy(xpath = "//div[@class='callout callout-success']")
	private WebElement itemAddedMessage;
	
	//initialization
			public SeleniumTariningPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
			
		//utilization
		public String GetPageHeader() {
			
			return PageHeader.getText();
		}
		public void doubleclickplusbutton(WebDriverUtility web) {
			web.DoubleclickOneElement(plusbutton);
		}
		public void clickaddTocard() {
			addTocartbutton.click();
		}
		public  WebElement getItemaddmassege()
		{
			return itemAddedMessage;
		}

}
