package pages.inputs_page;

import utils.browser_manager.DriverManager;

public class InputsPageFunctions {
    protected final String HEADERS_PAGE = ".//div[@class='large-6 small-12 columns large-centered']/h3";
    protected final String BODY_TEXT = ".//div[@class='example']/p";
    protected final String INPUT_FIELD = ".//input";

    public InputsPageFunctions clickOnInputField() {
        DriverManager.findElementByXPATH(INPUT_FIELD).click();
        return this;
    }

    public InputsPageFunctions sendKeysToInputField(CharSequence... charSequences) {
        DriverManager.findElementByXPATH(INPUT_FIELD).sendKeys(charSequences);
        return this;
    }

    public InputsPageFunctions clearInputField() {
        DriverManager.findElementByXPATH(INPUT_FIELD).clear();
        return this;
    }
}
