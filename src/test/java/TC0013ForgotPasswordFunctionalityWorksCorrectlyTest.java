import org.testng.annotations.Test;
import pages.forgot_password_page.ForgotPasswordPage;
import utils.generator.Generator;

public class TC0013ForgotPasswordFunctionalityWorksCorrectlyTest extends BaseTestClass {
    ForgotPasswordPage forgotPasswordPage = ForgotPasswordPage.getForgotPasswordPage();

    @Test
    public void ForgotPasswordFunctionalityWorksCorrectlyTest() {
        homePage.homePageFunctions()
                .clickOnLink("Forgot Password");

        String email = Generator.emailGenerator();

        forgotPasswordPage
                .assertions()
                .thePageURLContains("forgot_password")
                .theElementTextEquals(forgotPasswordPage.HEADERS_PAGE_ELEMENT(), "Forgot Password")
                .theElementTextEquals(forgotPasswordPage.FIELD_LABEL_ELEMENT(), "E-mail")
                .theElementTextEquals(forgotPasswordPage.BUTTON_NAME_ELEMENT(), "Retrieve password")
                .theElementIsDisplayed(forgotPasswordPage.EMAIL_FIELD_ELEMENT())
                .theElementIsDisplayed(forgotPasswordPage.RETRIEVE_PASSWORD_BUTTON_ELEMENT())
                .theElementIsEnabled(forgotPasswordPage.EMAIL_FIELD_ELEMENT())
                .theElementIsEnabled(forgotPasswordPage.RETRIEVE_PASSWORD_BUTTON_ELEMENT());

        forgotPasswordPage
                .forgotPasswordPageFunctions()
                .sendKeysToEmailField(email)
                .clickOnRetrievePasswordButton();
    }
}
