package pages.key_presses_page;

import org.openqa.selenium.WebElement;

public class KeyPressesPageFunctions {
    protected final String HEADERS_PAGE = ".//div[@class='example']/h3";
    protected final String BODY_TEXT = ".//div[@class='example']/p";
    protected final String INPUT_FIELD = ".//input[@id='target']";
    protected final String RESULT_TEXT = ".//p[@id='result']";

    public KeyPressesPageFunctions sendKeysToField(WebElement webElement, CharSequence... keysToSend) {
        webElement.sendKeys(keysToSend);
        return this;
    }
}
