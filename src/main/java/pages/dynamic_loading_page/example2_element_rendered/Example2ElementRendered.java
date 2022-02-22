package pages.dynamic_loading_page.example2_element_rendered;

import pages.Assertions;

public class Example2ElementRendered extends Example2ElementRenderedFunctions {
    private final Example2ElementRenderedFunctions example2ElementRenderedFunctions;
    private final Assertions assertions;

    private Example2ElementRendered(Example2ElementRenderedFunctions example2ElementRenderedFunctions, Assertions assertions) {
        this.example2ElementRenderedFunctions = example2ElementRenderedFunctions;
        this.assertions = assertions;
    }

    public static Example2ElementRendered getExample2ElementRendered() {
        return new Example2ElementRendered(
                new Example2ElementRenderedFunctions(),
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

    public Example2ElementRenderedFunctions example2ElementRenderedFunctions() {
        return example2ElementRenderedFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }
}
