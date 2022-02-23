package pages.dynamic_loading_page;

import utils.browser_manager.DriverManager;

public class DynamicLoadingPageFunctions {
    protected final String HEADERS_PAGE = ".//div[@class='example']/h3";
    protected final String BODY_TEXT = ".//div[@class='example']/p";
    protected final String BODY_LINKS = ".//div[@class='example']/a";

    public DynamicLoadingPageFunctions clickOnFirstLink() {
        DriverManager.findElementsByXPATH(BODY_LINKS).get(0).click();
        return this;
    }

    public DynamicLoadingPageFunctions clickOnSecondLink() {
        DriverManager.findElementsByXPATH(BODY_LINKS).get(1).click();
        return this;
    }
}
