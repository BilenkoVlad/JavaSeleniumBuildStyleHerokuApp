package pages.dynamic_loading_page;

import pages.Assertions;

public class DynamicLoadingPage extends DynamicLoadingPageFunctions {
    private final DynamicLoadingPageFunctions dynamicLoadingPageFunctions;
    private final Assertions assertions;

    private DynamicLoadingPage(DynamicLoadingPageFunctions dynamicLoadingPageFunctions, Assertions assertions) {
        this.dynamicLoadingPageFunctions = dynamicLoadingPageFunctions;
        this.assertions = assertions;
    }

    public static DynamicLoadingPage getDynamicLoadingPage() {
        return new DynamicLoadingPage(
                new DynamicLoadingPageFunctions(),
                new Assertions()
        );
    }

    public String headersPageXPATH() {
        return HEADERS_PAGE;
    }

    public String bodyLinksXPATH() {
        return BODY_LINKS;
    }

    public String bodyTextXPATH() {
        return BODY_TEXT;
    }

    public DynamicLoadingPageFunctions dynamicLoadingPageFunctions() {
        return dynamicLoadingPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }
}
