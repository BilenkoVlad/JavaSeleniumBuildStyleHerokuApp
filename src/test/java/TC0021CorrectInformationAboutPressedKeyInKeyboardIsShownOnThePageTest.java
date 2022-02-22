import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.key_presses_page.KeyPressesPage;

public class TC0021CorrectInformationAboutPressedKeyInKeyboardIsShownOnThePageTest extends BaseTestClass {
    KeyPressesPage keyPressesPage = KeyPressesPage.getKeyPressesPage();

    @Test
    public void CorrectInformationAboutPressedKeyInKeyboardIsShownOnThePageTest() {
        homePage.homePageFunctions()
                .clickOnLink("Key Presses");

        keyPressesPage
                .assertions()
                .thePageURLContains("key_presses");

        keyPressesPage
                .keyPressesPageFunctions()
                .sendKeysToField(keyPressesPage.INPUT_FIELD_ELEMENT(), Keys.ARROW_UP);

        keyPressesPage
                .assertions()
                .theElementIsDisplayed(keyPressesPage.RESULT_TEXT_ELEMENT())
                .theElementTextEquals(keyPressesPage.RESULT_TEXT_ELEMENT(), "You entered: UP");

        keyPressesPage
                .keyPressesPageFunctions()
                .sendKeysToField(keyPressesPage.INPUT_FIELD_ELEMENT(), Keys.ARROW_DOWN);

        keyPressesPage
                .assertions()
                .theElementIsDisplayed(keyPressesPage.RESULT_TEXT_ELEMENT())
                .theElementTextEquals(keyPressesPage.RESULT_TEXT_ELEMENT(), "You entered: DOWN");

        keyPressesPage
                .keyPressesPageFunctions()
                .sendKeysToField(keyPressesPage.INPUT_FIELD_ELEMENT(), Keys.ARROW_LEFT);

        keyPressesPage
                .assertions()
                .theElementIsDisplayed(keyPressesPage.RESULT_TEXT_ELEMENT())
                .theElementTextEquals(keyPressesPage.RESULT_TEXT_ELEMENT(), "You entered: LEFT");

        keyPressesPage
                .keyPressesPageFunctions()
                .sendKeysToField(keyPressesPage.INPUT_FIELD_ELEMENT(), Keys.ARROW_RIGHT);

        keyPressesPage
                .assertions()
                .theElementIsDisplayed(keyPressesPage.RESULT_TEXT_ELEMENT())
                .theElementTextEquals(keyPressesPage.RESULT_TEXT_ELEMENT(), "You entered: RIGHT");

        keyPressesPage
                .keyPressesPageFunctions()
                .sendKeysToField(keyPressesPage.INPUT_FIELD_ELEMENT(), Keys.CONTROL);

        keyPressesPage
                .assertions()
                .theElementIsDisplayed(keyPressesPage.RESULT_TEXT_ELEMENT())
                .theElementTextEquals(keyPressesPage.RESULT_TEXT_ELEMENT(), "You entered: CONTROL");

        keyPressesPage
                .keyPressesPageFunctions()
                .sendKeysToField(keyPressesPage.INPUT_FIELD_ELEMENT(), Keys.SHIFT);

        keyPressesPage
                .assertions()
                .theElementIsDisplayed(keyPressesPage.RESULT_TEXT_ELEMENT())
                .theElementTextEquals(keyPressesPage.RESULT_TEXT_ELEMENT(), "You entered: SHIFT");

        keyPressesPage
                .keyPressesPageFunctions()
                .sendKeysToField(keyPressesPage.INPUT_FIELD_ELEMENT(), Keys.TAB);

        keyPressesPage
                .assertions()
                .theElementIsDisplayed(keyPressesPage.RESULT_TEXT_ELEMENT())
                .theElementTextEquals(keyPressesPage.RESULT_TEXT_ELEMENT(), "You entered: TAB");

        keyPressesPage
                .keyPressesPageFunctions()
                .sendKeysToField(keyPressesPage.INPUT_FIELD_ELEMENT(), Keys.ESCAPE);

        keyPressesPage
                .assertions()
                .theElementIsDisplayed(keyPressesPage.RESULT_TEXT_ELEMENT())
                .theElementTextEquals(keyPressesPage.RESULT_TEXT_ELEMENT(), "You entered: ESCAPE");

        keyPressesPage
                .keyPressesPageFunctions()
                .sendKeysToField(keyPressesPage.INPUT_FIELD_ELEMENT(), "a");

        keyPressesPage
                .assertions()
                .theElementIsDisplayed(keyPressesPage.RESULT_TEXT_ELEMENT())
                .theElementTextEquals(keyPressesPage.RESULT_TEXT_ELEMENT(), "You entered: A");

        keyPressesPage
                .keyPressesPageFunctions()
                .sendKeysToField(keyPressesPage.INPUT_FIELD_ELEMENT(), "q");

        keyPressesPage
                .assertions()
                .theElementIsDisplayed(keyPressesPage.RESULT_TEXT_ELEMENT())
                .theElementTextEquals(keyPressesPage.RESULT_TEXT_ELEMENT(), "You entered: Q");

        keyPressesPage
                .keyPressesPageFunctions()
                .sendKeysToField(keyPressesPage.INPUT_FIELD_ELEMENT(), "c");

        keyPressesPage
                .assertions()
                .theElementIsDisplayed(keyPressesPage.RESULT_TEXT_ELEMENT())
                .theElementTextEquals(keyPressesPage.RESULT_TEXT_ELEMENT(), "You entered: C");

        keyPressesPage
                .keyPressesPageFunctions()
                .sendKeysToField(keyPressesPage.INPUT_FIELD_ELEMENT(), ",");

        keyPressesPage
                .assertions()
                .theElementIsDisplayed(keyPressesPage.RESULT_TEXT_ELEMENT())
                .theElementTextEquals(keyPressesPage.RESULT_TEXT_ELEMENT(), "You entered: COMMA");

        keyPressesPage
                .keyPressesPageFunctions()
                .sendKeysToField(keyPressesPage.INPUT_FIELD_ELEMENT(), "/");

        keyPressesPage
                .assertions()
                .theElementIsDisplayed(keyPressesPage.RESULT_TEXT_ELEMENT())
                .theElementTextEquals(keyPressesPage.RESULT_TEXT_ELEMENT(), "You entered: SLASH");

        keyPressesPage
                .keyPressesPageFunctions()
                .sendKeysToField(keyPressesPage.INPUT_FIELD_ELEMENT(), "[");

        keyPressesPage
                .assertions()
                .theElementIsDisplayed(keyPressesPage.RESULT_TEXT_ELEMENT())
                .theElementTextEquals(keyPressesPage.RESULT_TEXT_ELEMENT(), "You entered: OPEN_BRACKET");
    }

