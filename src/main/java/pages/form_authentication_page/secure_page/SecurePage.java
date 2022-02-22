package pages.form_authentication_page.secure_page;

import org.openqa.selenium.WebElement;
import pages.Assertions;
import utils.browser_manager.DriverManager;

public class SecurePage extends SecurePageFunctions {
    private final SecurePageFunctions securePageFunctions;
    private final Assertions assertions;

    private SecurePage(SecurePageFunctions securePageFunctions, Assertions assertions) {
        this.securePageFunctions = securePageFunctions;
        this.assertions = assertions;
    }

    public static SecurePage getSecurePage() {
        return new SecurePage(
                new SecurePageFunctions(),
                new Assertions()
        );
    }

    public WebElement HEADERS_PAGE_ELEMENT() {
        return DriverManager.findElementByXPATH(HEADERS_PAGE);
    }

    public WebElement LOGOUT_BUTTON_ELEMENT() {
        return DriverManager.findElementByXPATH(LOGOUT_BUTTON);
    }

    public WebElement BODY_TEXT_ELEMENT() {
        return DriverManager.findElementByXPATH(BODY_TEXT);
    }

    public WebElement LOGOUT_BUTTON_LABEL_ELEMENT() {
        return DriverManager.findElementByXPATH(LOGOUT_BUTTON_LABEL);
    }

    public WebElement ALERT_ELEMENT() {
        return DriverManager.findElementByXPATH(ALERT);
    }

    public SecurePageFunctions securePageFunctions() {
        return securePageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }
}
