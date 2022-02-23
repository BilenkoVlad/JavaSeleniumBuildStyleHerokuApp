package pages.java_script_alerts_page;

import utils.browser_manager.DriverManager;

public class JavaScriptAlertsPageFunctions {
    protected final String HEADERS_PAGE = ".//div[@class='example']/h3";
    protected final String BODY_TEXT = ".//div[@class='example']/p";
    protected final String RESULT_TEXT = ".//div[@class='example']/h4";
    protected final String RESULT_MESSAGE = ".//p[@id='result']";
    protected final String JS_BUTTONS = ".//button";
    protected final String JS_ALERT = ".//button[@onclick='jsAlert()']";
    protected final String JS_CONFIRM = ".//button[@onclick='jsConfirm()']";
    protected final String JS_PROMPT = ".//button[@onclick='jsPrompt()']";

    public JavaScriptAlertsPageFunctions clickOnJSAlert() {
        DriverManager.findElementByXPATH(JS_ALERT).click();
        return this;
    }

    public JavaScriptAlertsPageFunctions clickOnJSConfirm() {
        DriverManager.findElementByXPATH(JS_CONFIRM).click();
        return this;
    }

    public JavaScriptAlertsPageFunctions clickOnJSPrompt() {
        DriverManager.findElementByXPATH(JS_PROMPT).click();
        return this;
    }
}
