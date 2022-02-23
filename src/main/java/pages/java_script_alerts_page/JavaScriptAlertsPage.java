package pages.java_script_alerts_page;

import org.openqa.selenium.WebElement;
import pages.Assertions;
import utils.browser_manager.DriverManager;

import java.util.List;

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

    public WebElement HEADERS_PAGE_ELEMENT() {
        return DriverManager.findElementByXPATH(HEADERS_PAGE);
    }

    public WebElement RESULT_TEXT_ELEMENT() {
        return DriverManager.findElementByXPATH(RESULT_TEXT);
    }

    public WebElement BODY_TEXT_ELEMENT() {
        return DriverManager.findElementByXPATH(BODY_TEXT);
    }

    public WebElement RESULT_MESSAGE_ELEMENT() {
        return DriverManager.findElementByXPATH(RESULT_MESSAGE);
    }

    public List<WebElement> JS_BUTTONS_ELEMENTS() {
        return DriverManager.findElementsByXPATH(JS_BUTTONS);
    }

    public WebElement JS_ALERT_ELEMENT() {
        return DriverManager.findElementByXPATH(JS_ALERT);
    }

    public WebElement JS_CONFIRM_ELEMENT() {
        return DriverManager.findElementByXPATH(JS_CONFIRM);
    }

    public WebElement JS_PROMPT_ELEMENT() {
        return DriverManager.findElementByXPATH(JS_PROMPT);
    }

    public JavaScriptAlertsPageFunctions javaScriptAlertsPageFunctions() {
        return javaScriptAlertsPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }

}
