package pages.frames_page;

import utils.browser_manager.DriverManager;

public class FramesPageFunctions {
    protected final String HEADERS_PAGE = ".//div[@class='example']/h3";
    protected final String LINKS = ".//div[@class='example']/ul/li/a";

    public FramesPageFunctions clickOnNestedFramesLink(){
        DriverManager.findElementsByXPATH(LINKS).get(0).click();
        return this;
    }

    public FramesPageFunctions clickOnIFrameLink(){
        DriverManager.findElementsByXPATH(LINKS).get(1).click();
        return this;
    }
}
