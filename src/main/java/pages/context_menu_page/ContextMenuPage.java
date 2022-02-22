package pages.context_menu_page;

import org.openqa.selenium.WebElement;
import pages.Assertions;
import utils.browser_manager.DriverManager;

import java.util.List;

public class ContextMenuPage extends ContextMenuPageFunctions {
    private final ContextMenuPageFunctions contextMenuPageFunctions;
    private final Assertions assertions;

    private ContextMenuPage(ContextMenuPageFunctions contextMenuPageFunctions, Assertions assertions) {
        this.contextMenuPageFunctions = contextMenuPageFunctions;
        this.assertions = assertions;
    }

    public static ContextMenuPage getContextMenuPage() {
        return new ContextMenuPage(
                new ContextMenuPageFunctions(),
                new Assertions()
        );
    }

    public WebElement HEADER_PAGE_ELEMENT() {
        return DriverManager.findElementByXPATH(HEADER_PAGE);
    }

    public WebElement CONTEXT_BOX_ELEMENT() {
        return DriverManager.findElementByXPATH(CONTEXT_BOX);
    }

    public List<WebElement> BODY_TEXT_ELEMENTS() {
        return DriverManager.findElementsByXPATH(BODY_TEXT);
    }

    public ContextMenuPageFunctions contextMenuPageFunctions() {
        return contextMenuPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }


}
