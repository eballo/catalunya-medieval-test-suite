package cat.catalunyamedieval.cmts.steps;

import junit.framework.Assert;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;

import cat.catalunyamedieval.cmts.selenium.pages.AdvancedSearchPage;
import cat.catalunyamedieval.cmts.selenium.pages.HomePage;
import cat.catalunyamedieval.cmts.selenium.pages.PageFactory;

/**
 * Jbehave Steps for Catalunya Medieval
 * 
 * @author Enric Ballo
 *
 */
public class CatMedievalSteps {

	private HomePage home;
	private AdvancedSearchPage search; 

	public CatMedievalSteps(PageFactory pageFactory) {
		home = pageFactory.newHome();
		search = pageFactory.newSearch();
	}

	@Given("the .es url")
	public void homepageES() {
		String url = "http://www.catalunyamedieval.es";
		home.go(url);
	}

	@Given("the .cat url")
	public void homepageCAT() {
		String url = "http://www.catalunyamedieval.cat";
		home.go(url);
	}

	@Given("the .net url")
	public void homepageNET() {
		String url = "http://www.catalunyamedieval.net";
		home.go(url);
	}

	@Then("validate page is loaded")
	public void validatePageLoad() {
		Assert.assertTrue("Validation Failed!",home.validatePageLoad());
	}

	/* Testing */ 
	
	@Then("booom!")
	public void booom() {
		throw new RuntimeException("Booom!!");
	}

	@Then("do nothing")
	public void doNothing() {
		System.out.println("doing nothing");
	}

}
