package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage (WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']") 
WebElement lnkmyAccount;

@FindBy(xpath="//a[normalize-space()='Register']") 
WebElement lnkRegister;
	
@FindBy(xpath="//a[normalize-space()='Login']")
 WebElement lnklogin;

	public void Myacc()
	{
		lnkmyAccount.click();
		//lnkmyAccount.submit();
		//Actions act=new Actions(driver);
		//act.moveToElement(lnkmyAccount).click().perform();
		//lnkmyAccount.sendKeys(Keys.RETURN);	
	}
	
	public void Registeration() 
	{
		lnkRegister.click();
	}
	

	public void login() 
	{
		lnklogin.click();
	}
	
	
	
	
	
	
	
	
	
}
