package cat.catalunyamedieval.cmts.selenium.pages;

import org.jbehave.web.selenium.WebDriverProvider;

/**
 * Page Factory
 * 
 * @author Enric Ballo
 *
 */
public class PageFactory {

	private final WebDriverProvider driverProvider;

	public PageFactory(WebDriverProvider driverProvider) {
		this.driverProvider = driverProvider;
	}

	public HomePage newHome() {
		return new HomePage(driverProvider);
	}

	public AdvancedSearchPage newAdvancedSearch() {
		return new AdvancedSearchPage(driverProvider);
	}

}
