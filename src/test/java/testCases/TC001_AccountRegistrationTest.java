package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TC001_AccountRegistrationTest extends BaseClass{
	
	@Test
	public void verify_account_registration()
	{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		BaseClass bc = new BaseClass();
		
		AccountRegistrationPage acp=new AccountRegistrationPage(driver);
		acp.setFirstName(bc.randomeString().toUpperCase());
		acp.setLastname(bc.randomeString().toUpperCase());
		acp.setEmail(bc.randomeString()+"@gmail.com");
		acp.setTelephone(bc.randomeNumber());
		
		String password = bc.randomeAlphanumeric();
		acp.setPassword(password);
		acp.setCfmPwd(password);
		acp.checkCheckbox();
		acp.clickContinue();
		
		String confmsg=acp.getConfirmation();
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
	}
	
	
}
