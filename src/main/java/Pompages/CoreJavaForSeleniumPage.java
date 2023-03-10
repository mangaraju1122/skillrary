package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaForSeleniumPage {
	
	//Declaration
	@FindBy(xpath = "//h2[@class='list_title']")
	private  WebElement pageHeader;
	@FindBy(xpath = "//a[text()=' Core Java For Selenium Trainin']")
	private WebElement CorejavaforseleniumLink;
	
	//initialization
		public CoreJavaForSeleniumPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
	    //utilization
	    public String GetPageHeader() {
		
		return pageHeader.getText();
	    }
	    public void clickcorejavaseleniumLink() {
	    	CorejavaforseleniumLink.click();
	    }


}
