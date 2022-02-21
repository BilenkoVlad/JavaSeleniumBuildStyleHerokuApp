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
                .basicAuthPageFunctions()
                .loginToPage("admin", "admin");

        authorizedPage
                .assertions()
                .theElementTextEquals(authorizedPage.pageNameXPATH(), "Basic Auth")
                .theElementTextEquals(authorizedPage.pageBodyXPATH(), "Congratulations! You must have the proper credentials.");
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
