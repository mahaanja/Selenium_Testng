package comlearning.TestNG;

import java.time.Duration;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import comlearing.POM.loginPage;

public class Validatelogin {
	loginPage login= new loginPage();
	
	
	
	@BeforeTest
	public void launchBrowse()
	{
		login.InitialiseChrome();
		login.launchBrowser();
	}
	
	
	@Test(priority=1)
	public void invalidLogin()
	{   
		login.invalidlogin();
		boolean b= login.verifyPasswordFailure();
		Assert.assertTrue(b);
		
	}
	
	@AfterTest
	public void CloseBrowse()
	{
		login.closeChrome();
	}
	
	
	
}
