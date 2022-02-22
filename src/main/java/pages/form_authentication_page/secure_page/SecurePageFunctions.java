package pages.form_authentication_page.secure_page;

import utils.browser_manager.DriverManager;

public class SecurePageFunctions {
    protected final String HEADERS_PAGE = ".//div[@class='example']/h2";
    protected final String BODY_TEXT = ".//div[@class='example']/h4";
    protected final String ALERT = ".//div[@id='flash-messages']";
    protected final String LOGOUT_BUTTON = ".//a[@class='button secondary radius']";
    protected final String LOGOUT_BUTTON_LABEL = ".//a[@class='button secondary radius']/i";

    public SecurePageFunctions clickLogoutButton() {
        DriverManager.findElementByXPATH(LOGOUT_BUTTON).click();
        return this;
    }
}
