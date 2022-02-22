package pages.dynamic_controls_page;

import pages.Assertions;

public class DynamicControlsPage extends DynamicControlsPageFunctions {
    private final DynamicControlsPageFunctions dynamicControlsPageFunctions;
    private final Assertions assertions;

    private DynamicControlsPage(DynamicControlsPageFunctions dynamicControlsPageFunctions, Assertions assertions) {
        this.dynamicControlsPageFunctions = dynamicControlsPageFunctions;
        this.assertions = assertions;
    }

    public static DynamicControlsPage getDynamicControlsPage() {
        return new DynamicControlsPage(
                new DynamicControlsPageFunctions(),
                new Assertions()
        );
    }

    public String headerPageXPATH() {
        return HEADER_PAGE;
    }

    public String removeButtonXPATH() {
        return REMOVE_BUTTON;
    }

    public String addButtonXPATH() {
        return ADD_BUTTON;
    }

    public String messageXPATH() {
        return MESSAGE;
    }

    public String inputLoadingXPATH() {
        return INPUT_LOADING;
    }

    public String checkboxLoadingXPATH() {
        return CHECKBOX_LOADING;
    }

    public String enableButtonXPATH() {
        return ENABLE_BUTTON;
    }

    public String disableButtonXPATH() {
        return DISABLE_BUTTON;
    }

    public String checkboxXPATH() {
        return CHECKBOX;
    }

    public String textFieldXPATH() {
        return TEXT_FIELD;
    }

    public String bodyTextXPATH() {
        return BODY_TEXT;
    }

    public DynamicControlsPageFunctions dynamicControlsPageFunctions() {
        return dynamicControlsPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }

}
