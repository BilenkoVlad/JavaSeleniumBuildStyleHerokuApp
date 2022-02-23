package pages.inputs_page;

import org.openqa.selenium.WebElement;
import pages.Assertions;
import utils.browser_manager.DriverManager;

public class InputsPage extends InputsPageFunctions {

    private final InputsPageFunctions inputsPageFunctions;
    private final Assertions assertions;

    private InputsPage(InputsPageFunctions inputsPageFunctions, Assertions assertions) {
        this.inputsPageFunctions = inputsPageFunctions;
        this.assertions = assertions;
    }

    public static InputsPage getInputsPage() {
        return new InputsPage(
                new InputsPageFunctions(),
                new Assertions()
        );
    }

    public WebElement HEADERS_PAGE_ELEMENT() {
        return DriverManager.findElementByXPATH(HEADERS_PAGE);
    }

    public WebElement INPUT_FIELD_ELEMENT() {
        return DriverManager.findElementByXPATH(INPUT_FIELD);
    }

    public WebElement BODY_TEXT_ELEMENT() {
        return DriverManager.findElementByXPATH(BODY_TEXT);
    }

    public InputsPageFunctions inputsPageFunctions() {
        return inputsPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }
}
