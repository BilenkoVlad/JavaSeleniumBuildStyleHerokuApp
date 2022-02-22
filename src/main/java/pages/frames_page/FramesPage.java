package pages.frames_page;

import org.openqa.selenium.WebElement;
import pages.Assertions;
import utils.browser_manager.DriverManager;

import java.util.List;

public class FramesPage extends FramesPageFunctions {

    private final FramesPageFunctions framesPageFunctions;
    private final Assertions assertions;

    private FramesPage(FramesPageFunctions framesPageFunctions, Assertions assertions) {
        this.framesPageFunctions = framesPageFunctions;
        this.assertions = assertions;
    }

    public static FramesPage getFramesPage() {
        return new FramesPage(
                new FramesPageFunctions(),
                new Assertions()
        );
    }

    public WebElement HEADERS_PAGE_ELEMENTS() {
        return DriverManager.findElementByXPATH(HEADERS_PAGE);
    }

    public List<WebElement> LINKS_ELEMENTS() {
        return DriverManager.findElementsByXPATH(LINKS);
    }

    public FramesPageFunctions framesPageFunctions() {
        return framesPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }
}
