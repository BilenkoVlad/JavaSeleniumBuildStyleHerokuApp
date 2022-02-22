package pages.entry_ad_page;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.browser_manager.DriverManager;

public class EntryAdPageFunctions {
    protected final String MODAL_WINDOW = ".//div[@class='modal']";
    protected final String HEADERS_PAGE = ".//div[@class='example']/h3";
    protected final String BODY_TEXT = ".//div[@class='example']/p";
    protected final String CLICK_HERE = ".//a[@id='restart-ad']";
    protected final String TITLE = ".//div[@class='modal-title']/h3";
    protected final String TEXT = ".//div[@class='modal-body']/p";
    protected final String CLOSE_BUTTON = ".//div[@class='modal-footer']/p";
    WebDriverWait webDriverWait = new WebDriverWait(DriverManager.initDriver(), 3);

    public EntryAdPageFunctions clickCloseButton() {
        DriverManager.findElementByXPATH(CLOSE_BUTTON).click();
        return this;
    }

    public EntryAdPageFunctions clickOnClickHere() {
        while (!DriverManager.findElementByXPATH(MODAL_WINDOW).isDisplayed()) {
            DriverManager.findElementByXPATH(CLICK_HERE).click();
            try {
                if (webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(MODAL_WINDOW))) != null) {
                    break;
                }
            } catch (TimeoutException timeoutException) {
                System.out.println("No modal window is shown");
            }
        }
        return this;
    }
}
