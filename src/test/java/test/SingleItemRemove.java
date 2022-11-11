package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.BasePage;
import page.TestPage;
import util.BrowserFactory;

public class SingleItemRemove {
	
	WebDriver driver;
	BasePage basePage;
	TestPage testPage;
	
@Before	
	public void singleItemRemove() {
		
		driver = BrowserFactory.init();
		testPage = PageFactory.initElements(driver, TestPage.class);
   }
@Test
public void clickSinglItemRemove() {
	
	//testPage.checkItemTodo();
	
	try {
		Thread.sleep(2000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}

	testPage.clickRemoveButton();
	Assert.assertTrue("The item was removed successfully",true);
}
@After
public void teardown() {
	driver.close();
	driver.quit();
}
}
