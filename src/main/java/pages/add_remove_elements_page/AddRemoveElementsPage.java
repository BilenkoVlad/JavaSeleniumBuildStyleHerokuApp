package pages.add_remove_elements_page;

import org.openqa.selenium.WebElement;
import pages.Assertions;
import utils.browser_manager.DriverManager;

import java.util.List;

public class AddRemoveElementsPage extends AddRemoveElementsPageFunctions {
    private final AddRemoveElementsPageFunctions addRemoveElementsPageFunctions;
    private final Assertions assertions;

    private AddRemoveElementsPage(AddRemoveElementsPageFunctions addRemoveElementsPageFunctions, Assertions assertions) {
        this.addRemoveElementsPageFunctions = addRemoveElementsPageFunctions;
        this.assertions = assertions;
    }

    public static AddRemoveElementsPage getAddRemoveElementsPage() {
        return new AddRemoveElementsPage(
                new AddRemoveElementsPageFunctions(),
                new Assertions()
        );
    }

    public WebElement ADD_BUTTON_ELEMENT() {
        return DriverManager.findElementByXPATH(ADD_BUTTON);
    }

    public WebElement DELETE_BUTTON_ELEMENT() {
        return DriverManager.findElementByXPATH(DELETE_BUTTON);
    }

    public String DELETE_BUTTON_XPATH() {
        return DELETE_BUTTON;
    }

    public List<WebElement> DELETE_BUTTON_ELEMENTS() {
        return DriverManager.findElementsByXPATH(DELETE_BUTTON);
    }

    public AddRemoveElementsPageFunctions addRemoveElementsPageFunctions() {
        return addRemoveElementsPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }
}
