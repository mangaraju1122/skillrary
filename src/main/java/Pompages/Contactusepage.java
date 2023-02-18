package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactusepage {
	
	//Declaration
	@FindBy(xpath = "//img[contains(@src,'contactus.jpg')]")
	private WebElement pageHeader;
    @FindBy(name = "name")
    private WebElement fullNameTF;
    @FindBy(name = "sender")
    private WebElement EmailTF;
    @FindBy(name = "subject")
    private WebElement SubjectTF;
    @FindBy(name = "message")
    private WebElement MessageTextArea;
    @FindBy(xpath = "//button[text()='Send us mail']")
    private WebElement sendusmailButton;
    
  //initialization
	public Contactusepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
    //utilization
    public String GetPageHeader() {
	
	return pageHeader.getText();
    }
    
    public void sumitdetails(String name,String email,String subject,String message) {
    	fullNameTF.sendKeys(name);
    	EmailTF.sendKeys(email);
    	SubjectTF.sendKeys(subject);
    	MessageTextArea.sendKeys(message);
    	sendusmailButton.click();
    }




}
