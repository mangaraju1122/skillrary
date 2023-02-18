package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Corejavavideopage {
	
	//Declaration
	@FindBy(xpath = "//h1")
	private WebElement pageHeader;
	
	@FindBy(xpath = "//button[@aria-label='Play']") 
	private WebElement palybutton;
	
	@FindBy(xpath = "//button[@aria-label='pause']")
	private WebElement pausebutton;
	
	@FindBy(xpath = "//span[text()='Add To Wishlist']")
	private WebElement addwishlist;
	
	@FindBy(xpath = "//a[@class='close_cookies']")
	private WebElement clickclosedcookies;
	
	//initialization
			public Corejavavideopage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
			
		    //utilization
		    public String GetPageHeader() {
			
			return pageHeader.getText();
		    }
		    public void clickplaybutton() {
		    	palybutton.click();
		    }
		    public void clickpausebutton() {
		    	pausebutton.click();
		    }
		    public void clickwishlist() {
		    	addwishlist.click();
		    }
		    public void clickclosedcookies() {
		    	clickclosedcookies.click();
		    }

}
