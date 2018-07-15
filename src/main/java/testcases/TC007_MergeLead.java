package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.FindLeadPopPage;
import pages.LoginPage;


public class TC007_MergeLead extends PreAndPost {

	@BeforeTest
	public void setValues(){
		testCaseName = "TC007_MergeLead";
		testDescription = "Merge two Lead on LeafTaps";
		nodes = "Leads";
		dataSheetName = "TC007";
		category = "Regression";
		authors = "Gopi";		
	}

	@Test(dataProvider = "fetchData")
	public void mergeLead(String uName, String pwd,String f_LeadName,String l_LeadName, String errorMsg){
		String fromLeadId = 
				new LoginPage(driver, test)
				.enterUserName(uName)
				.enterPassword(pwd)
				.clickLogin()
				.clickCRMSFA()
				.clickLeadLink()
				.clickMergeLead()
				.clickFromLeadLookup()
				.enterFirstName( f_LeadName)
				.clickFindleadsButton()
				.getFirstResultingLead();
		new FindLeadPopPage(driver, test)
		.clickResultingLeads()
		.clickToLeadLookup()
		.enterFirstName( l_LeadName)
		.clickFindleadsButton()
		.clickResultingLeads()
		.clickMergeButton()
		.clickFindLead()
		.enterLeadId(fromLeadId)
		.clickFindleadsButton()
		.verifyErrorMsg(errorMsg);

	}


}










