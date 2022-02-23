package pages.dynamic_loading_page.example2_element_rendered;

import utils.browser_manager.DriverManager;

public class Example2ElementRenderedFunctions {
    protected final String HEADERS_PAGE = ".//div[@class='example']/h3";
    protected final String BODY_TEXT = ".//div[@class='example']/h4";
    protected final String START_BUTTON = ".//div[@id='start']/button";
    protected final String LOADER = ".//div[@id='loading']";
    protected final String HIDDEN_TEXT = ".//div[@id='finish']/h4";

    public Example2ElementRenderedFunctions clickOnStartButton() {
        DriverManager.findElementByXPATH(START_BUTTON).click();
        return this;
    }
}
