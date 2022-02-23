package pages.dynamic_loading_page.example1_hidden_elements_page;

import org.openqa.selenium.WebElement;
import pages.Assertions;
import utils.browser_manager.DriverManager;

public class Example1HiddenElementsPage extends Example1HiddenElementsPageFunctions {
    private final Example1HiddenElementsPageFunctions example1HiddenElementsPageFunctions;
    private final Assertions assertions;

    private Example1HiddenElementsPage(Example1HiddenElementsPageFunctions example1HiddenElementsPageFunctions, Assertions assertions) {
        this.example1HiddenElementsPageFunctions = example1HiddenElementsPageFunctions;
        this.assertions = assertions;
    }

    public static Example1HiddenElementsPage getExample1HiddenElementsPage() {
        return new Example1HiddenElementsPage(
                new Example1HiddenElementsPageFunctions(),
                new Assertions()
        );
    }

    public WebElement HEADERS_PAGE_ELEMENT() {
        return DriverManager.findElementByXPATH(HEADERS_PAGE);
    }

    public WebElement START_BUTTON_ELEMENT() {
        return DriverManager.findElementByXPATH(START_BUTTON);
    }

    public WebElement BODY_TEXT_ELEMENT() {
        return DriverManager.findElementByXPATH(BODY_TEXT);
    }

    public WebElement LOADER_ELEMENT() {
        return DriverManager.findElementByXPATH(LOADER);
    }

    public WebElement HIDDEN_TEXT_ELEMENT() {
        return DriverManager.findElementByXPATH(HIDDEN_TEXT);
    }

    public String HIDDEN_TEXT_XPATH() {
        return HIDDEN_TEXT;
    }

    public Example1HiddenElementsPageFunctions example1HiddenElementsPageFunctions() {
        return example1HiddenElementsPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }
}
