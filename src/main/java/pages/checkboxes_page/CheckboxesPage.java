package pages.checkboxes_page;

import org.openqa.selenium.WebElement;
import pages.Assertions;
import utils.browser_manager.DriverManager;

import java.util.List;

public class CheckboxesPage extends CheckboxesPageFunctions {
    private final CheckboxesPageFunctions checkboxesPageFunctions;
    private final Assertions assertions;

    private CheckboxesPage(CheckboxesPageFunctions checkboxesPageFunctions, Assertions assertions) {
        this.checkboxesPageFunctions = checkboxesPageFunctions;
        this.assertions = assertions;
    }

    public static CheckboxesPage getCheckboxesPage() {
        return new CheckboxesPage(
                new CheckboxesPageFunctions(),
                new Assertions()
        );
    }

    public WebElement HEADER_PAGE_ELEMENT() {
        return DriverManager.findElementByXPATH(HEADER_PAGE);
    }

    public List<WebElement> CHECKBOX_ELEMENTS() {
        return DriverManager.findElementsByXPATH(CHECKBOX);
    }

    public CheckboxesPageFunctions checkboxesPageFunctions() {
        return checkboxesPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }
}
