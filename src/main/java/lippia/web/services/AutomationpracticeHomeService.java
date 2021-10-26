package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.AutomationpracticeConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class AutomationpracticeHomeService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }
    public static void clickSearchButton() {
        click(AutomationpracticeConstants.BUTTON_SEARCH_XPATH);
    }
    public static void clickLoginButton(){
        click(AutomationpracticeConstants.BUTTON_LOGIN_XPATH);
    }
    public static void completeFieldSearch(){

    }
    public static void completeFieldEmail(){

    }
    public static void completeFieldPassword(){

    }
    public static void LoginScreen(){

    }

    public static void verifySearch(){
        Assert.assertTrue(isVisible(AutomationpracticeConstants.H1_SEARCH_XPATH));
    }
    public static void verifySignInPage(){
        Assert.assertTrue(isVisible(AutomationpracticeConstants.H1_SIGNIN_XPATH));
    }
    public static void verifySearchLowerToHigther(){

    }
}
