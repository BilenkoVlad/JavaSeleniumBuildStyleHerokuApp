import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.inputs_page.InputsPage;

public class TC0018UserIsAbleToEnterNumberInTheFieldTest extends BaseTestClass {
    InputsPage inputsPage = InputsPage.getInputsPage();

    @Test
    public void UserIsAbleToEnterNumberInTheFieldViaKeyboard() {
        homePage.homePageFunctions()
                .clickOnLink("Inputs");

        inputsPage
                .assertions()
                .thePageURLContains("inputs")
                .theElementTextEquals(inputsPage.HEADERS_PAGE_ELEMENT(), "Inputs")
                .theElementTextEquals(inputsPage.BODY_TEXT_ELEMENT(), "Number")
                .theTextEquals(inputsPage.INPUT_FIELD_ELEMENT().getAttribute("type"), "number")
                .theElementIsDisplayed(inputsPage.INPUT_FIELD_ELEMENT())
                .theElementIsEnabled(inputsPage.INPUT_FIELD_ELEMENT());

        inputsPage
                .inputsPageFunctions()
                .sendKeysToInputField("any test chars")
                .clearInputField()
                .sendKeysToInputField("eee")
                .clearInputField()
                .sendKeysToInputField("123")
                .clearInputField()
                .sendKeysToInputField("4561e4641")
                .clearInputField();

        inputsPage
                .inputsPageFunctions()
                .clickOnInputField();

        for (int i = 0; i < 50; i++) {
            inputsPage
                    .inputsPageFunctions()
                    .sendKeysToInputField(Keys.ARROW_UP);
        }

        inputsPage
                .inputsPageFunctions()
                .clearInputField();

        for (int i = 0; i < 50; i++) {
            inputsPage
                    .inputsPageFunctions()
                    .sendKeysToInputField(Keys.ARROW_DOWN);
        }
    }
}
