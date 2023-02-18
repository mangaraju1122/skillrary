package genericlibraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Pompages.Contactusepage;
import Pompages.CoreJavaForSeleniumPage;
import Pompages.Corejavavideopage;
import Pompages.SeleniumTariningPage;
import Pompages.SkillraryDemoAppPage;
import Pompages.SkillraryHomepage;
import Pompages.Testingpage;

public class BaseClass {
	
	protected PropertiesFileUtility property;
	protected ExcelUtility excel;
	protected WebDriverUtility web;
	protected WebDriver driver;
	protected SkillraryHomepage home;
	protected SkillraryDemoAppPage skillraryDemo;
	protected SeleniumTariningPage selenium;
	protected CoreJavaForSeleniumPage corejava;
	protected Corejavavideopage javavideo;
	protected Testingpage testing;
	protected Contactusepage contact;
	protected long time;
	
	
	//@BeforeSuite
	//@BeforeTest
	@BeforeClass
	public void classConfiguration() {
    property=new PropertiesFileUtility();
	excel=new ExcelUtility();
	web=new WebDriverUtility();
	
	property.propertyFileInitialization(IConstantpath.PROPERTIES_FILE_PATH);
	excel.excelInitialization(IConstantpath.EXCEL_FILE_PATH); 
	
	}
	@BeforeMethod
	public void methodcofiguration() {
		 time=Long.parseLong(property.fetchproperty("timeouts"));
		driver =web.openApplication(property.fetchproperty("browser"),
				property.fetchproperty("url"),time);
		
		home =new SkillraryHomepage(driver);
		
		Assert.assertTrue(home.getLogo().isDisplayed());
		
		skillraryDemo=new SkillraryDemoAppPage(driver);
		selenium=new SeleniumTariningPage(driver);
		corejava=new CoreJavaForSeleniumPage(driver);
		javavideo=new Corejavavideopage(driver);
		testing=new Testingpage(driver);
		contact=new Contactusepage(driver);
	}

	@AfterMethod
	public void methodTearDown() {
		web.quitbrowser();
	}
	@AfterClass
	public void classTearDown() {
		excel.closeExcel();
	}
	//@AfterSuite
	//@AfterTest

}
