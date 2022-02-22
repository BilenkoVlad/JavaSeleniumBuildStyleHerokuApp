package pages.entry_ad_page;

import org.openqa.selenium.WebElement;
import pages.Assertions;
import utils.browser_manager.DriverManager;

import java.util.List;

public class EntryAdPage extends EntryAdPageFunctions {
    private final EntryAdPageFunctions entryAdPageFunctions;
    private final Assertions assertions;

    private EntryAdPage(EntryAdPageFunctions entryAdPageFunctions, Assertions assertions) {
        this.entryAdPageFunctions = entryAdPageFunctions;
        this.assertions = assertions;
    }

    public static EntryAdPage getEntryAdPage() {
        return new EntryAdPage(
                new EntryAdPageFunctions(),
                new Assertions()
        );
    }

    public WebElement HEADERS_PAGE_ELEMENT() {
        return DriverManager.findElementByXPATH(HEADERS_PAGE);
    }

    public WebElement MODAL_WINDOW_ELEMENT() {
        return DriverManager.findElementByXPATH(MODAL_WINDOW);
    }

    public String MODAL_WINDOW_XPATH() {
        return MODAL_WINDOW;
    }

    public List<WebElement> BODY_TEXT_ELEMENT() {
        return DriverManager.findElementsByXPATH(BODY_TEXT);
    }

    public WebElement CLICK_HERE_ELEMENT() {
        return DriverManager.findElementByXPATH(CLICK_HERE);
    }

    public WebElement TITLE_ELEMENT() {
        return DriverManager.findElementByXPATH(TITLE);
    }

    public WebElement TEXT_ELEMENT() {
        return DriverManager.findElementByXPATH(TEXT);
    }

    public WebElement CLOSE_BUTTON_ELEMENT() {
        return DriverManager.findElementByXPATH(CLOSE_BUTTON);
    }

    public EntryAdPageFunctions entryAdPageFunctions() {
        return entryAdPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }
}
