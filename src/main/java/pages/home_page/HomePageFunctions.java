package pages.home_page;

import utils.browser_manager.DriverManager;

public class HomePageFunctions {
    protected final String LINK_TO_PAGE = "//*[contains(text(), '%s')]";

    public HomePageFunctions clickOnLink(String linkName) {
        DriverManager.findElementByXPATH(String.format(LINK_TO_PAGE, linkName)).click();
        return this;
    }
}
