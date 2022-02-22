import org.testng.annotations.Test;
import pages.entry_ad_page.EntryAdPage;

import java.util.Arrays;
import java.util.List;

public class TC0011UserIsAbleToSeeModalWindowAndCanCloseItTest extends BaseTestClass {
    EntryAdPage entryAdPage = EntryAdPage.getEntryAdPage();

    @Test
    public void UserIsAbleToSeeModalWindowAndCanCloseItTest() {
        homePage.homePageFunctions()
                .clickOnLink("Entry Ad");
        List<String> text = Arrays.asList("Displays an ad on page load.", "If closed, it will not appear " +
                "on subsequent page loads.", "To re-enable it, click here.");

        entryAdPage
                .assertions()
                .thePageURLContains("entry_ad")
                .theElementIsDisplayedWithCondition(entryAdPage.MODAL_WINDOW_ELEMENT(), entryAdPage.MODAL_WINDOW_XPATH())
                .theElementTextEquals(entryAdPage.TITLE_ELEMENT(), "This is a modal window".toUpperCase())
                .theElementTextEquals(entryAdPage.TEXT_ELEMENT(), "It's commonly used to encourage a user to take an action " +
                        "(e.g., give their e-mail address to sign up for something or disable their ad blocker).")
                .theElementTextEquals(entryAdPage.CLOSE_BUTTON_ELEMENT(), "Close");

        entryAdPage
                .entryAdPageFunctions()
                .clickCloseButton();

        entryAdPage
                .assertions()
                .theElementTextEquals(entryAdPage.HEADERS_PAGE_ELEMENT(), "Entry Ad")
                .theElementsInListEqual(entryAdPage.BODY_TEXT_ELEMENT(), text)
                .theElementIsDisplayed(entryAdPage.CLICK_HERE_ELEMENT());

        entryAdPage
                .entryAdPageFunctions()
                .clickOnClickHere();

        entryAdPage
                .assertions()
                .theElementIsDisplayedWithCondition(entryAdPage.MODAL_WINDOW_ELEMENT(), entryAdPage.MODAL_WINDOW_XPATH())
                .theElementTextEquals(entryAdPage.TITLE_ELEMENT(), "This is a modal window".toUpperCase())
                .theElementTextEquals(entryAdPage.TEXT_ELEMENT(), "It's commonly used to encourage a user to take an action " +
                        "(e.g., give their e-mail address to sign up for something or disable their ad blocker).")
                .theElementTextEquals(entryAdPage.CLOSE_BUTTON_ELEMENT(), "Close");

        entryAdPage
                .entryAdPageFunctions()
                .clickCloseButton();
    }
}
