import org.testng.annotations.Test;
import pages.disappearing_elements_page.DisappearingElementsPage;

import java.util.Arrays;
import java.util.List;

public class TC006VerifyingThatHiddenItemCanBeShownAfterPollingThePageTest extends BaseTestClass {

    DisappearingElementsPage disappearingElementsPage = DisappearingElementsPage.getDisappearingElementsPage();

    @Test
    public void VerifyingThatHiddenItemCanBeShownAfterPollingThePageTest() {
        homePage.homePageFunctions()
                .clickOnLink("Disappearing Elements");
        List<String> BUTTON_NAMES = Arrays.asList("Home", "About", "Contact Us", "Portfolio", "Gallery");

        disappearingElementsPage
                .assertions()
                .theElementTextEquals(disappearingElementsPage.HEADER_PAGE_ELEMENT(), "Disappearing Elements")
                .theElementTextEquals(disappearingElementsPage.BODY_TEXT_ELEMENT(), "This example demonstrates when elements on a page change " +
                        "by disappearing/reappearing on each page load.")
                .theElementsAreDisplayed(disappearingElementsPage.BUTTON_ELEMENTS())
                .theElementsInListEqual(disappearingElementsPage.BUTTON_ELEMENTS(), BUTTON_NAMES);

        disappearingElementsPage
                .assertions()
                .thePollingCondition(() -> disappearingElementsPage.BUTTON_ELEMENTS().size() == 5)
                .theElementIsDisplayed(disappearingElementsPage.HIDDEN_BUTTON_ELEMENT())
                .thePollingCondition(() -> disappearingElementsPage.BUTTON_ELEMENTS().size() == 4)
                .theElementIsNotDisplayed(disappearingElementsPage.HIDDEN_BUTTON_XPATH());
    }
}
