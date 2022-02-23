package pages.checkboxes_page;

import utils.browser_manager.DriverManager;

public class CheckboxesPageFunctions {
    protected final String HEADER_PAGE = ".//div[@class='example']/h3";
    protected final String CHECKBOX = ".//input[@type='checkbox']";

    public CheckboxesPageFunctions selectFirstCheckbox() {
        DriverManager.findElementsByXPATH(CHECKBOX).get(0).click();
        return this;
    }

    public CheckboxesPageFunctions selectSecondCheckbox() {
        DriverManager.findElementsByXPATH(CHECKBOX).get(1).click();
        return this;
    }
}
