package test;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.BasePage;
import page.TestPage;
import util.BrowserFactory;

public class AllItemRemove {
	WebDriver driver;
	BasePage basePage;
	TestPage testPage;
	
	@Before
	public void AllItemRemove() {
		driver = BrowserFactory.init();
		testPage = PageFactory.initElements(driver, TestPage.class);
	}
	@Test
	public void clickToggleAllAndRemove() {
		testPage.checkToggleAll();
		testPage.clickRemoveButton();
	
		Assert.assertTrue("The checklist is clear", checkBoxClear());
    }
    private boolean checkBoxClear() {
    	List<String>CheckBoxList = testPage.getListOfCheckBox();
    	for(int i=0;i<CheckBoxList.size();i++) {
    		if(CheckBoxList.get(i).isEmpty()) {
    	}   	
    }
    	return true;
}
    @After
    public void teardown() {
    	driver.close();
    	driver.quit();
    }
}
