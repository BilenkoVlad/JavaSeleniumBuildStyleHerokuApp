import org.testng.annotations.Test;
import pages.horizontal_slider_page.HorizontalSliderPage;

public class TC0016HorizontalSliderWorksCorrectlyViaMouseAndKeyboardTest extends BaseTestClass {
    HorizontalSliderPage horizontalSliderPage = HorizontalSliderPage.getHorizontalSliderPage();

    @Test
    public void HorizontalSliderWorksCorrectlyViaMouseTest() {
        homePage.homePageFunctions()
                .clickOnLink("Horizontal Slider");

        horizontalSliderPage
                .assertions()
                .thePageURLContains("horizontal_slider")
                .theElementTextEquals(horizontalSliderPage.HEADER_TEXT_ELEMENT(), "Horizontal Slider")
                .theElementTextEquals(horizontalSliderPage.BODY_TEXT_ELEMENT(), "Set the focus on the slider (by clicking on it) and use the" +
                        " arrow keys to move it right and left. Or click and drag the slider with your mouse. It will " +
                        "indicate the value of the slider to the right.")
                .theElementIsDisplayed(horizontalSliderPage.SLIDER_ELEMENT())
                .theElementIsEnabled(horizontalSliderPage.SLIDER_ELEMENT())
                .theElementTextEquals(horizontalSliderPage.RANGE_NUMBER_ELEMENT(), "0");

        horizontalSliderPage
                .horizontalSliderPageFunctions()
                .moveSliderUpByMouseWithAssertion()
                .moveSliderDownByMouseWithAssertion();
    }

    @Test
    public void HorizontalSliderWorksCorrectlyViaKeyboardTest() {
        homePage.homePageFunctions()
                .clickOnLink("Horizontal Slider");

        horizontalSliderPage
                .assertions()
                .thePageURLContains("horizontal_slider")
                .theElementTextEquals(horizontalSliderPage.HEADER_TEXT_ELEMENT(), "Horizontal Slider")
                .theElementTextEquals(horizontalSliderPage.BODY_TEXT_ELEMENT(), "Set the focus on the slider (by clicking on it) and use the" +
                        " arrow keys to move it right and left. Or click and drag the slider with your mouse. It will " +
                        "indicate the value of the slider to the right.")
                .theElementIsDisplayed(horizontalSliderPage.SLIDER_ELEMENT())
                .theElementIsEnabled(horizontalSliderPage.SLIDER_ELEMENT())
                .theElementTextEquals(horizontalSliderPage.RANGE_NUMBER_ELEMENT(), "0");

        horizontalSliderPage
                .horizontalSliderPageFunctions()
                .moveSliderUpByKeyboardWithAssertion()
                .moveSliderDownByKeyboardWithAssertion();
    }

    @Test
    public void HorizontalSliderWorksCorrectlyTest() {
        homePage.homePageFunctions()
                .clickOnLink("Horizontal Slider");

        horizontalSliderPage
                .horizontalSliderPageFunctions()
                .moveSliderUpByMouseWithAssertion()
                .moveSliderDownByMouseWithAssertion()
                .moveSliderUpByKeyboardWithAssertion()
                .moveSliderDownByKeyboardWithAssertion();
    }
}
