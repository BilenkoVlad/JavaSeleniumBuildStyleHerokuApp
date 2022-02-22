package pages.java_script_alerts_page;

import pages.Assertions;

public class JavaScriptAlertsPage extends JavaScriptAlertsPageFunctions {
    private final JavaScriptAlertsPageFunctions javaScriptAlertsPageFunctions;
    private final Assertions assertions;

    private JavaScriptAlertsPage(JavaScriptAlertsPageFunctions javaScriptAlertsPageFunctions, Assertions assertions) {
        this.javaScriptAlertsPageFunctions = javaScriptAlertsPageFunctions;
        this.assertions = assertions;
    }

    public static JavaScriptAlertsPage getJavaScriptAlertsPage() {
        return new JavaScriptAlertsPage(
                new JavaScriptAlertsPageFunctions(),
                new Assertions()
        );
    }

    public String headersPageXPATH() {
        return HEADERS_PAGE;
    }

    public String resultTextXPATH() {
        return RESULT_TEXT;
    }

    public String bodyTextXPATH() {
        return BODY_TEXT;
    }

    public String resultMessageXPATH() {
        return RESULT_MESSAGE;
    }

    public String jsButtonsXPATH() {
        return JS_BUTTONS;
    }

    public String jsAlertXPATH() {
        return JS_ALERT;
    }

    public String jsConfirmXPATH() {
        return JS_CONFIRM;
    }

    public String jsPromptXPATH() {
        return JS_PROMPT;
    }

    public JavaScriptAlertsPageFunctions javaScriptAlertsPageFunctions() {
        return javaScriptAlertsPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }

}
