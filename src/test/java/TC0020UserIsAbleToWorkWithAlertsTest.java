import org.testng.annotations.Test;
import pages.java_script_alerts_page.JavaScriptAlertsPage;
import utils.browser_manager.DriverManager;

import java.util.Arrays;
import java.util.List;

public class TC0020UserIsAbleToWorkWithAlertsTest extends BaseTestClass {
    JavaScriptAlertsPage javaScriptAlertsPage = JavaScriptAlertsPage.getJavaScriptAlertsPage();

    @Test
    public void UserIsAbleToWorkWithAlertsTest() {
        homePage.homePageFunctions()
                .clickOnLink("JavaScript Alerts");
        List<String> jsNames = Arrays.asList("Click for JS Alert", "Click for JS Confirm", "Click for JS Prompt");

        javaScriptAlertsPage
                .assertions()
                .thePageURLContains("javascript_alerts")
                .theElementTextEquals(javaScriptAlertsPage.HEADERS_PAGE_ELEMENT(), "JavaScript Alerts")
                .theElementTextEquals(javaScriptAlertsPage.BODY_TEXT_ELEMENT(), "Here are some examples of different JavaScript alerts which " +
                        "can be troublesome for automation")
                .theElementsAreDisplayed(javaScriptAlertsPage.JS_BUTTONS_ELEMENTS())
                .theElementsInListEqual(javaScriptAlertsPage.JS_BUTTONS_ELEMENTS(), jsNames)
                .theElementTextEquals(javaScriptAlertsPage.RESULT_TEXT_ELEMENT(), "Result:")
                .theElementTextEquals(javaScriptAlertsPage.RESULT_MESSAGE_ELEMENT(), "");

        javaScriptAlertsPage
                .javaScriptAlertsPageFunctions()
                .clickOnJSAlert();

        javaScriptAlertsPage
                .assertions()
                .theAlertIsPresented()
                .theAlertTextEquals("I am a JS Alert");

        DriverManager.acceptAlert();

        javaScriptAlertsPage
                .assertions()
                .theElementTextEquals(javaScriptAlertsPage.RESULT_MESSAGE_ELEMENT(), "You successfully clicked an alert");

        javaScriptAlertsPage
                .javaScriptAlertsPageFunctions()
                .clickOnJSConfirm();

        javaScriptAlertsPage
                .assertions()
                .theAlertIsPresented()
                .theAlertTextEquals("I am a JS Confirm");

        DriverManager.acceptAlert();

        javaScriptAlertsPage
                .assertions()
                .theElementTextEquals(javaScriptAlertsPage.RESULT_MESSAGE_ELEMENT(), "You clicked: Ok");

        javaScriptAlertsPage
                .javaScriptAlertsPageFunctions()
                .clickOnJSConfirm();

        javaScriptAlertsPage
                .assertions()
                .theAlertIsPresented()
                .theAlertTextEquals("I am a JS Confirm");

        DriverManager.dismissAlert();

        javaScriptAlertsPage
                .assertions()
                .theElementTextEquals(javaScriptAlertsPage.RESULT_MESSAGE_ELEMENT(), "You clicked: Cancel");

        javaScriptAlertsPage
                .javaScriptAlertsPageFunctions()
                .clickOnJSPrompt();

        javaScriptAlertsPage
                .assertions()
                .theAlertIsPresented()
                .theAlertTextEquals("I am a JS prompt");

        DriverManager.sendKeysToAlert("Test text with !@#$%^&*()");
        DriverManager.acceptAlert();

        javaScriptAlertsPage
                .assertions()
                .theElementTextEquals(javaScriptAlertsPage.RESULT_MESSAGE_ELEMENT(), "You entered: Test text with !@#$%^&*()");

        javaScriptAlertsPage
                .javaScriptAlertsPageFunctions()
                .clickOnJSPrompt();

        javaScriptAlertsPage
                .assertions()
                .theAlertIsPresented()
                .theAlertTextEquals("I am a JS prompt");

        DriverManager.sendKeysToAlert("Test text with !@#$%^&*()");
        DriverManager.dismissAlert();

        javaScriptAlertsPage
                .assertions()
                .theElementTextEquals(javaScriptAlertsPage.RESULT_MESSAGE_ELEMENT(), "You entered: null");

        javaScriptAlertsPage
                .javaScriptAlertsPageFunctions()
                .clickOnJSPrompt();

        javaScriptAlertsPage
                .assertions()
                .theAlertIsPresented()
                .theAlertTextEquals("I am a JS prompt");

        DriverManager.acceptAlert();

        javaScriptAlertsPage
                .assertions()
                .theElementTextEquals(javaScriptAlertsPage.RESULT_MESSAGE_ELEMENT(), "You entered:");

        javaScriptAlertsPage
                .javaScriptAlertsPageFunctions()
                .clickOnJSPrompt();

        javaScriptAlertsPage
                .assertions()
                .theAlertIsPresented()
                .theAlertTextEquals("I am a JS prompt");

        DriverManager.dismissAlert();

        javaScriptAlertsPage
                .assertions()
                .theElementTextEquals(javaScriptAlertsPage.RESULT_MESSAGE_ELEMENT(), "You entered: null");
    }
}
