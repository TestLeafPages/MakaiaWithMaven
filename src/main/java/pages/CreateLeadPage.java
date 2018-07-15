package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class CreateLeadPage  extends PreAndPost {


	public CreateLeadPage(EventFiringWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);		
	}


	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement companyName;

	public CreateLeadPage enterCompanyName(String comnyName){
		type(companyName, comnyName);
		return this;

	}

	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;

	public CreateLeadPage enterFirstName(String firstName){
		type(eleFirstName, firstName);
		return this;
	}

	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	public CreateLeadPage enterLastName(String lastName){
		type(eleLastName, lastName);
		return this;

	}

	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreateLeadSubmit;
	public ViewLeadPage clickCreateLeadSubmit(){
		click(eleCreateLeadSubmit);
		return new ViewLeadPage(driver, test);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement eleEmail;
	public CreateLeadPage enterEmail(String eMail){
		type(eleEmail, eMail);
		return this;
	}
}
