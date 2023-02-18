package Pompages;

import javax.xml.xpath.XPath;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field.Xpath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomepage {
	//Declaration 
	@FindBy(xpath = "//img[@alt='SkillRary']")
	private WebElement logo;
	@FindBy(name = "q")
	private WebElement SearchTF;
	@FindBy(xpath = "//input[@value='go']")
	private WebElement searchButton;
	@FindBy(xpath = "//a[text()=' GEARS ']")
	private WebElement GearTAb;
	@FindBy (xpath="//a[@target='_blank']")
	private WebElement skillraryDemo;
	
	//initialization
	public SkillraryHomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getLogo() {
		return logo;
	}
	public void SerchFor(String data) {
		SearchTF.sendKeys(data);
		searchButton.click();
	}
	public void clickGears() {
		GearTAb.click();
	}
	public void clickskillrarydemoapp() {
		skillraryDemo.click();
	}

	
}
