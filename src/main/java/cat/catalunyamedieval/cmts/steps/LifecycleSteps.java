package cat.catalunyamedieval.cmts.steps;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.BeforeScenario;

import com.thoughtworks.selenium.Selenium;

/**
 * Life Cycle Steps
 * 
 * @author Enric Ballo
 *
 */
public class LifecycleSteps {

    /** The Selenium object used to use Selenium RC. */
    private Selenium selenium;

    public LifecycleSteps(Selenium selenium) {
    	this.selenium = selenium;
    }

    @BeforeScenario
    public void startSelenium() {
        selenium.start();
        selenium.windowMaximize();
    }

    @AfterScenario
    public void shutDownSelenium() {
        selenium.stop();
    }
}
