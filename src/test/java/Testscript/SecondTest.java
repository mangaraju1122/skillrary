package Testscript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;

public class SecondTest extends BaseClass{
	
	@Test
	public void secondtest() {
		SoftAssert soft=new SoftAssert();
		
		home.clickGears();
		home.clickskillrarydemoapp();
		web.handleChildBrowser();
		
		soft.assertTrue(skillraryDemo.GetPageHeader().isDisplayed());
		
		skillraryDemo.selectcategery(web, 1);
		soft.assertTrue(skillraryDemo.GetPageHeader().isDisplayed());
		
		web.DragAndDropElement(testing.getseleniumimage(), testing.getcartarea());
		web.ScrollToElement(testing.getfacebookicon());
		testing.clickfacebookicon();
		
		soft.assertAll();
	}

}
