/**
 * 
 */
package cat.catalunyamedieval.cmts.selenium.pages;

import java.util.List;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.SeleniumPage;
import org.jbehave.web.selenium.WebDriverProvider;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.condition.ConditionRunner;

/**
 * 
 * Abstract Page
 * 
 * @author Enric Ballo
 *
 */
public class AbstractPage extends FluentWebDriverPage {

	/** Identifier for PageLoad. */
	public static final String WAIT_FOR_PAGE_TO_LOAD_INTERVAL_MSEC = "120000";

	public AbstractPage(WebDriverProvider driverProvider) {
		super(driverProvider);
	}

	public void found(String text) {
		// textIsVisible(text);
	}

	public void found(List<String> texts) {
		for (String text : texts) {
			found(text);
		}
	}

	public void notFound(String text) {
		// textIsNotVisible(text);
	}

}
