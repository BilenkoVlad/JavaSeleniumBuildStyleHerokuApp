import org.testng.annotations.Test;
import pages.dropdown_page.DropdownPage;
import utils.browser_manager.DriverManager;

import java.util.Arrays;
import java.util.List;

public class TC008UserIsAbleToSelectValueFromDropdownListTest extends BaseTestClass {

    DropdownPage dropdownPage = DropdownPage.getDropdownPage();

    @Test
    public void UserIsAbleToSelectValueFromDropdownListTest() {
        homePage.homePageFunctions()
                .clickOnLink("Dropdown");
        List<String> expectedOptions = Arrays.asList("Please select an option", "Option 1", "Option 2");

        dropdownPage
                .assertions()
                .thePageURLContains("dropdown")
                .theElementTextEquals(dropdownPage.HEADER_PAGE_ELEMENT(), "Dropdown List")
                .theElementIsDisplayed(dropdownPage.DROPDOWN_ELEMENT())
                .theElementsInListEqual(dropdownPage.DROPDOWN_SELECT().getOptions(), expectedOptions);

        dropdownPage
                .dropdownPageFunctions()
                .selectByVisibleText(dropdownPage.DROPDOWN_ELEMENT(), "Option 1");

        dropdownPage
                .assertions()
                .theElementTextEquals(dropdownPage.DROPDOWN_SELECT().getFirstSelectedOption(), "Option 1");

        dropdownPage
                .dropdownPageFunctions()
                .selectByVisibleText(dropdownPage.DROPDOWN_ELEMENT(), "Option 2");

        dropdownPage
                .assertions()
                .theElementTextEquals(dropdownPage.DROPDOWN_SELECT().getFirstSelectedOption(), "Option 2");

        DriverManager.refreshPage();

        dropdownPage
                .assertions()
                .theElementTextEquals(dropdownPage.HEADER_PAGE_ELEMENT(), "Dropdown List")
                .theElementIsDisplayed(dropdownPage.DROPDOWN_ELEMENT())
                .theElementsInListEqual(dropdownPage.DROPDOWN_SELECT().getOptions(), expectedOptions);
    }
}
