package pages.dynamic_controls_page;

import org.openqa.selenium.WebElement;
import pages.Assertions;
import utils.browser_manager.DriverManager;

import java.util.List;

public class DynamicControlsPage extends DynamicControlsPageFunctions {
    private final DynamicControlsPageFunctions dynamicControlsPageFunctions;
    private final Assertions assertions;

    private DynamicControlsPage(DynamicControlsPageFunctions dynamicControlsPageFunctions, Assertions assertions) {
        this.dynamicControlsPageFunctions = dynamicControlsPageFunctions;
        this.assertions = assertions;
    }

    public static DynamicControlsPage getDynamicControlsPage() {
        return new DynamicControlsPage(
                new DynamicControlsPageFunctions(),
                new Assertions()
        );
    }

    public List<WebElement> HEADER_PAGE_ELEMENTS() {
        return DriverManager.findElementsByXPATH(HEADER_PAGE);
    }

    public WebElement REMOVE_BUTTON_ELEMENT() {
        return DriverManager.findElementByXPATH(REMOVE_BUTTON);
    }

    public WebElement ADD_BUTTON_ELEMENT() {
        return DriverManager.findElementByXPATH(ADD_BUTTON);
    }

    public WebElement MESSAGE_ELEMENT() {
        return DriverManager.findElementByXPATH(MESSAGE);
    }

    public String MESSAGE_XPATH() {
        return MESSAGE;
    }

    public WebElement INPUT_LOADING_ELEMENT() {
        return DriverManager.findElementByXPATH(INPUT_LOADING);
    }

    public List<WebElement> CHECKBOX_LOADING_ELEMENTS() {
        return DriverManager.findElementsByXPATH(CHECKBOX_LOADING);
    }

    public WebElement ENABLE_BUTTON_ELEMENT() {
        return DriverManager.findElementByXPATH(ENABLE_BUTTON);
    }

    public WebElement DISABLE_BUTTON_ELEMENT() {
        return DriverManager.findElementByXPATH(DISABLE_BUTTON);
    }

    public WebElement CHECKBOX_ELEMENT() {
        return DriverManager.findElementByXPATH(CHECKBOX);
    }

    public String CHECKBOX_XPATH() {
        return CHECKBOX;
    }

    public WebElement TEXT_FIELD_ELEMENT() {
        return DriverManager.findElementByXPATH(TEXT_FIELD);
    }

    public WebElement BODY_TEXT_ELEMENT() {
        return DriverManager.findElementByXPATH(BODY_TEXT);
    }

    public DynamicControlsPageFunctions dynamicControlsPageFunctions() {
        return dynamicControlsPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }

}
