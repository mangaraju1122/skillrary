package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.WebDriverUtility;

public class SkillraryDemoAppPage {
	
	//Declaration
	@FindBy(xpath = "//a[@class='navbar-brand']")
	private WebElement PageHeader;
	@FindBy(id = "course")
	private WebElement CourseTab;
	@FindBy(xpath = "//span[@class='wrappers']/a[text()='Selenium Training']")
	private WebElement SeleniumTraining;
	@FindBy(name = "addresstype")
	private WebElement categerydropdown;
	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement contactuslink;
	
	//initialization
		public SkillraryDemoAppPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
	//utilization
	public WebElement GetPageHeader() {
		
		return PageHeader;
	}
	public void mousehoverToCourse(WebDriverUtility web) {
		web.mouseHover(CourseTab);
	}
	
	public void clickseleniumtraining() {
		SeleniumTraining.click();
	}
	public void selectcategery(WebDriverUtility web,int index) {
		web.DropDown(categerydropdown, index);
	}
	public void clickcontactus() {
		contactuslink.click();
	}
	public WebElement getcontactus() {
		return contactuslink;
	}

}
