import org.testng.annotations.Test;
import pages.form_authentication_page.FormAuthenticationPage;
import pages.form_authentication_page.secure_page.SecurePage;

public class TC0014UserIsAbleToLoginTest extends BaseTestClass {
    FormAuthenticationPage formAuthenticationPage = FormAuthenticationPage.getFormAuthenticationPage();
    SecurePage securePage = SecurePage.getSecurePage();

    @Test
    public void UserIsAbleToLoginTest() {
        homePage.homePageFunctions()
                .clickOnLink("Form Authentication");

        formAuthenticationPage
                .assertions()
                .thePageURLContains("login")
                .theElementTextEquals(formAuthenticationPage.HEADERS_PAGE_ELEMENT(), "Login Page")
                .theElementTextEquals(formAuthenticationPage.BODY_TEXT_ELEMENT(), "This is where you can log into the secure area. Enter tomsmith" +
                        " for the username and SuperSecretPassword! for the password. If the information is wrong you should " +
                        "see error messages.")
                .theElementTextEquals(formAuthenticationPage.USERNAME_LABEL_ELEMENT(), "Username")
                .theElementIsDisplayed(formAuthenticationPage.USERNAME_FIELD_ELEMENT())
                .theElementIsEnabled(formAuthenticationPage.USERNAME_FIELD_ELEMENT())
                .theElementTextEquals(formAuthenticationPage.LOGIN_BUTTON_ELEMENT(), "Login")
                .theElementIsDisplayed(formAuthenticationPage.LOGIN_BUTTON_ELEMENT())
                .theElementIsEnabled(formAuthenticationPage.LOGIN_BUTTON_ELEMENT())
                .theElementTextEquals(formAuthenticationPage.PASSWORD_LABEL_ELEMENT(), "Password")
                .theElementIsDisplayed(formAuthenticationPage.PASSWORD_FIELD_ELEMENT())
                .theElementIsEnabled(formAuthenticationPage.PASSWORD_FIELD_ELEMENT());

        formAuthenticationPage
                .formAuthenticationPageFunctions()
                .sendKeysToField(formAuthenticationPage.USERNAME_FIELD_ELEMENT(), "invalidUsername")
                .sendKeysToField(formAuthenticationPage.PASSWORD_FIELD_ELEMENT(), "invalidPassword")
                .clickLoginButton();

        formAuthenticationPage
                .assertions()
                .theElementIsDisplayed(formAuthenticationPage.ALERT_ELEMENT())
                .theElementTextEquals(formAuthenticationPage.ALERT_ELEMENT(), "Your username is invalid!\n×");

        formAuthenticationPage
                .formAuthenticationPageFunctions()
                .sendKeysToField(formAuthenticationPage.USERNAME_FIELD_ELEMENT(), formAuthenticationPage.CREDENTIALS_ELEMENTS().get(0).getText())
                .sendKeysToField(formAuthenticationPage.PASSWORD_FIELD_ELEMENT(), formAuthenticationPage.CREDENTIALS_ELEMENTS().get(1).getText())
                .clickLoginButton();

        securePage
                .assertions()
                .theElementIsDisplayed(securePage.ALERT_ELEMENT())
                .theElementTextEquals(securePage.ALERT_ELEMENT(), "You logged into a secure area!\n×")
                .theElementTextEquals(securePage.HEADERS_PAGE_ELEMENT(), "Secure Area")
                .theElementTextEquals(securePage.BODY_TEXT_ELEMENT(), "Welcome to the Secure Area. When you are done click logout below.")
                .theElementTextEquals(securePage.LOGOUT_BUTTON_LABEL_ELEMENT(), "Logout")
                .theElementIsDisplayed(securePage.LOGOUT_BUTTON_ELEMENT())
                .theElementIsEnabled(securePage.LOGOUT_BUTTON_ELEMENT());

        securePage
                .securePageFunctions()
                .clickLogoutButton();

        securePage
                .assertions()
                .theElementIsDisplayed(securePage.ALERT_ELEMENT())
                .theElementTextEquals(securePage.ALERT_ELEMENT(), "You logged out of the secure area!\n×");
    }

    @Test
    public void UserIsAbleToLoginWithoutAssertionTest() {
        homePage.homePageFunctions()
                .clickOnLink("Form Authentication");

        formAuthenticationPage
                .formAuthenticationPageFunctions()
                .sendKeysToField(formAuthenticationPage.USERNAME_FIELD_ELEMENT(), "invalidUsername")
                .sendKeysToField(formAuthenticationPage.PASSWORD_FIELD_ELEMENT(), "invalidPassword")
                .clickLoginButton()
                .sendKeysToField(formAuthenticationPage.USERNAME_FIELD_ELEMENT(), formAuthenticationPage.CREDENTIALS_ELEMENTS().get(0).getText())
                .sendKeysToField(formAuthenticationPage.PASSWORD_FIELD_ELEMENT(), formAuthenticationPage.CREDENTIALS_ELEMENTS().get(1).getText())
                .clickLoginButton();

        securePage
                .securePageFunctions()
                .clickLogoutButton();
    }
}
