package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;


public class MyLeadsPage extends PreAndPost {

	public MyLeadsPage(EventFiringWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement elecreateLead;
	// Click Create Leads 
	public CreateLeadPage clickCreateLead(){
		click(elecreateLead);
		return new CreateLeadPage(driver, test);
	}

	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	public WebElement elefindLead;
	
	public FindLeadPage clickFindLead(){
		click(elefindLead);
		return new FindLeadPage(driver, test);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	public WebElement elemergeLead;
	
	public MergeLeadPage clickMergeLead(){
		click(elemergeLead);		
		return new MergeLeadPage(driver, test);
	}
	
	

}
