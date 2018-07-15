package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;


public class EditLeadPage extends PreAndPost {


	public EditLeadPage(EventFiringWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;			
		PageFactory.initElements(driver, this);			
	}

	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleupdateCompanyName;
	public EditLeadPage updateCompanyName(String updcomnyName){
		type(eleupdateCompanyName, updcomnyName);
		return this;

	}
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleUpdateSubmit;
	public ViewLeadPage clickUpdateSubmit(){
		click(eleUpdateSubmit);
		return new ViewLeadPage(driver, test);
	}

}