    @Test
    public void CorrectInformationAboutPressedKeyInKeyboardIsShownOnThePageWithoutAssertionTest() {
        homePage.homePageFunctions()
                .clickOnLink("Key Presses");

        keyPressesPage
                .keyPressesPageFunctions()
                .sendKeysToField(keyPressesPage.INPUT_FIELD_ELEMENT(), Keys.ARROW_UP)
                .sendKeysToField(keyPressesPage.INPUT_FIELD_ELEMENT(), Keys.ARROW_DOWN)
                .sendKeysToField(keyPressesPage.INPUT_FIELD_ELEMENT(), Keys.ARROW_LEFT)
                .sendKeysToField(keyPressesPage.INPUT_FIELD_ELEMENT(), Keys.ARROW_RIGHT)
                .sendKeysToField(keyPressesPage.INPUT_FIELD_ELEMENT(), Keys.CONTROL)
                .sendKeysToField(keyPressesPage.INPUT_FIELD_ELEMENT(), Keys.SHIFT)
                .sendKeysToField(keyPressesPage.INPUT_FIELD_ELEMENT(), Keys.TAB)
                .sendKeysToField(keyPressesPage.INPUT_FIELD_ELEMENT(), Keys.ESCAPE)
                .sendKeysToField(keyPressesPage.INPUT_FIELD_ELEMENT(), "a")
                .sendKeysToField(keyPressesPage.INPUT_FIELD_ELEMENT(), "q")
                .sendKeysToField(keyPressesPage.INPUT_FIELD_ELEMENT(), "c")
                .sendKeysToField(keyPressesPage.INPUT_FIELD_ELEMENT(), ",")
                .sendKeysToField(keyPressesPage.INPUT_FIELD_ELEMENT(), "/")
                .sendKeysToField(keyPressesPage.INPUT_FIELD_ELEMENT(), "[");
    }
}
