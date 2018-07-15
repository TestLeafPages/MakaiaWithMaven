package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.FindLeadPage;
import pages.LoginPage;


public class TC005_DeleteLead extends PreAndPost{

	@BeforeTest
	public void setData() {
		testCaseName="TC005_DeleteLead";
		testDescription="Delete a Lead - LeafTaps";
		nodes = "Leads";
		dataSheetName="TC005";
		category="Sanity";
		authors="Gopi";
	}

	@Test(dataProvider="fetchData")
	public void deleteLead(String userName, String password, String phoneNum,String errorMsg){

		String firstResultingLead=
				new LoginPage(driver, test)
				.enterUserName(userName)
				.enterPassword(password)
				.clickLogin()
				.clickCRMSFA()
				.clickLeadLink()		
				.clickFindLead()
				.clickPhoneTab()
				.enterPhoneNumberField(phoneNum)
				.clickFindleadsButton()
				.getFirstResultingLead();
		new FindLeadPage(driver, test)
		.clickFirstResultingLead()
		.clickDeleteLeadLink()
		.clickFindLead()
		.enterLeadId(firstResultingLead)
		.clickFindleadsButton()
		.verifyErrorMsg(errorMsg);
	}
}
