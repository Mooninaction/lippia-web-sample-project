package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.AutomationpracticeHomeService;
import lippia.web.services.AutomationpracticeSearchResultService;

public class AutomationpracticeSearchSteps extends PageSteps {

    @Given("The client is in landing page")
    public void theClientIsInLandingPage() {
        AutomationpracticeHomeService.navegarWeb();
    }
    @Given("The client is on the login screen")
    public void theClientIsOnTheLoginScreen() {
        AutomationpracticeHomeService.LoginScreen();
    }
    @When("^The client search for word \"(.*)\"$")
    public void theClientSearchForWordShort(String word) {
        AutomationpracticeHomeService.completeFieldSearch();
    }
    @When("^The client enters username \"(.*)\" and password \"(.*)\" in the corresponding boxes$")
    public void theClientEntersUsernameAndPasswordInTheCorrespondingBoxes(String email, String password) {
        AutomationpracticeHomeService.completeFieldEmail();
        AutomationpracticeHomeService.completeFieldPassword();
    }
    @And("The client click on boton search")
    public void theClientClickOnBotonSearch() {
        AutomationpracticeHomeService.clickSearchButton();
    }
    @And("The client click on boton login")
    public void theClientClickOnBotonLogin() {
        AutomationpracticeHomeService.clickLoginButton();
    }
    @Then("The client verify that results are shown properly")
    public void theClientVerifyThatResultsAreShownProperly() {
        AutomationpracticeHomeService.verifySearch();
    }
    @Then("The client verify that enters my account")
    public void theClientVerifyThatEntersMyAccount() {
        AutomationpracticeHomeService.verifySignInPage();
    }
    @Then("The client verify that they are ordered from smallest to largest")
    public void theClientVerifyThatTheyAreOrderedFromSmallestToLargest() {
        AutomationpracticeHomeService.verifySearchLowerToHigther();
    }
}


