package cat.catalunyamedieval.cmts.selenium.pages;

import org.jbehave.web.selenium.WebDriverProvider;

/**
 * Selenium Page for Home Page
 * 
 * @author Enric Ballo
 *
 */
public class HomePage extends AbstractPage {

	private static final String CATALUNYA_MEDIEVAL = "Catalunya Medieval";

	public HomePage(WebDriverProvider driverProvider) {
		super(driverProvider);
	}

	public void go(final String url) {
		get(url);
	}

	public boolean validatePageLoad() {
		return getPageSource().contains(CATALUNYA_MEDIEVAL);
	}

}
