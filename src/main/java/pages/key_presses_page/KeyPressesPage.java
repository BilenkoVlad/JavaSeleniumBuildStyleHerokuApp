package pages.key_presses_page;

import org.openqa.selenium.WebElement;
import pages.Assertions;
import utils.browser_manager.DriverManager;

public class KeyPressesPage extends KeyPressesPageFunctions {

    private final KeyPressesPageFunctions keyPressesPageFunctions;
    private final Assertions assertions;

    private KeyPressesPage(KeyPressesPageFunctions keyPressesPageFunctions, Assertions assertions) {
        this.keyPressesPageFunctions = keyPressesPageFunctions;
        this.assertions = assertions;
    }

    public static KeyPressesPage getKeyPressesPage() {
        return new KeyPressesPage(
                new KeyPressesPageFunctions(),
                new Assertions()
        );
    }

    public WebElement HEADERS_PAGE_ELEMENT() {
        return DriverManager.findElementByXPATH(HEADERS_PAGE);
    }

    public WebElement BODY_TEXT_ELEMENT() {
        return DriverManager.findElementByXPATH(BODY_TEXT);
    }

    public WebElement INPUT_FIELD_ELEMENT() {
        return DriverManager.findElementByXPATH(INPUT_FIELD);
    }

    public WebElement RESULT_TEXT_ELEMENT() {
        return DriverManager.findElementByXPATH(RESULT_TEXT);
    }

    public KeyPressesPageFunctions keyPressesPageFunctions() {
        return keyPressesPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }
}
