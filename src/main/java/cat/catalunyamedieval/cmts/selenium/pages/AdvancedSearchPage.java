/**
 * 
 */
package cat.catalunyamedieval.cmts.selenium.pages;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.condition.ConditionRunner;

/**
 * Selenium page for Advanced Search Page
 * 
 * @author Enric Ballo
 *
 */
public class AdvancedSearchPage  extends AbstractPage {

	private static final String ADVANCED_SEARCH_URL = "http://www.catalunyamedieval.es/cerca/";
    private static final String NAME_KEYWORDSEARCH = "name=keywordsearch";
    private static final String SEARCH_BUTTON = "id=searchsubmit_2";

    public AdvancedSearchPage(Selenium selenium, ConditionRunner conditionRunner) {
		super(selenium, conditionRunner);
	}

	public void go(){
		open(ADVANCED_SEARCH_URL);
	}
	
	public void fillText(final String text){
	    type(NAME_KEYWORDSEARCH, text);
	}
	
	public void selectDropDown(final String text){
	    selenium.select("id=cat", text);
	}
	
	public void doSubmit(){
	    click(SEARCH_BUTTON);
	    waitForPageToLoad(WAIT_FOR_PAGE_TO_LOAD_INTERVAL_MSEC);
	}
	
	public boolean validatePageIsLoaded(){
	    return isTextPresent("Resultats de la cerca");
	}
	
	public boolean totalResults(final int total){
	    return isTextPresent(total + " elements similars a la consulta");
	}
}
