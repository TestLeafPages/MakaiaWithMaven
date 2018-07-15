package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;


public class DuplicateLeadPage extends PreAndPost {


	public DuplicateLeadPage(EventFiringWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;			
		PageFactory.initElements(driver, this);		
	}


	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreateLeadDublicate;
	public ViewLeadPage clickCreateLeadDublicate(){
		click(eleCreateLeadDublicate);
		return new ViewLeadPage(driver, test);
	}
}
