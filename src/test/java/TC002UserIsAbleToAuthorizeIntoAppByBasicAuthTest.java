import org.testng.annotations.Test;
import pages.basic_auth_page.AuthorizedPage;
import pages.basic_auth_page.BasicAuthPage;

public class TC002UserIsAbleToAuthorizeIntoAppByBasicAuthTest extends BaseTestClass {

    BasicAuthPage basicAuthPage = BasicAuthPage.getBasicAuthPage();
    AuthorizedPage authorizedPage = AuthorizedPage.getAuthorizedPage();

    @Test
    public void basicAuthValidLogin() {
        homePage.homePageFunctions()
                .clickOnLink("Basic Auth");

        basicAuthPage
                .assertions()
                .thePageURLContains("basic_auth");

        basicAuthPage
                .basicAuthPageFunctions()
                .loginToPage("admin", "admin");

        authorizedPage
                .assertions()
                .thePageURLContains("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        authorizedPage
                .assertions()
                .theElementTextEquals(authorizedPage.PAGE_NAME_ELEMENT(), "Basic Auth")
                .theElementTextEquals(authorizedPage.PAGE_BODY_ELEMENT(), "Congratulations! You must have the proper credentials.");
    }

    @Test
    public void basicAuthInvalidLogin() {
        homePage.homePageFunctions()
                .clickOnLink("Basic Auth");

        basicAuthPage
                .basicAuthPageFunctions()
                .loginToPage("invalidAdmin", "invalidAdmin");
    }
}
