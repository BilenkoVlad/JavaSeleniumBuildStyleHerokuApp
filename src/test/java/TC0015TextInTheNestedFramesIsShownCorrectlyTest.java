import org.testng.annotations.Test;
import pages.frames_page.FramesPage;
import pages.frames_page.nested_frames_page.NestedFramesPage;
import utils.browser_manager.DriverManager;

import java.util.Arrays;
import java.util.List;

public class TC0015TextInTheNestedFramesIsShownCorrectlyTest extends BaseTestClass {
    FramesPage framesPage = FramesPage.getFramesPage();
    NestedFramesPage nestedFramesPage = NestedFramesPage.getNestedFramesPage();

    @Test
    public void TextInTheNestedFramesIsShownCorrectlyTest() {
        homePage.homePageFunctions()
                .clickOnLink("Frames");
        List<String> linksNames = Arrays.asList("Nested Frames", "iFrame");

        framesPage
                .assertions()
                .thePageURLContains("frames")
                .theElementTextEquals(framesPage.HEADERS_PAGE_ELEMENTS(), "Frames")
                .theElementsInListEqual(framesPage.LINKS_ELEMENTS(), linksNames);

        framesPage
                .framesPageFunctions()
                .clickOnNestedFramesLink();


        DriverManager.switchToFrame(nestedFramesPage.MIDDLE_FRAME_SET_ELEMENT());
        DriverManager.switchToFrame(nestedFramesPage.LEFT_FRAME_ELEMENT());

        nestedFramesPage
                .assertions()
                .theElementTextEquals(nestedFramesPage.TEXT_ELEMENT(), "LEFT");

        DriverManager.switchToDefaultContent();

        DriverManager.switchToFrame(nestedFramesPage.MIDDLE_FRAME_SET_ELEMENT());
        DriverManager.switchToFrame(nestedFramesPage.MIDDLE_FRAME_ELEMENT());

        nestedFramesPage
                .assertions()
                .theElementTextEquals(nestedFramesPage.MIDDLE_TEXT_ELEMENT(), "MIDDLE");

        DriverManager.switchToDefaultContent();

        DriverManager.switchToFrame(nestedFramesPage.MIDDLE_FRAME_SET_ELEMENT());
        DriverManager.switchToFrame(nestedFramesPage.RIGHT_FRAME_ELEMENT());

        nestedFramesPage
                .assertions()
                .theElementTextEquals(nestedFramesPage.TEXT_ELEMENT(), "RIGHT");

        DriverManager.switchToDefaultContent();

        DriverManager.switchToFrame(nestedFramesPage.BOTTOM_FRAME_ELEMENT());

        nestedFramesPage
                .assertions()
                .theElementTextEquals(nestedFramesPage.TEXT_ELEMENT(), "BOTTOM");

        DriverManager.switchToDefaultContent();
    }
}
