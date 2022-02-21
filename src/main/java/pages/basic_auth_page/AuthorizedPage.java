package pages.basic_auth_page;

import pages.Assertions;

public class AuthorizedPage extends AuthorizedPageFunctions {
    private final AuthorizedPageFunctions addRemoveElementsPageFunctions;
    private final Assertions assertions;

    public String pageNameXPATH() {
        return PAGE_NAME_TEXT;
    }

    public String pageBodyXPATH() {
        return PAGE_BODY_TEXT;
    }

    public AuthorizedPageFunctions authorizedPageFunctions() {
        return addRemoveElementsPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }

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
}
