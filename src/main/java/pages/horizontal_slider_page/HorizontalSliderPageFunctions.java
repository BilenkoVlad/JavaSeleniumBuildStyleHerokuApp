package pages.horizontal_slider_page;

import org.openqa.selenium.Keys;
import pages.Assertions;
import utils.browser_manager.ActionsManager;
import utils.browser_manager.DriverManager;

import java.util.Arrays;
import java.util.List;

public class HorizontalSliderPageFunctions {
    protected final String HEADER_TEXT = ".//div[@class='example']/h3";
    protected final String BODY_TEXT = ".//div[@class='example']/h4";
    protected final String SLIDER = ".//input";
    protected final String RANGE_NUMBER = ".//span[@id='range']";
    protected final List<String> rangeValuesKeyboard = Arrays.asList("0", "0.5", "1", "1.5", "2", "2.5",
            "3", "3.5", "4", "4.5", "5");
    protected final List<String> rangeValuesUpMouse = Arrays.asList("0", "0.5", "1", "1.5", "2", "2.5",
            "3", "3.5", "3.5", "4", "4.5", "5");
    protected final List<String> rangeValuesDown = Arrays.asList("0", "0.5", "0.5", "1.5", "1.5", "2", "2.5",
            "3", "3.5", "4", "4", "5");

    public HorizontalSliderPageFunctions moveSliderUpByMouseWithAssertion() {
        Assertions assertions = new Assertions();
        int j = 0;
        for (int i = -25; i <= 30; i = i + 5) {
            ActionsManager.initActions().moveToElement(DriverManager.findElementByXPATH(SLIDER), i, 0);
            ActionsManager.initActions().moveByOffset(i, 0).click().build().perform();
            assertions
                    .theElementTextEquals(DriverManager.findElementByXPATH(RANGE_NUMBER), rangeValuesUpMouse.get(j));
            j++;
        }
        return this;
    }

    public HorizontalSliderPageFunctions moveSliderDownByMouseWithAssertion() {
        Assertions assertions = new Assertions();
        int j = rangeValuesDown.size() - 1;
        for (int i = 25; i >= -30; i = i - 5) {
            ActionsManager.initActions().moveToElement(DriverManager.findElementByXPATH(SLIDER), i, 0);
            ActionsManager.initActions().moveByOffset(i, 0).click().build().perform();
            assertions
                    .theElementTextEquals(DriverManager.findElementByXPATH(RANGE_NUMBER), rangeValuesDown.get(j));
            j--;
        }
        return this;
    }

    public HorizontalSliderPageFunctions moveSliderUpByKeyboardWithAssertion() {
        Assertions assertions = new Assertions();
        for (int i = 0; i < 50; i = i + 5) {
            ActionsManager.initActions().moveToElement(DriverManager.findElementByXPATH(SLIDER), -25, 0);
            assertions
                    .theElementTextEquals(DriverManager.findElementByXPATH(RANGE_NUMBER), rangeValuesKeyboard.get(i / 5));
            sendKeysToSlider(Keys.ARROW_UP);
        }
        return this;
    }

    public HorizontalSliderPageFunctions moveSliderDownByKeyboardWithAssertion() {
        Assertions assertions = new Assertions();
        for (int i = 50; i > 0; i = i - 5) {
            ActionsManager.initActions().moveToElement(DriverManager.findElementByXPATH(SLIDER), -25, 0);
            assertions
                    .theElementTextEquals(DriverManager.findElementByXPATH(RANGE_NUMBER), rangeValuesKeyboard.get(i / 5));
            sendKeysToSlider(Keys.DOWN);
        }
        return this;
    }

    public HorizontalSliderPageFunctions sendKeysToSlider(CharSequence... charSequences) {
        DriverManager.findElementByXPATH(SLIDER).sendKeys(charSequences);
        return this;
    }
}
