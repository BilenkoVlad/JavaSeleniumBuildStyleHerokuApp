package pages.horizontal_slider_page;

import org.openqa.selenium.WebElement;
import pages.Assertions;
import utils.browser_manager.DriverManager;

public class HorizontalSliderPage extends HorizontalSliderPageFunctions {

    private final HorizontalSliderPageFunctions horizontalSliderPageFunctions;
    private final Assertions assertions;

    private HorizontalSliderPage(HorizontalSliderPageFunctions horizontalSliderPageFunctions, Assertions assertions) {
        this.horizontalSliderPageFunctions = horizontalSliderPageFunctions;
        this.assertions = assertions;
    }

    public static HorizontalSliderPage getHorizontalSliderPage() {
        return new HorizontalSliderPage(
                new HorizontalSliderPageFunctions(),
                new Assertions()
        );
    }

    public WebElement HEADER_TEXT_ELEMENT() {
        return DriverManager.findElementByXPATH(HEADER_TEXT);
    }

    public WebElement SLIDER_ELEMENT() {
        return DriverManager.findElementByXPATH(SLIDER);
    }

    public WebElement RANGE_NUMBER_ELEMENT() {
        return DriverManager.findElementByXPATH(RANGE_NUMBER);
    }

    public WebElement BODY_TEXT_ELEMENT() {
        return DriverManager.findElementByXPATH(BODY_TEXT);
    }

    public HorizontalSliderPageFunctions horizontalSliderPageFunctions() {
        return horizontalSliderPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }

}
