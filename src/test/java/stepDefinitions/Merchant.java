package stepDefinitions;
 
import org.testng.Assert;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AmazonShoppingPage;
import pageObjects.GoogleSearchPage;
import pageObjects.SeleniumWebPage;
 
public class Merchant {
	TestContext testContext;
	AmazonShoppingPage amazonShoppingPage;
	GoogleSearchPage googleSearchPage;
	SeleniumWebPage seleniumWebPage;
	
	
	public Merchant(TestContext context) {
		System.out.println("***** SeleniumSteps TEST *********");
		testContext = context;
		seleniumWebPage = testContext.getPageObjectManager().getSeleniumWebPage();
		//googleSearchPage = testContext.getPageObjectManager().getGoogleSearchPage();
	}
	
	@Given("^user navigate to CRM portal \"([^\"]*)\" page")
	public void navigateToPage(String url){
		amazonShoppingPage.getURL(url);
	}
	
//	@When("^user search click on download tab")
//	public void search() throws InterruptedException{
//		seleniumWebPage.downloadTab.click();
//		Thread.sleep(1000);
//	}
//	
//	@Then("^verify the download version section should be displayed")
//	public void verifySearchProduct() {
//		Boolean flag = seleniumWebPage.mainContent.getText().contains("Download version");
//		Assert.assertTrue(flag, "Download version section does not found.");
//	}
	
}