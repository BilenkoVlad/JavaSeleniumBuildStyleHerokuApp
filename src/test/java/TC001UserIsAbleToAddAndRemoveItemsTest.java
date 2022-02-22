import org.testng.annotations.Test;
import pages.add_remove_elements_page.AddRemoveElementsPage;

public class TC001UserIsAbleToAddAndRemoveItemsTest extends BaseTestClass {

    AddRemoveElementsPage addRemoveElementsPage = AddRemoveElementsPage.getAddRemoveElementsPage();

    @Test
    public void UserIsAbleToAddAndRemoveItemsTest() {
        homePage.homePageFunctions()
                .clickOnLink("Add/Remove Elements");

        addRemoveElementsPage
                .assertions()
                .thePageURLContains("add_remove_elements");

        addRemoveElementsPage
                .addRemoveElementsPageFunctions()
                .clickAddButton();

        addRemoveElementsPage
                .assertions()
                .theElementIsDisplayed(addRemoveElementsPage.ADD_BUTTON_ELEMENT());

        addRemoveElementsPage
                .addRemoveElementsPageFunctions()
                .clickDeleteButton();

        addRemoveElementsPage
                .assertions()
                .theElementIsNotDisplayed(addRemoveElementsPage.DELETE_BUTTON_XPATH());

        addRemoveElementsPage
                .addRemoveElementsPageFunctions()
                .clickAddButton10Times();

        addRemoveElementsPage
                .assertions()
                .theElementsAreDisplayed(addRemoveElementsPage.DELETE_BUTTON_ELEMENTS())
                .theListSizeEquals(addRemoveElementsPage.DELETE_BUTTON_ELEMENTS(), 10);

        addRemoveElementsPage
                .addRemoveElementsPageFunctions()
                .clickDeleteButton10Times();

        addRemoveElementsPage
                .assertions()
                .theListSizeEquals(addRemoveElementsPage.DELETE_BUTTON_ELEMENTS(), 0);
    }

    @Test
    public void UserIsAbleToAddAndRemoveItemsWithoutAssertionTest() {
        homePage.homePageFunctions()
                .clickOnLink("Add/Remove Elements");

        addRemoveElementsPage
                .addRemoveElementsPageFunctions()
                .clickAddButton()
                .clickDeleteButton()
                .clickAddButton10Times()
                .clickDeleteButton();
    }
}
