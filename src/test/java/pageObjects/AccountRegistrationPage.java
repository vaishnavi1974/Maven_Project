package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@FindBy(xpath="//input[@name='firstname']")
WebElement txtFirstName;

@FindBy(xpath="//input[@name='lastname']")
WebElement txtLastName;

@FindBy(xpath="//input[@name='email']")
WebElement txtEmail;

@FindBy(xpath = "//input[@name='telephone']")
WebElement txtTelephone;

@FindBy(xpath="//input[@name='password']")
WebElement txtPassword;

@FindBy(xpath="//input[@name='confirm']")
WebElement txtConfirm;

@FindBy(xpath = "//input[@type='checkbox']")
WebElement txtCheckbox;

@FindBy(xpath="//input[@type='submit']")
WebElement btnContinue;

@FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
WebElement msgConfirmation;

public void setFirstName(String fname)
{
	txtFirstName.sendKeys(fname);
}

public void setLastname(String lname)
{
	txtLastName.sendKeys(lname);
}

public void setEmail(String email)
{
	txtEmail.sendKeys(email);
}

public void setTelephone(String phone)
{
	txtTelephone.sendKeys(phone);
}

public void setPassword(String pwd)
{
	txtPassword.sendKeys(pwd);
}

public void setCfmPwd(String CPwd)
{
	txtConfirm.sendKeys(CPwd);
}
public void checkCheckbox()
{
	txtCheckbox.click();
}

public void clickContinue()
{
	btnContinue.click();
}

public String getConfirmation()
{
	try {
	return msgConfirmation.getText();
	}
	catch(Exception e) {
		return(e.getMessage());
	}
}

}
