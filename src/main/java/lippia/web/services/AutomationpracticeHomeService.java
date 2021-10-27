package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.AutomationpracticeConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static com.crowdar.core.actions.WebActionManager.setDropdownByIndex;

public class AutomationpracticeHomeService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickSearchButton() {
        click(AutomationpracticeConstants.BUTTON_SEARCH_XPATH);
    }

    public static void clickLoginButton(){
        click(AutomationpracticeConstants.BUTTON_SIGNIN_XPATH);
    }
    public static void completeFieldSearch(String word){
        setInput(AutomationpracticeConstants.INPUT_SEARCH_XPATH, word);
    }
    public static void completeFieldEmail(String email){
        setInput(AutomationpracticeConstants.INPUT_ADDRESS_XPATH, email);
    }
    public static void completeFieldPassword(String password){
        setInput(AutomationpracticeConstants.INPUT_PASSWORD_XPATH,password);
    }
    public static void LoginScreen(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
        waitVisibility(AutomationpracticeConstants.BUTTON_LOGIN_XPATH).click();
    }
    public static void clickOptionDropdown(){
        click(AutomationpracticeConstants.SELECTOR_SEARCH_XPATH);
        click(AutomationpracticeConstants.OPTION_SEARCH_XPATH);
    }
    public static void verifySearch(){
        Assert.assertTrue(isVisible(AutomationpracticeConstants.H1_SEARCH_XPATH));
    }
    public static void verifySignInPage(){
        Assert.assertTrue(isVisible(AutomationpracticeConstants.H1_SIGNIN_XPATH));
    }
    public static void verifySearchLowerToHigther(){
        //Verificar con un for AutomationpracticeConstants.LIST_SEARCH_XPATH
    }
}
