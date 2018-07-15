package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Then;
import lib.selenium.PreAndPost;

public class HomePage extends PreAndPost{

	public HomePage(EventFiringWebDriver driver, ExtentTest test) {	
		this.driver = driver;
		this.test = test;	
		PageFactory.initElements(driver, this);
	}		

	@FindBy(how=How.XPATH,using="//h2[text()[contains(.,'Demo')]]")
	public WebElement eleLoggedName;

	public HomePage verifyLoggedName(String data) {
		verifyPartialText(eleLoggedName, data);
		return this;
	}

	@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
	public WebElement eleCRMSFALink;

	public MyHomePage clickCRMSFA(){
		click(eleCRMSFALink);
		return new MyHomePage(driver, test);
	}

	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogOut;
	
	public LoginPage clickLogout() {
		click(eleLogOut);
		return new LoginPage(driver, test);

	}
	
	

}










