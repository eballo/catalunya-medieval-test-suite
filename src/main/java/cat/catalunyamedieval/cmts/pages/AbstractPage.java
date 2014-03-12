/**
 * 
 */
package cat.catalunyamedieval.cmts.pages;

import java.util.List;

import org.jbehave.web.selenium.SeleniumPage;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.condition.ConditionRunner;

/**
 * 
 * Abstract Page
 * @author Enric Ballo
 *
 */
public class AbstractPage extends SeleniumPage {
	
	/** Identifier for PageLoad. */
	public static final String WAIT_FOR_PAGE_TO_LOAD_INTERVAL_MSEC = "120000";
	
    public AbstractPage(Selenium selenium, ConditionRunner conditionRunner) {
		super(selenium, conditionRunner);
	}
    
    public void found(String text) {
        textIsVisible(text);
    }

    public void found(List<String> texts) {
        for (String text : texts) {
            found(text);
        }
    }

    public void notFound(String text) {
        textIsNotVisible(text);
    }


}
