package pages.dynamic_loading_page;

import org.openqa.selenium.WebElement;
import pages.Assertions;
import utils.browser_manager.DriverManager;

import java.util.List;

public class DynamicLoadingPage extends DynamicLoadingPageFunctions {
    private final DynamicLoadingPageFunctions dynamicLoadingPageFunctions;
    private final Assertions assertions;

    private DynamicLoadingPage(DynamicLoadingPageFunctions dynamicLoadingPageFunctions, Assertions assertions) {
        this.dynamicLoadingPageFunctions = dynamicLoadingPageFunctions;
        this.assertions = assertions;
    }

    public static DynamicLoadingPage getDynamicLoadingPage() {
        return new DynamicLoadingPage(
                new DynamicLoadingPageFunctions(),
                new Assertions()
        );
    }

    public WebElement HEADERS_PAGE_ELEMENT() {
        return DriverManager.findElementByXPATH(HEADERS_PAGE);
    }

    public List<WebElement> BODY_LINKS_ELEMENTS() {
        return DriverManager.findElementsByXPATH(BODY_LINKS);
    }

    public List<WebElement> BODY_TEXT_ELEMENTS() {
        return DriverManager.findElementsByXPATH(BODY_TEXT);
    }

    public DynamicLoadingPageFunctions dynamicLoadingPageFunctions() {
        return dynamicLoadingPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }
}
