package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.AutomationpracticeHomeService;

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
        AutomationpracticeHomeService.completeFieldSearch(word);
    }
    @When("^The client enters username \"(.*)\" and password \"(.*)\"$")
    public void theClientEntersUsernameAndPasswordInTheCorrespondingBoxes(String email, String password) {
        AutomationpracticeHomeService.completeFieldEmail(email);
        AutomationpracticeHomeService.completeFieldPassword(password);
    }
    @And("The client click on button search")
    public void theClientClickOnButtonSearch() {
        AutomationpracticeHomeService.clickSearchButton();
    }
    @And("The client click on button login")
    public void theClientClickOnButtonLogin() {
        AutomationpracticeHomeService.clickLoginButton();
    }
    @And("^The client click in the option \"(.*)\" on the dropdown$")
    public void theClientClickInTheOptionOnTheDropdown(String option) {
        AutomationpracticeHomeService.clickOptionDropdown();
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
        AutomationpracticeHomeService.verifySearchLowerToHigher();
    }


}


