import org.testng.annotations.Test;
import pages.add_remove_elements_page.AddRemoveElementsPage;

public class TC001UserIsAbleToAddAndRemoveItemsTest extends BaseTestClass {

    AddRemoveElementsPage addRemoveElementsPage = AddRemoveElementsPage.getAddRemoveElementsPage();

    @Test
    public void UserIsAbleToAddAndRemoveItemsTest() {
        homePage.homePageFunctions()
                .clickOnLink("Add/Remove Elements");

        addRemoveElementsPage
                .addRemoveElementsPageFunctions()
                .clickAddButton();

        addRemoveElementsPage
                .assertions()
                .theElementIsDisplayed(addRemoveElementsPage.addButtonXPATH());

        addRemoveElementsPage
                .addRemoveElementsPageFunctions()
                .clickDeleteButton();

        addRemoveElementsPage
                .assertions()
                .theElementIsNotDisplayed(addRemoveElementsPage.deleteButtonXPATH());

        addRemoveElementsPage
                .addRemoveElementsPageFunctions()
                .clickAddButton10Times();

        addRemoveElementsPage
                .assertions()
                .theElementsAreDisplayed(addRemoveElementsPage.deleteButtonXPATH())
                .theListSizeEquals(addRemoveElementsPage.deleteButtonXPATH(), 10);

        addRemoveElementsPage
                .addRemoveElementsPageFunctions()
                .clickDeleteButton10Times();

        addRemoveElementsPage
                .assertions()
                .theListSizeEquals(addRemoveElementsPage.deleteButtonXPATH(), 0);
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
