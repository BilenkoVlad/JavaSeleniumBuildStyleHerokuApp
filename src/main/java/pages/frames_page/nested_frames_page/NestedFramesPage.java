package pages.frames_page.nested_frames_page;

import org.openqa.selenium.WebElement;
import pages.Assertions;
import utils.browser_manager.DriverManager;

public class NestedFramesPage extends NestedFramesPageFunctions {

    private final NestedFramesPageFunctions nestedFramesPageFunctions;
    private final Assertions assertions;

    private NestedFramesPage(NestedFramesPageFunctions nestedFramesPageFunctions, Assertions assertions) {
        this.nestedFramesPageFunctions = nestedFramesPageFunctions;
        this.assertions = assertions;
    }

    public static NestedFramesPage getNestedFramesPage() {
        return new NestedFramesPage(
                new NestedFramesPageFunctions(),
                new Assertions()
        );
    }

    public WebElement MIDDLE_FRAME_SET_ELEMENT() {
        return DriverManager.findElementByXPATH(MIDDLE_FRAME_SET);
    }

    public WebElement LEFT_FRAME_ELEMENT() {
        return DriverManager.findElementByXPATH(LEFT_FRAME);
    }

    public WebElement MIDDLE_FRAME_ELEMENT() {
        return DriverManager.findElementByXPATH(MIDDLE_FRAME);
    }

    public WebElement RIGHT_FRAME_ELEMENT() {
        return DriverManager.findElementByXPATH(RIGHT_FRAME);
    }

    public WebElement BOTTOM_FRAME_ELEMENT() {
        return DriverManager.findElementByXPATH(BOTTOM_FRAME);
    }

    public WebElement TEXT_ELEMENT() {
        return DriverManager.findElementByXPATH(TEXT);
    }

    public WebElement MIDDLE_TEXT_ELEMENT() {
        return DriverManager.findElementByXPATH(MIDDLE_TEXT);
    }

    public NestedFramesPageFunctions nestedFramesPageFunctions() {
        return nestedFramesPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }
}
