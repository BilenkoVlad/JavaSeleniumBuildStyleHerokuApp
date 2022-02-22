package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.browser_manager.DriverManager;

import java.util.List;
import java.util.concurrent.Callable;

public class Assertions {
    WebDriverWait webDriverWait = new WebDriverWait(DriverManager.initDriver(), 10);

    public Assertions theElementIsDisplayed(WebElement webElement) {
        Assert.assertTrue(webElement.isDisplayed());
        return this;
    }

    public Assertions theElementIsEnabled(WebElement webElement) {
        Assert.assertTrue(webElement.isEnabled());
        return this;
    }

    public Assertions theElementIsDisabled(WebElement webElement) {
        Assert.assertFalse(webElement.isEnabled());
        return this;
    }

    public Assertions thePollingCondition(Callable<Boolean> condition) {
        try {
            while (!condition.call()) {
                DriverManager.initDriver().navigate().refresh();
            }
            return this;
        } catch (Exception ignored) {
            return this;
        }
    }

    public Assertions theElementIsNotDisplayed(String xpath) {
        try {
            Assert.assertFalse(DriverManager.findElementByXPATH(xpath).isDisplayed());
        } catch (NoSuchElementException noSuchElementException) {
            Assert.assertTrue(true);
        }
        return this;
    }

    public Assertions theElementsAreDisplayed(List<WebElement> webElements) {
        for (WebElement webElement : webElements) {
            Assert.assertTrue(webElement.isDisplayed());
        }
        return this;
    }

    public Assertions theListSizeEquals(List<WebElement> webElements, int size) {
        Assert.assertEquals(webElements.size(), size);
        return this;
    }

    public Assertions theListSizeEquals(List<WebElement> webElements, List<?> list) {
        Assert.assertEquals(webElements.size(), list.size());
        return this;
    }

    public Assertions theElementTextEquals(WebElement webElement, String expectedText) {
        Assert.assertEquals(webElement.getText(), expectedText);
        return this;
    }

    public Assertions theAlertTextEquals(String expectedText) {
        Assert.assertEquals(DriverManager.getAlertText(), expectedText);
        return this;
    }

    public Assertions thePageURLContains(String url) {
        Assert.assertTrue(DriverManager.getCurrentURL().contains(url));
        return this;
    }

    public Assertions theElementIsSelected(WebElement webElement) {
        Assert.assertTrue(webElement.isSelected());
        return this;
    }

    public Assertions theElementIsUnselected(WebElement webElement) {
        Assert.assertFalse(webElement.isSelected());
        return this;
    }

    public Assertions theAlertIsPresented() {
        try {
            webDriverWait.until(ExpectedConditions.alertIsPresent());
            DriverManager.switchToAlert();
            Assert.assertTrue(true);
        } catch (NoAlertPresentException ignored) {
            Assert.fail();
        }
        return this;
    }

    public Assertions theAlertIsNotPresented() {
        try {
            DriverManager.switchToAlert();
            Assert.fail();
        } catch (NoAlertPresentException noAlertPresentException) {
            Assert.assertTrue(true);
        }
        return this;
    }

    public Assertions theElementsInListEqual(List<WebElement> webElements, List<?> list) {
        for (int i = 0; i < webElements.size(); i++) {
            Assert.assertEquals(webElements.get(i).getText(), list.get(i));
        }
        return this;
    }

    public Assertions theTextEquals(String text1, String text2) {
        Assert.assertEquals(text1, text2);
        return this;
    }

    public Assertions theElementIsDisplayedWithCondition(WebElement webElement, String xpath) {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        theElementIsDisplayed(webElement);
        return this;
    }
}
