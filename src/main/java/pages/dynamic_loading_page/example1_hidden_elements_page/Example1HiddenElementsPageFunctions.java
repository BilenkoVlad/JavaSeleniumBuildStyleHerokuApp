package pages.dynamic_loading_page.example1_hidden_elements_page;

import utils.browser_manager.DriverManager;

public class Example1HiddenElementsPageFunctions {
    protected final String HEADERS_PAGE = ".//div[@class='example']/h3";
    protected final String BODY_TEXT = ".//div[@class='example']/h4";
    protected final String START_BUTTON = ".//div[@id='start']/button";
    protected final String LOADER = ".//div[@id='loading']";
    protected final String HIDDEN_TEXT = ".//div[@id='finish']/h4";

    public Example1HiddenElementsPageFunctions clickOnStartButton() {
        DriverManager.findElementByXPATH(START_BUTTON).click();
        return this;
    }
}
