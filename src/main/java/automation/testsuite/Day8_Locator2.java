package automation.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day8_Locator2 extends CommonBase {
	@BeforeMethod
	public void openChrome() throws InterruptedException {
		driver = initChromeDriver(CT_PageURLs.URL_BepAnToan);
	}

	@Test
	public void practiceLocator() throws InterruptedException {
		// Implement code.....
		
	}
}
