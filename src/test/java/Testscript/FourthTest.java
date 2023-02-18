package Testscript;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;

public class FourthTest extends BaseClass{
	
	@Test
	public void fourthtest() {
		SoftAssert soft=new SoftAssert();
		
		home.clickGears();
		home.clickskillrarydemoapp();
		web.handleChildBrowser();
		
		soft.assertTrue(skillraryDemo.GetPageHeader().isDisplayed());
		
		web.ScrollToElement(skillraryDemo.getcontactus());
		skillraryDemo.clickcontactus();
		
		soft.assertTrue(contact.GetPageHeader().isBlank());
		
		List<String> data=excel.fetchdatafromExcel("sheet1");
		contact.sumitdetails(data.get(0),data.get(1),data.get(2),data.get(3));
		
		soft.assertAll();
	}
	
	

}
