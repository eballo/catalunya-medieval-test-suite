package cat.catalunyamedieval.cmts.selenium.pages;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.condition.ConditionRunner;

/**
 * Page Factory 
 * 
 * @author Enric Ballo
 *
 */
public class PageFactory {

    protected final Selenium selenium;
    protected final ConditionRunner conditionRunner;

    public PageFactory(Selenium selenium, ConditionRunner conditionRunner) {
        this.selenium = selenium;
        this.conditionRunner = conditionRunner;
    }

    public HomePage newHome() {
        return new HomePage(this.selenium, this.conditionRunner);
    }

    public AdvancedSearchPage newSearch() {
        return new AdvancedSearchPage(this.selenium, this.conditionRunner);
    }
    
}
