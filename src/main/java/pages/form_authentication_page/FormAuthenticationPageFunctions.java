package pages.form_authentication_page;

import org.openqa.selenium.WebElement;
import utils.browser_manager.DriverManager;

public class FormAuthenticationPageFunctions {
    protected final String HEADERS_PAGE = ".//div[@class='example']/h2";
    protected final String BODY_TEXT = ".//div[@class='example']/h4";
    protected final String CREDENTIALS = ".//div[@class='example']/h4/em";
    protected final String USERNAME_LABEL = ".//label[@for='username']";
    protected final String USERNAME_FIELD = ".//input[@name='username']";
    protected final String PASSWORD_LABEL = ".//label[@for='password']";
    protected final String PASSWORD_FIELD = ".//input[@name='password']";
    protected final String LOGIN_BUTTON = ".//button";
    protected final String LOGIN_BUTTON_LABEL = ".//button/i";
    protected final String ALERT = "//div[@id='flash-messages']";
    protected final String MESSAGE = ".//div[@id='flash']";

    public FormAuthenticationPageFunctions sendKeysToField(WebElement webElement, CharSequence... keysToSend) {
        webElement.sendKeys(keysToSend);
        return this;
    }

    public FormAuthenticationPageFunctions clickLoginButton() {
        DriverManager.findElementByXPATH(LOGIN_BUTTON).click();
        return this;
    }
}
