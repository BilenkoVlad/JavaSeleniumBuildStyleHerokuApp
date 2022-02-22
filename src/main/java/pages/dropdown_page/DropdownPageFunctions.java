package pages.dropdown_page;

import org.openqa.selenium.WebElement;
import utils.browser_manager.SelectManager;

public class DropdownPageFunctions {
    protected final String HEADER_PAGE = ".//div[@class='example']/h3";
    protected final String DROPDOWN = ".//select[@id='dropdown']";

    public DropdownPageFunctions selectByVisibleText(WebElement webElement, String text) {
        SelectManager.initActions(webElement).selectByVisibleText(text);
        return this;
    }
}
