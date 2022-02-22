package pages.basic_auth_page;

import pages.Assertions;

public class BasicAuthPage extends BasicAuthPageFunctions {
    private final BasicAuthPageFunctions basicAuthPageFunctions;
    private final Assertions assertions;

    public BasicAuthPage(BasicAuthPageFunctions basicAuthPageFunctions, Assertions assertions) {
        this.basicAuthPageFunctions = basicAuthPageFunctions;
        this.assertions = assertions;
    }

    public static BasicAuthPage getBasicAuthPage() {
        return new BasicAuthPage(
                new BasicAuthPageFunctions(),
                new Assertions()
        );
    }

    public BasicAuthPageFunctions basicAuthPageFunctions() {
        return basicAuthPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }
}
