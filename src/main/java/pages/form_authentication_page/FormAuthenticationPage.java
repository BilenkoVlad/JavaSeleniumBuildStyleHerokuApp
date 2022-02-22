package pages.form_authentication_page;

import org.openqa.selenium.WebElement;
import pages.Assertions;
import utils.browser_manager.DriverManager;

import java.util.List;

public class FormAuthenticationPage extends FormAuthenticationPageFunctions {
    private final FormAuthenticationPageFunctions formAuthenticationPageFunctions;
    private final Assertions assertions;

    private FormAuthenticationPage(FormAuthenticationPageFunctions formAuthenticationPageFunctions, Assertions assertions) {
        this.formAuthenticationPageFunctions = formAuthenticationPageFunctions;
        this.assertions = assertions;
    }

    public static FormAuthenticationPage getFormAuthenticationPage() {
        return new FormAuthenticationPage(
                new FormAuthenticationPageFunctions(),
                new Assertions()
        );
    }

    public WebElement HEADERS_PAGE_ELEMENT() {
        return DriverManager.findElementByXPATH(HEADERS_PAGE);
    }

    public List<WebElement> CREDENTIALS_ELEMENTS() {
        return DriverManager.findElementsByXPATH(CREDENTIALS);
    }

    public WebElement BODY_TEXT_ELEMENT() {
        return DriverManager.findElementByXPATH(BODY_TEXT);
    }

    public WebElement USERNAME_LABEL_ELEMENT() {
        return DriverManager.findElementByXPATH(USERNAME_LABEL);
    }

    public WebElement USERNAME_FIELD_ELEMENT() {
        return DriverManager.findElementByXPATH(USERNAME_FIELD);
    }

    public WebElement PASSWORD_LABEL_ELEMENT() {
        return DriverManager.findElementByXPATH(PASSWORD_LABEL);
    }

    public WebElement PASSWORD_FIELD_ELEMENT() {
        return DriverManager.findElementByXPATH(PASSWORD_FIELD);
    }

    public WebElement LOGIN_BUTTON_ELEMENT() {
        return DriverManager.findElementByXPATH(LOGIN_BUTTON);
    }

    public WebElement LOGIN_BUTTON_LABEL_ELEMENT() {
        return DriverManager.findElementByXPATH(LOGIN_BUTTON_LABEL);
    }

    public WebElement ALERT_ELEMENT() {
        return DriverManager.findElementByXPATH(ALERT);
    }

    public WebElement MESSAGE_ELEMENT() {
        return DriverManager.findElementByXPATH(MESSAGE);
    }

    public FormAuthenticationPageFunctions formAuthenticationPageFunctions() {
        return formAuthenticationPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }

}
