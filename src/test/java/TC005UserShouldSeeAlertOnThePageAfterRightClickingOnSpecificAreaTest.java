import org.testng.annotations.Test;
import pages.context_menu_page.ContextMenuPage;
import utils.browser_manager.DriverManager;

public class TC005UserShouldSeeAlertOnThePageAfterRightClickingOnSpecificAreaTest extends BaseTestClass {
    ContextMenuPage contextMenuPage = ContextMenuPage.getContextMenuPage();

    @Test
    public void UserShouldSeeAlertOnThePageAfterRightClickingOnSpecificAreaTest() {
        homePage.homePageFunctions()
                .clickOnLink("Context Menu");

        contextMenuPage
                .assertions()
                .thePageURLContains("context_menu")
                .theElementTextEquals(contextMenuPage.HEADER_PAGE_ELEMENT(), "Context Menu")
                .theElementTextEquals(contextMenuPage.BODY_TEXT_ELEMENTS().get(0), "Context menu items are custom " +
                        "additions that appear in the right-click menu.")
                .theElementTextEquals(contextMenuPage.BODY_TEXT_ELEMENTS().get(1), "Right-click in the box below to see " +
                        "one called 'the-internet'. When you click it, it will trigger a JavaScript alert.")
                .theElementIsDisplayed(contextMenuPage.CONTEXT_BOX_ELEMENT());

        contextMenuPage
                .contextMenuPageFunctions()
                .leftClickOnContextBox();

        contextMenuPage
                .assertions()
                .theAlertIsNotPresented();

        contextMenuPage
                .contextMenuPageFunctions()
                .clickOnHeader();

        contextMenuPage
                .assertions()
                .theAlertIsNotPresented();

        contextMenuPage
                .contextMenuPageFunctions()
                .rightClickOnContextBox();

        contextMenuPage
                .assertions()
                .theAlertIsPresented()
                .theAlertTextEquals("You selected a context menu");

        DriverManager.acceptAlert();

        contextMenuPage
                .assertions()
                .theAlertIsNotPresented();
    }

    @Test
    public void UserShouldSeeAlertOnThePageAfterRightClickingOnSpecificAreaWithoutAssertionTest() {
        homePage.homePageFunctions()
                .clickOnLink("Context Menu");

        contextMenuPage
                .contextMenuPageFunctions()
                .leftClickOnContextBox()
                .clickOnHeader()
                .rightClickOnContextBox();

        DriverManager.acceptAlert();
    }
}
