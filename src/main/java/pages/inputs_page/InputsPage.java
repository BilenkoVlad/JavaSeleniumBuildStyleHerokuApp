package pages.inputs_page;

import pages.Assertions;

public class InputsPage extends InputsPageFunctions {

    private final InputsPageFunctions inputsPageFunctions;
    private final Assertions assertions;

    private InputsPage(InputsPageFunctions inputsPageFunctions, Assertions assertions) {
        this.inputsPageFunctions = inputsPageFunctions;
        this.assertions = assertions;
    }

    public static InputsPage getInputsPage() {
        return new InputsPage(
                new InputsPageFunctions(),
                new Assertions()
        );
    }

    public String headersPageXPATH() {
        return HEADERS_PAGE;
    }

    public String inputFieldXPATH() {
        return INPUT_FIELD;
    }

    public String bodyTextXPATH() {
        return BODY_TEXT;
    }

    public InputsPageFunctions inputsPageFunctions() {
        return inputsPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }
}
