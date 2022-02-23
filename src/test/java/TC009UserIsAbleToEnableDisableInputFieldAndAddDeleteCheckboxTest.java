import org.testng.annotations.Test;
import pages.dynamic_controls_page.DynamicControlsPage;

import java.util.Arrays;
import java.util.List;

public class TC009UserIsAbleToEnableDisableInputFieldAndAddDeleteCheckboxTest extends BaseTestClass {
    DynamicControlsPage dynamicControlsPage = DynamicControlsPage.getDynamicControlsPage();

    @Test
    public void UserIsAbleToEnableDisableInputFieldAndAddDeleteCheckboxTest() {
        homePage.homePageFunctions()
                .clickOnLink("Dynamic Controls");
        List<String> expectedHeaders = Arrays.asList("Dynamic Controls", "Remove/add", "Enable/disable");

        dynamicControlsPage
                .assertions()
                .thePageURLContains("dynamic_controls")
                .theElementsInListEqual(dynamicControlsPage.HEADER_PAGE_ELEMENTS(), expectedHeaders)
                .theElementTextEquals(dynamicControlsPage.BODY_TEXT_ELEMENT(), "This example demonstrates when elements " +
                        "(e.g., checkbox, input field, etc.) are changed asynchronously.")
                .theElementIsUnselected(dynamicControlsPage.CHECKBOX_ELEMENT())
                .theElementIsEnabled(dynamicControlsPage.REMOVE_BUTTON_ELEMENT())
                .theElementIsDisplayed(dynamicControlsPage.REMOVE_BUTTON_ELEMENT())
                .theElementIsEnabled(dynamicControlsPage.ENABLE_BUTTON_ELEMENT())
                .theElementIsDisplayed(dynamicControlsPage.ENABLE_BUTTON_ELEMENT())
                .theElementIsDisabled(dynamicControlsPage.TEXT_FIELD_ELEMENT());

        dynamicControlsPage
                .dynamicControlsPageFunctions()
                .clickOnCheckbox();

        dynamicControlsPage
                .assertions()
                .theElementIsSelected(dynamicControlsPage.CHECKBOX_ELEMENT());

        dynamicControlsPage
                .dynamicControlsPageFunctions()
                .clickOnRemoveButton();

        dynamicControlsPage
                .assertions()
                .theElementIsDisplayed(dynamicControlsPage.CHECKBOX_LOADING_ELEMENTS().get(0))
                .theElementIsDisplayedWithCondition(dynamicControlsPage.MESSAGE_ELEMENT(), dynamicControlsPage.MESSAGE_XPATH())
                .theElementTextEquals(dynamicControlsPage.MESSAGE_ELEMENT(), "It's gone!")
                .theElementIsNotDisplayed(dynamicControlsPage.CHECKBOX_XPATH())
                .theElementIsEnabled(dynamicControlsPage.ADD_BUTTON_ELEMENT())
                .theElementIsDisplayed(dynamicControlsPage.ADD_BUTTON_ELEMENT());

        dynamicControlsPage
                .dynamicControlsPageFunctions()
                .clickOnAddButton();

        dynamicControlsPage
                .assertions()
                .theElementIsDisplayed(dynamicControlsPage.CHECKBOX_LOADING_ELEMENTS().get(0))
                .theElementIsDisplayedWithCondition(dynamicControlsPage.MESSAGE_ELEMENT(), dynamicControlsPage.MESSAGE_XPATH())
                .theElementTextEquals(dynamicControlsPage.MESSAGE_ELEMENT(), "It's back!")
                .theElementIsDisplayed(dynamicControlsPage.CHECKBOX_ELEMENT())
                .theElementIsUnselected(dynamicControlsPage.CHECKBOX_ELEMENT());

        dynamicControlsPage
                .dynamicControlsPageFunctions()
                .clickOnEnableButton();

        dynamicControlsPage
                .assertions()
                .theElementIsDisplayed(dynamicControlsPage.INPUT_LOADING_ELEMENT())
                .theElementIsDisplayedWithCondition(dynamicControlsPage.MESSAGE_ELEMENT(), dynamicControlsPage.MESSAGE_XPATH())
                .theElementTextEquals(dynamicControlsPage.MESSAGE_ELEMENT(), "It's enabled!")
                .theElementIsEnabled(dynamicControlsPage.TEXT_FIELD_ELEMENT())
                .theElementIsEnabled(dynamicControlsPage.DISABLE_BUTTON_ELEMENT())
                .theElementIsDisplayed(dynamicControlsPage.DISABLE_BUTTON_ELEMENT());

        dynamicControlsPage
                .dynamicControlsPageFunctions()
                .sendKeysToTextField("Test text is automatically added")
                .clickOnDisableButton();

        dynamicControlsPage
                .assertions()
                .theElementIsDisplayed(dynamicControlsPage.INPUT_LOADING_ELEMENT())
                .theElementIsDisplayedWithCondition(dynamicControlsPage.MESSAGE_ELEMENT(), dynamicControlsPage.MESSAGE_XPATH())
                .theElementTextEquals(dynamicControlsPage.MESSAGE_ELEMENT(), "It's disabled!")
                .theElementIsDisabled(dynamicControlsPage.TEXT_FIELD_ELEMENT())
                .theElementIsEnabled(dynamicControlsPage.ENABLE_BUTTON_ELEMENT())
                .theElementIsDisplayed(dynamicControlsPage.ENABLE_BUTTON_ELEMENT())
                .theTextEquals(dynamicControlsPage.TEXT_FIELD_ELEMENT().getAttribute("value").replace("\uE000", ""), "Test text is automatically added");
    }
}
