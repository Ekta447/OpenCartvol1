package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountsRegistration extends BasePage {
	
	public AccountsRegistration (WebDriver driver){
		super(driver);
	}
	

@FindBy(xpath="//input[@id='input-firstname']") 
 WebElement txtfirstName;
@FindBy(xpath="//input[@id='input-lastname']")
 WebElement txtlastName;
@FindBy(xpath="//input[@id='input-email']") 
 WebElement txteMail;
@FindBy(xpath="//input[@id='input-telephone']")
WebElement txttelephone;
@FindBy(xpath="//input[@id='input-password']") 
 WebElement txtpassword;
@FindBy(xpath="//input[@id='input-confirm']") 
 WebElement txtpasswordConfirm;
@FindBy(xpath="//input[@name='agree']") 
 WebElement chknewsletter;


@FindBy(xpath="//input[@value='Continue']") 
WebElement btncontinue;

@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") 
 WebElement msgConfirmation;
	
	
public	void setfn(String fn) {
	txtfirstName.sendKeys(fn);
	}
public void setln(String ln) 
	{
	txtlastName.sendKeys(ln);
	}
public	void setemail(String email) {
	txteMail.sendKeys(email);
	}
public	void settelephone(String telephn) {
	txttelephone.sendKeys(telephn);
}
public void setpass(String pwd) {
	txtpassword.sendKeys(pwd);
	}
public	void setconfirmpwd(String confirmpwd) {
	txtpasswordConfirm.sendKeys(confirmpwd);
}
public	void setsubscribe() {
	chknewsletter.click();;
	}
public	void setchk() {
	btncontinue.click();;
	}

	
	public String getConfirmationMsg() {
		try{
			return msgConfirmation.getText();
		}
		catch(Exception e) {
			return e.getMessage();
		}
	}
	
	
	
	

}
