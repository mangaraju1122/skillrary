package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testingpage {
	
	
	//Decleratioin
	@FindBy(xpath = "//h1[text()='Testing']")
	private WebElement pageHeader;
	@FindBy(id = "Selenium Training")
	private WebElement seleniumImage;
	@FindBy(id = "seleniumImage")
	private WebElement cartarea;
	@FindBy(xpath = "/html/body/div[1]/footer/div/div[2]/div[1]/div[1]/ul/li[2]/a/i")
	private WebElement facebookIcon;
	
	//initialization
	public Testingpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
    //utilization
    public String GetPageHeader() {
	
	return pageHeader.getText();
    }
    public WebElement getseleniumimage() {
    	return seleniumImage;
    }
    public WebElement getcartarea()
    {
    	return cartarea;
    }
    public WebElement getfacebookicon() {
    	return facebookIcon;
    }
    public void clickfacebookicon() {
    	facebookIcon.click();
    }

}
