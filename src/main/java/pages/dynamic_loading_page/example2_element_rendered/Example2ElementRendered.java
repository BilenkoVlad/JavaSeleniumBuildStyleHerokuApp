package pages.dynamic_loading_page.example2_element_rendered;

import org.openqa.selenium.WebElement;
import pages.Assertions;
import utils.browser_manager.DriverManager;

public class Example2ElementRendered extends Example2ElementRenderedFunctions {
    private final Example2ElementRenderedFunctions example2ElementRenderedFunctions;
    private final Assertions assertions;

    private Example2ElementRendered(Example2ElementRenderedFunctions example2ElementRenderedFunctions, Assertions assertions) {
        this.example2ElementRenderedFunctions = example2ElementRenderedFunctions;
        this.assertions = assertions;
    }

    public static Example2ElementRendered getExample2ElementRendered() {
        return new Example2ElementRendered(
                new Example2ElementRenderedFunctions(),
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

    public Example2ElementRenderedFunctions example2ElementRenderedFunctions() {
        return example2ElementRenderedFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }
}
