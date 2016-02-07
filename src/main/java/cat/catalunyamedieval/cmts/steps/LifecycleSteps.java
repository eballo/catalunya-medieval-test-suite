package cat.catalunyamedieval.cmts.steps;

import org.jbehave.web.selenium.WebDriverProvider;

/**
 * Life Cycle Steps
 * 
 * @author Enric Ballo
 *
 */
public class LifecycleSteps {

	private final WebDriverProvider webDriverProvider;

	public LifecycleSteps(WebDriverProvider webDriverProvider) {
		this.webDriverProvider = webDriverProvider;
	}
}
