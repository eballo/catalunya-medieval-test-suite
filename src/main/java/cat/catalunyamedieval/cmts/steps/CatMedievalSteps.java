package cat.catalunyamedieval.cmts.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import cat.catalunyamedieval.cmts.selenium.pages.AdvancedSearchPage;
import cat.catalunyamedieval.cmts.selenium.pages.HomePage;
import cat.catalunyamedieval.cmts.selenium.pages.PageFactory;
import junit.framework.Assert;

/**
 * Jbehave Steps for Catalunya Medieval
 * 
 * @author Enric Ballo
 */
public class CatMedievalSteps {

	private HomePage home;

	private AdvancedSearchPage advancedSearch;

	public CatMedievalSteps(PageFactory pageFactory) {
		home = pageFactory.newHome();
		advancedSearch = pageFactory.newAdvancedSearch();
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
		Assert.assertTrue("Validation Failed!", home.validatePageLoad());
	}

	@Given("the advanced search page")
	public void openAdvancedSearchPage() {
		advancedSearch.go();
	}

	@Then("search with text $text")
	public void fillText(final String text) {
		advancedSearch.fillText(text);
	}

	@Then("search with comarca $text")
	public void selectComarca(final String text) {
		advancedSearch.selectDropDown(text);
	}

	@When("submit the form")
	public void submitForm() {
		advancedSearch.doSubmit();
	}

	@Then("show the results page with $total results")
	public void showResults(final int total) {
		Assert.assertTrue("Error!! while validating the page results", advancedSearch.validatePageIsLoaded());
		Assert.assertTrue("Error!! while validating the expected total was not met",
				advancedSearch.totalResults(total));
		;
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
