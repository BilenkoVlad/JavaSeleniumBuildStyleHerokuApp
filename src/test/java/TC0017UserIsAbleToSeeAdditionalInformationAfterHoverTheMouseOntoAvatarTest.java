import org.testng.annotations.Test;
import pages.hovers_page.HoversPage;

public class TC0017UserIsAbleToSeeAdditionalInformationAfterHoverTheMouseOntoAvatarTest extends BaseTestClass {
    HoversPage hoversPage = HoversPage.getHoversPage();

    @Test
    public void UserIsAbleToSeeAdditionalInformationAfterHoverTheMouseOntoAvatarTest() {
        homePage.homePageFunctions()
                .clickOnLink("Hovers");

        hoversPage
                .assertions()
                .thePageURLContains("hovers")
                .theElementTextEquals(hoversPage.HEADERS_PAGE_ELEMENT(), "Hovers")
                .theElementTextEquals(hoversPage.BODY_TEXT_ELEMENT(), "Hover over the image for additional information")
                .theElementsAreDisplayed(hoversPage.AVATARS_ELEMENTS());

        hoversPage
                .hoversPageFunctions()
                .hoverOnAvatarsWithAssertion();
    }
}
