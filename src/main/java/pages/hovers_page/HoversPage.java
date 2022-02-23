package pages.hovers_page;

import org.openqa.selenium.WebElement;
import pages.Assertions;
import utils.browser_manager.DriverManager;

import java.util.List;

public class HoversPage extends HoversPageFunctions {
    private final HoversPageFunctions hoversPageFunctions;
    private final Assertions assertions;

    private HoversPage(HoversPageFunctions hoversPageFunctions, Assertions assertions) {
        this.hoversPageFunctions = hoversPageFunctions;
        this.assertions = assertions;
    }

    public static HoversPage getHoversPage() {
        return new HoversPage(
                new HoversPageFunctions(),
                new Assertions()
        );
    }

    public WebElement HEADERS_PAGE_ELEMENT() {
        return DriverManager.findElementByXPATH(HEADERS_PAGE);
    }

    public List<WebElement> AVATARS_ELEMENTS() {
        return DriverManager.findElementsByXPATH(AVATARS);
    }

    public List<WebElement> AVATARS_NAMES_ELEMENTS() {
        return DriverManager.findElementsByXPATH(AVATARS_NAMES);
    }

    public List<WebElement> AVATARS_LINKS_ELEMENTS() {
        return DriverManager.findElementsByXPATH(AVATARS_LINKS);
    }

    public WebElement BODY_TEXT_ELEMENT() {
        return DriverManager.findElementByXPATH(BODY_TEXT);
    }

    public HoversPageFunctions hoversPageFunctions() {
        return hoversPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }

}
