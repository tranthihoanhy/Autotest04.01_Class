package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import automation.constant.CT_PageURLs;

import automation.common.CommonBase;

public class Day8_Locator extends CommonBase{

	@BeforeMethod
	public void openChrome() throws InterruptedException
	{
		driver = initChromeDriver(CT_PageURLs.URL_SelectorHub);
	}
	
	@Test
	public void practiceLocator() throws InterruptedException
	{
	  driver.findElement(By.xpath("//img[@title='Close']")).click();
	  Thread.sleep(3000);
	  WebElement userEmail = driver.findElement(By.name("email"));
	  System.out.println("userEmail: "+userEmail);
	}
}
