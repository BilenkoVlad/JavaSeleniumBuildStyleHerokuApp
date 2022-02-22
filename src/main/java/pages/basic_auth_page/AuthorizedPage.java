package pages.basic_auth_page;

import org.openqa.selenium.WebElement;
import pages.Assertions;
import utils.browser_manager.DriverManager;

public class AuthorizedPage extends AuthorizedPageFunctions {
    private final AuthorizedPageFunctions addRemoveElementsPageFunctions;
    private final Assertions assertions;

    private AuthorizedPage(AuthorizedPageFunctions addRemoveElementsPageFunctions, Assertions assertions) {
        this.addRemoveElementsPageFunctions = addRemoveElementsPageFunctions;
        this.assertions = assertions;
    }

    public static AuthorizedPage getAuthorizedPage() {
        return new AuthorizedPage(
                new AuthorizedPageFunctions(),
                new Assertions()
        );
    }

    public WebElement PAGE_NAME_ELEMENT() {
        return DriverManager.findElementByXPATH(PAGE_NAME_TEXT);
    }

    public WebElement PAGE_BODY_ELEMENT() {
        return DriverManager.findElementByXPATH(PAGE_BODY_TEXT);
    }

    public AuthorizedPageFunctions authorizedPageFunctions() {
        return addRemoveElementsPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }
}
