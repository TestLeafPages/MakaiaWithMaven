package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import lib.selenium.PreAndPost;

public class LoginPage extends PreAndPost{
	
	public LoginPage(EventFiringWebDriver driver, ExtentTest test) {	
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver,this);
	}
	 
	@FindBy(how=How.ID,using="username")
	private WebElement eleUserName;	
	
	@FindBy(how=How.ID,using="password")
	private WebElement elePassword;	
	
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogin;
	
	@FindBy(how=How.ID, using = "errorDiv")
	private WebElement eleVerifyErrMsg;
	
	
	
	public LoginPage enterUserName(String data) {	
		type(eleUserName, data);
		return this;
	}	

	public LoginPage enterPassword(String data) {
		type(elePassword, data);
		return this;
	}	
	
	public HomePage clickLogin() {
		click(eleLogin);
		return new HomePage(driver,test);		
	}
	
	public LoginPage clickLogInForFailer() {
		click(eleLogin);
		return this;		
	}
	
	public LoginPage verifyErrorMsg(String data) {
		verifyPartialText(eleVerifyErrMsg, data);
		return this;
	}
	
	
}
