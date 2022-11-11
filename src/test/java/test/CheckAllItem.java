package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import page.TestPage;
import util.BrowserFactory;

public class CheckAllItem {
	WebDriver driver;

	TestPage testPage;

	@FindBy(how = How.XPATH, using ="//input[@name='allbox']")
	WebElement CheckAllBox;

	@Before
	public void checkBoxTest() {
		driver = BrowserFactory.init();
		testPage = PageFactory.initElements(driver, TestPage.class);
	}

	@Test
	public void toggleAllCheckBoxIsOn() throws InterruptedException  {
		testPage.checkToggleAll();
	Thread.sleep(2000);
	    Assert.assertTrue(CheckBoxIsSelected(CheckAllBox));
   }
	private boolean CheckBoxIsSelected(WebElement listCheckBoxElements) {
		List<WebElement> list =  driver.findElements(By.xpath("//input[@name'allbox']"));
		for(int i=0;i<list.size();i++) {
			if(list.get(i).isSelected()) {
				
			}
		}return true;
	}
	/*@After
	public void tearDown() {
		
	}*/
}
