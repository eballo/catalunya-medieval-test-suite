package cat.catalunyamedieval.cmts.pages;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.condition.ConditionRunner;

/**
 * Selenium Page for Home Page
 * 
 * @author Enric Ballo
 *
 */
public class HomePage extends AbstractPage {

    private static final String CATALUNYA_MEDIEVAL = "Catalunya Medieval";

	public HomePage(Selenium selenium, ConditionRunner conditionRunner) {
        super(selenium, conditionRunner);
    }

    public void go(final String url) {
    	open(url);
    	waitForPageToLoad(WAIT_FOR_PAGE_TO_LOAD_INTERVAL_MSEC);
    }
    
    public boolean validatePageLoad(){
    	return isTextPresent(CATALUNYA_MEDIEVAL);
    }

}
