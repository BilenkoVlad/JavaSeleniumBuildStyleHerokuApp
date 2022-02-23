package pages.dynamic_controls_page;

import utils.browser_manager.DriverManager;

public class DynamicControlsPageFunctions {
    protected final String HEADER_PAGE = ".//div[@class='example']/h4";
    protected final String BODY_TEXT = ".//div[@class='example']/p";
    protected final String REMOVE_BUTTON = ".//button[text()='Remove']";
    protected final String ADD_BUTTON = ".//button[text()='Add']";
    protected final String MESSAGE = ".//p[@id='message']";
    protected final String INPUT_LOADING = ".//form[@id='input-example']//div[@id='loading']";
    protected final String CHECKBOX_LOADING = ".//form[@id='checkbox-example']//div[@id='loading']";
    protected final String ENABLE_BUTTON = ".//button[text()='Enable']";
    protected final String DISABLE_BUTTON = ".//button[text()='Disable']";
    protected final String CHECKBOX = ".//input[@type='checkbox']";
    protected final String TEXT_FIELD = ".//input[@type='text']";

    public DynamicControlsPageFunctions clickOnCheckbox() {
        DriverManager.findElementByXPATH(CHECKBOX).click();
        return this;
    }

    public DynamicControlsPageFunctions clickOnRemoveButton() {
        DriverManager.findElementByXPATH(REMOVE_BUTTON).click();
        return this;
    }

    public DynamicControlsPageFunctions clickOnAddButton() {
        DriverManager.findElementByXPATH(ADD_BUTTON).click();
        return this;
    }

    public DynamicControlsPageFunctions clickOnEnableButton() {
        DriverManager.findElementByXPATH(ENABLE_BUTTON).click();
        return this;
    }

    public DynamicControlsPageFunctions clickOnDisableButton() {
        DriverManager.findElementByXPATH(DISABLE_BUTTON).click();
        return this;
    }

    public DynamicControlsPageFunctions sendKeysToTextField(CharSequence... charSequences) {
        DriverManager.findElementByXPATH(TEXT_FIELD).sendKeys(charSequences);
        return this;
    }
}
