package pages.dynamic_loading_page.example1_hidden_elements_page;

import pages.Assertions;

public class Example1HiddenElementsPage extends Example1HiddenElementsPageFunctions {
    private final Example1HiddenElementsPageFunctions example1HiddenElementsPageFunctions;
    private final Assertions assertions;

    private Example1HiddenElementsPage(Example1HiddenElementsPageFunctions example1HiddenElementsPageFunctions, Assertions assertions) {
        this.example1HiddenElementsPageFunctions = example1HiddenElementsPageFunctions;
        this.assertions = assertions;
    }

    public static Example1HiddenElementsPage getExample1HiddenElementsPage() {
        return new Example1HiddenElementsPage(
                new Example1HiddenElementsPageFunctions(),
                new Assertions()
        );
    }

    public String headersPageXPATH() {
        return HEADERS_PAGE;
    }

    public String startButtonXPATH() {
        return START_BUTTON;
    }

    public String bodyTextXPATH() {
        return BODY_TEXT;
    }

    public String loaderXPATH() {
        return LOADER;
    }

    public String hiddenTextXPATH() {
        return HIDDEN_TEXT;
    }

    public Example1HiddenElementsPageFunctions example1HiddenElementsPageFunctions() {
        return example1HiddenElementsPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }
}
