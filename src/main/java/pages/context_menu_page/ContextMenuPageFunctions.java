package pages.context_menu_page;

import utils.browser_manager.ActionsManager;
import utils.browser_manager.DriverManager;

public class ContextMenuPageFunctions {
    protected final String HEADER_PAGE = ".//div[@class='example']/h3";
    protected final String BODY_TEXT = ".//div[@class='example']/p";
    protected final String CONTEXT_BOX = ".//div[@id='hot-spot']";

    public ContextMenuPageFunctions leftClickOnContextBox() {
        DriverManager.findElementByXPATH(CONTEXT_BOX).click();
        return this;
    }

    public ContextMenuPageFunctions rightClickOnContextBox() {
        ActionsManager.initActions().contextClick(DriverManager.findElementByXPATH(CONTEXT_BOX)).perform();
        return this;
    }

    public ContextMenuPageFunctions clickOnHeader() {
        DriverManager.findElementByXPATH(HEADER_PAGE).click();
        return this;
    }
}
