package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.FindLeadPage;
import pages.LoginPage;


public class TC006_DuplicateLead extends PreAndPost{

	@BeforeTest
	public void setData() {
		testCaseName="TC006_DuplicateLead";
		testDescription="Duplicate a Lead - LeafTaps";
		nodes = "Leads";
		dataSheetName="TC006";
		category="Regression";
		authors="Gopi";
	}

	@Test(dataProvider="fetchData")
	public void duplicateLead(String userName, String password ,String emailAddress) throws InterruptedException{

		String fName=
				new LoginPage(driver, test)
				.enterUserName(userName)
				.enterPassword(password)
				.clickLogin()		
				.clickCRMSFA()		
				.clickLeadLink()		
				.clickFindLead()
				.clickEmailTab()
				.enterEmailAddress(emailAddress)
				.clickFindleadsButton()
				.getFirstResultingFirstName();
		new FindLeadPage(driver, test)
		.clickFirstResultingLead()
		.clickDuplicateLeadLink()
		.clickCreateLeadDublicate()
		.verifyFirstName(fName);

	}

}
