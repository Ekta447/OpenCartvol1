package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountsRegistration;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001AccRegistration extends BaseClass{
	
	
	
	@Test(groups={"Regression","Master"})
	public void Test() throws InterruptedException  {
		logger.info("Starting TC_001AccRegistration..........");
		try
		{
		HomePage hp=new HomePage(driver);
	logger.info("Clicking on my account link");
		hp.Myacc();
	logger.info("clicking on registration link");
		hp.Registeration();
		AccountsRegistration ar=new AccountsRegistration(driver);
	logger.info("provinding customer details");
		ar.setfn(RandomAlphaNumeric());
		ar.setln(RandomString());
		//ar.setemail("hello@hotmil.com");
		ar.setemail(RandomString()+"@hotmail.com");
		ar.settelephone(RandomNumeric());
	String	Password=RandomAlphaNumeric();
		ar.setpass(Password);
		ar.setconfirmpwd(Password);
		ar.setsubscribe();
		ar.setchk();
		logger.info("Validating the confirmation message");
		String message=ar.getConfirmationMsg();
		if(message.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Test failed.....");
			logger.debug("Debug logs........");
			Assert.assertTrue(false);
		}
		//Assert.assertEquals(message,"Your Account Has Been Created!");
		}
		catch( Exception e) {
			
			Assert.fail();
		}
		logger.info("Finished TC_001AccRegistration.........");
	}
	

}
