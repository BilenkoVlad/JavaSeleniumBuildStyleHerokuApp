package pages.horizontal_slider_page;

import pages.Assertions;

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

    public String headerPageXPATH() {
        return HEADER_TEXT;
    }

    public String sliderXPATH() {
        return SLIDER;
    }

    public String rangeNumberXPATH() {
        return RANGE_NUMBER;
    }


    public String bodyTextXPATH() {
        return BODY_TEXT;
    }

    public HorizontalSliderPageFunctions horizontalSliderPageFunctions() {
        return horizontalSliderPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }

}
