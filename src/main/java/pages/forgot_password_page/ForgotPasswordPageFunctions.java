package pages.forgot_password_page;

import utils.browser_manager.DriverManager;

public class ForgotPasswordPageFunctions {
    protected final String HEADERS_PAGE = ".//div[@class='example']/h2";
    protected final String FIELD_LABEL = ".//label[@for='email']";
    protected final String EMAIL_FIELD = ".//input[@id='email']";
    protected final String RETRIEVE_PASSWORD_BUTTON = ".//button[@id='form_submit']";
    protected final String BUTTON_NAME = ".//button[@id='form_submit']/i";

    public ForgotPasswordPageFunctions sendKeysToEmailField(CharSequence... charSequences) {
        DriverManager.findElementByXPATH(EMAIL_FIELD).sendKeys(charSequences);
        return this;
    }

    public ForgotPasswordPageFunctions clickOnRetrievePasswordButton() {
        DriverManager.findElementByXPATH(RETRIEVE_PASSWORD_BUTTON).click();
        return this;
    }
}
