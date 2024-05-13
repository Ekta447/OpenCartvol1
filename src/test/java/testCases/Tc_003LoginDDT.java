package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class Tc_003LoginDDT extends BaseClass{

@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class,groups="Datadriven")
public void Verify_LoginDDT (String email,String pwd, String exp){
	logger.info("..........Staring Tc_003LoginDDT............");
	//MyAccountPage maccp= new MyAccountPage(driver);
	try {
	HomePage hp=new HomePage(driver);
	hp.Myacc();
	hp.login();
	
	
	LoginPage lp= new LoginPage(driver);
lp.Email(email);
lp.Password(pwd);
lp.FnLogin();

MyAccountPage maccp= new MyAccountPage(driver) ;
boolean TargetPage=maccp.isMyAccountPageExists();

/*Data is valid  - login success - test pass  - logout
Data is valid -- login failed - test fail

Data is invalid - login success - test fail  - logout
Data is invalid -- login failed - test pass*/
if(exp.equalsIgnoreCase("valid")) {
	if(TargetPage==true) {
		maccp.clickLogout();
		Assert.assertTrue(true);
		
	}
	else {
				Assert.assertTrue(false);
		
	}}
if(exp.equalsIgnoreCase("invalid")) {
	if(TargetPage==true) {
		maccp.clickLogout();
		Assert.assertTrue(false);
		
	}
	else {
		Assert.assertTrue(true);
		//maccp.clickLogout();
	}
}}
	catch(Exception e) {
		Assert.fail();
	}
logger.info("..........Finished Tc_003LoginDDT............");	
}
	
}
