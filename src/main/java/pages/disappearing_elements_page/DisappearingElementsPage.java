package pages.disappearing_elements_page;

import org.openqa.selenium.WebElement;
import pages.Assertions;
import utils.browser_manager.DriverManager;

import java.util.List;

public class DisappearingElementsPage extends DisappearingElementsPageFunctions {
    private final DisappearingElementsPageFunctions disappearingElementsPageFunctions;
    private final Assertions assertions;

    private DisappearingElementsPage(DisappearingElementsPageFunctions disappearingElementsPageFunctions, Assertions assertions) {
        this.disappearingElementsPageFunctions = disappearingElementsPageFunctions;
        this.assertions = assertions;
    }

    public static DisappearingElementsPage getDisappearingElementsPage() {
        return new DisappearingElementsPage(
                new DisappearingElementsPageFunctions(),
                new Assertions()
        );
    }

    public WebElement HEADER_PAGE_ELEMENT() {
        return DriverManager.findElementByXPATH(HEADER_PAGE);
    }

    public List<WebElement> BUTTON_ELEMENTS() {
        return DriverManager.findElementsByXPATH(BUTTON);
    }

    public WebElement HIDDEN_BUTTON_ELEMENT() {
        return DriverManager.findElementByXPATH(HIDDEN_BUTTON);
    }

    public String HIDDEN_BUTTON_XPATH() {
        return HIDDEN_BUTTON;
    }

    public WebElement BODY_TEXT_ELEMENT() {
        return DriverManager.findElementByXPATH(BODY_TEXT);
    }

    public DisappearingElementsPageFunctions disappearingElementsPageFunctions() {
        return disappearingElementsPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }

}
