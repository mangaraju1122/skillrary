package Testscript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;

public class FirstTest extends BaseClass {

	@Test
	public void firstTest() {
		SoftAssert soft=new SoftAssert();
		
		home.clickGears();
		home.clickskillrarydemoapp();
		web.handleChildBrowser();
		
		soft.assertTrue(skillraryDemo.GetPageHeader().isDisplayed());
		
		skillraryDemo.mousehoverToCourse(web);
		skillraryDemo.clickseleniumtraining();
		
		soft.assertEquals(selenium.GetPageHeader(),"selenium Trainig");
		selenium.doubleclickplusbutton(web);
		selenium.clickaddTocard();
		web.HandleAlert();
		web.explicitwait(time, selenium.getItemaddmassege());
		web.takeScreenshot();
		soft.assertTrue(selenium.getItemaddmassege().isDisplayed());
		
		soft.assertAll();
		
		}
	
}
