package pages;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import utils.browser_manager.DriverManager;

public class Assertions {

    public Assertions theElementIsDisplayed(String xpath) {
        Assert.assertTrue(DriverManager.findElementByXPATH(xpath).isDisplayed());
        return this;
    }

    public Assertions theElementIsNotDisplayed(String xpath) {
        try {
            Assert.assertFalse(DriverManager.findElementByXPATH(xpath).isDisplayed());
        } catch (NoSuchElementException noSuchElementException) {
            Assert.assertTrue(true);
        }
        return this;
    }

    public Assertions theElementsAreDisplayed(String xpath) {
        for (int i = 0; i < DriverManager.findElementsByXPATH(xpath).size(); i++) {
            Assert.assertTrue(DriverManager.findElementByXPATH(xpath).isDisplayed());
        }
        return this;
    }

    public Assertions theListSizeEquals(String xpath, int size) {
        Assert.assertEquals(DriverManager.findElementsByXPATH(xpath).size(), size);
        return this;
    }

    public Assertions theElementTextEquals(String xpath, String expectedText) {
        Assert.assertEquals(DriverManager.findElementByXPATH(xpath).getText(), expectedText);
        return this;
    }
}
