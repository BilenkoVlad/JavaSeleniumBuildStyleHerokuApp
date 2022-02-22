import org.testng.annotations.Test;
import pages.checkboxes_page.CheckboxesPage;
import utils.browser_manager.DriverManager;

public class TC004UserIsAbleToCheckAndUncheckCheckboxesTest extends BaseTestClass {

    CheckboxesPage checkboxesPage = CheckboxesPage.getCheckboxesPage();

    @Test
    public void UserIsAbleToCheckAndUncheckCheckboxesTest() {
        homePage.homePageFunctions()
                .clickOnLink("Checkboxes");

        checkboxesPage
                .assertions()
                .thePageURLContains("checkboxes")
                .theElementTextEquals(checkboxesPage.HEADER_PAGE_ELEMENT(), "Checkboxes")
                .theElementIsUnselected(checkboxesPage.CHECKBOX_ELEMENTS().get(0))
                .theElementIsSelected(checkboxesPage.CHECKBOX_ELEMENTS().get(1));

        checkboxesPage
                .checkboxesPageFunctions()
                .selectFirstCheckbox();

        checkboxesPage
                .assertions()
                .theElementIsSelected(checkboxesPage.CHECKBOX_ELEMENTS().get(0));

        checkboxesPage
                .checkboxesPageFunctions()
                .selectFirstCheckbox()
                .selectSecondCheckbox();

        checkboxesPage
                .assertions()
                .theElementIsUnselected(checkboxesPage.CHECKBOX_ELEMENTS().get(0))
                .theElementIsUnselected(checkboxesPage.CHECKBOX_ELEMENTS().get(1));

        checkboxesPage
                .checkboxesPageFunctions()
                .selectFirstCheckbox();

        checkboxesPage
                .assertions()
                .theElementIsSelected(checkboxesPage.CHECKBOX_ELEMENTS().get(0));

        DriverManager.refreshPage();

        checkboxesPage
                .assertions()
                .thePageURLContains("checkboxes")
                .theElementTextEquals(checkboxesPage.HEADER_PAGE_ELEMENT(), "Checkboxes")
                .theElementIsUnselected(checkboxesPage.CHECKBOX_ELEMENTS().get(0))
                .theElementIsSelected(checkboxesPage.CHECKBOX_ELEMENTS().get(1));
    }

    @Test
    public void UserIsAbleToCheckAndUncheckCheckboxesWithoutAssertionTest() {
        homePage.homePageFunctions()
                .clickOnLink("Checkboxes");

        checkboxesPage
                .checkboxesPageFunctions()
                .selectFirstCheckbox()
                .selectFirstCheckbox()
                .selectSecondCheckbox()
                .selectFirstCheckbox();
    }
}
