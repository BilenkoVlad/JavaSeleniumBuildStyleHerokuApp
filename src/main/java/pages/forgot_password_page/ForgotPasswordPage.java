package pages.forgot_password_page;

import org.openqa.selenium.WebElement;
import pages.Assertions;
import utils.browser_manager.DriverManager;

public class ForgotPasswordPage extends ForgotPasswordPageFunctions {

    private final ForgotPasswordPageFunctions forgotPasswordPageFunctions;
    private final Assertions assertions;

    private ForgotPasswordPage(ForgotPasswordPageFunctions forgotPasswordPageFunctions, Assertions assertions) {
        this.forgotPasswordPageFunctions = forgotPasswordPageFunctions;
        this.assertions = assertions;
    }

    public static ForgotPasswordPage getForgotPasswordPage() {
        return new ForgotPasswordPage(
                new ForgotPasswordPageFunctions(),
                new Assertions()
        );
    }

    public WebElement HEADERS_PAGE_ELEMENT() {
        return DriverManager.findElementByXPATH(HEADERS_PAGE);
    }

    public WebElement FIELD_LABEL_ELEMENT() {
        return DriverManager.findElementByXPATH(FIELD_LABEL);
    }

    public WebElement EMAIL_FIELD_ELEMENT() {
        return DriverManager.findElementByXPATH(EMAIL_FIELD);
    }

    public WebElement RETRIEVE_PASSWORD_BUTTON_ELEMENT() {
        return DriverManager.findElementByXPATH(RETRIEVE_PASSWORD_BUTTON);
    }

    public WebElement BUTTON_NAME_ELEMENT() {
        return DriverManager.findElementByXPATH(BUTTON_NAME);
    }

    public ForgotPasswordPageFunctions forgotPasswordPageFunctions() {
        return forgotPasswordPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }
}
