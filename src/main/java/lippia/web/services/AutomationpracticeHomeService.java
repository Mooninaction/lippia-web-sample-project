package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.AutomationpracticeConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static com.crowdar.core.actions.WebActionManager.*;

public class AutomationpracticeHomeService extends ActionManager {

    public static void navegarWeb() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickSearchButton() {
        click(AutomationpracticeConstants.BUTTON_SEARCH);
    }

    public static void clickLoginButton() {
        click(AutomationpracticeConstants.BUTTON_SIGNIN);
    }

    public static void completeFieldSearch(String word) {
        setInput(AutomationpracticeConstants.INPUT_SEARCH, word);
    }

    public static void completeFieldEmail(String email) {
        setInput(AutomationpracticeConstants.INPUT_ADDRESS, email);
    }

    public static void completeFieldPassword(String password) {
        setInput(AutomationpracticeConstants.INPUT_PASSWORD, password);
    }

    public static void LoginScreen() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
        waitVisibility(AutomationpracticeConstants.BUTTON_LOGIN).click();
    }

    public static void clickOptionDropdown(String option) {
        click(AutomationpracticeConstants.SELECTOR_SEARCH);
        if(WebActionManager
                .waitVisibility(AutomationpracticeConstants.OPTION_SEARCH)
                .getText()
                .contains(option)){
            click(AutomationpracticeConstants.OPTION_SEARCH);
        }else{
            Assert.fail("The option " + option + " does not exist");
        }
    }

    public static void verifySearch() {
        Assert.assertTrue(isVisible(AutomationpracticeConstants.H1_SEARCH));
    }

    public static void verifySignInPage() {
        Assert.assertTrue(isVisible(AutomationpracticeConstants.H1_SIGNIN));
    }

    public static void verifySearchLowerToHigher() {
        waitVisibility(AutomationpracticeConstants.LIST_SEARCH);
        List<WebElement> listSearchOptions = ActionManager.getElements(AutomationpracticeConstants.LIST_SEARCH);

        Double priceLess = 0.0;
        for (WebElement priceList : listSearchOptions) {
            Double price = Double.parseDouble(
                    priceList
                            .getText()
                            .replace("$", ""));

            Assert.assertTrue(validateSearchLowerToHigher(price, priceLess));
            priceLess = price;
        }
    }
    public static boolean validateSearchLowerToHigher(Double price, Double priceLess){
        return priceLess <= price;
    }
}
