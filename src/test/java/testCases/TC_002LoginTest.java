package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002LoginTest extends BaseClass {
	@Test(groups={"Sanity","Master"})
	public void verifyLogin() {
		logger.info("........Starting TC_002LoginTest.......");
		try{
			HomePage hp=new HomePage(driver);
		
		hp.Myacc();
		hp.login();
		
		
		LoginPage lp= new LoginPage(driver);
	lp.Email(p.getProperty("email"));
	lp.Password(p.getProperty("password"));
lp.FnLogin();

MyAccountPage maccp= new MyAccountPage(driver) ;

boolean TargetPage=maccp.isMyAccountPageExists();
	Assert.assertTrue(TargetPage);
	}
	catch(Exception e) {
		Assert.fail();
	}

logger.info("........TC_002LoginTest finished.........");
}
}