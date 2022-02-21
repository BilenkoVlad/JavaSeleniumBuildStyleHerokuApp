package pages.add_remove_elements_page;

import utils.browser_manager.DriverManager;

public class AddRemoveElementsPageFunctions {
    protected final String ADD_BUTTON = "//button[@onclick='addElement()']";
    protected final String DELETE_BUTTON = "//button[@onclick='deleteElement()']";

    public AddRemoveElementsPageFunctions clickAddButton() {
        DriverManager.findElementByXPATH(ADD_BUTTON).click();
        return this;
    }

    public AddRemoveElementsPageFunctions clickDeleteButton() {
        DriverManager.findElementByXPATH(DELETE_BUTTON).click();
        return this;
    }

    public AddRemoveElementsPageFunctions clickAddButton10Times() {
        for (int i = 0; i < 10; i++) {
            DriverManager.findElementByXPATH(ADD_BUTTON).click();
        }
        return this;
    }

    public AddRemoveElementsPageFunctions clickDeleteButton10Times() {
        for (int i = 9; i >= 0; i--) {
            DriverManager.findElementByXPATH(DELETE_BUTTON).click();
        }
        return this;
    }
}
