import org.testng.annotations.Test;
import pages.dynamic_loading_page.DynamicLoadingPage;
import pages.dynamic_loading_page.example1_hidden_elements_page.Example1HiddenElementsPage;
import pages.dynamic_loading_page.example2_element_rendered.Example2ElementRendered;
import utils.browser_manager.DriverManager;

import java.util.Arrays;
import java.util.List;

public class TC0010VerifyThatElementsDynamicallyLoadedTest extends BaseTestClass {
    DynamicLoadingPage dynamicLoadingPage = DynamicLoadingPage.getDynamicLoadingPage();
    Example1HiddenElementsPage example1HiddenElementsPage = Example1HiddenElementsPage.getExample1HiddenElementsPage();
    Example2ElementRendered example2ElementRendered = Example2ElementRendered.getExample2ElementRendered();

    @Test
    public void VerifyThatElementsDynamicallyLoadedTest() {
        homePage.homePageFunctions()
                .clickOnLink("Dynamic Loading");

        List<String> bodyText = Arrays.asList("It's common to see an action get triggered that returns a result dynamically. " +
                "It does not rely on the page to reload or finish loading. The page automatically gets updated " +
                "(e.g. hiding elements, showing elements, updating copy, etc) through the use of JavaScript.", "There are two examples. One in which an element already exists on the page but it" +
                " is not displayed. And anonther where the element is not on the page and gets added in.");
        List<String> linksText = Arrays.asList("Example 1: Element on page that is hidden", "Example 2: Element rendered after the fact");

        dynamicLoadingPage
                .assertions()
                .thePageURLContains("dynamic_loading")
                .theElementTextEquals(dynamicLoadingPage.HEADERS_PAGE_ELEMENT(), "Dynamically Loaded Page Elements")
                .theElementsInListEqual(dynamicLoadingPage.BODY_LINKS_ELEMENTS(), linksText)
                .theElementsInListEqual(dynamicLoadingPage.BODY_TEXT_ELEMENTS(), bodyText);

        dynamicLoadingPage
                .dynamicLoadingPageFunctions()
                .clickOnFirstLink();

        example1HiddenElementsPage
                .assertions()
                .thePageURLContains("dynamic_loading/1")
                .theElementTextEquals(example1HiddenElementsPage.HEADERS_PAGE_ELEMENT(), "Dynamically Loaded Page Elements")
                .theElementTextEquals(example1HiddenElementsPage.BODY_TEXT_ELEMENT(), "Example 1: Element on page that is hidden")
                .theElementIsDisplayed(example1HiddenElementsPage.START_BUTTON_ELEMENT())
                .theElementIsEnabled(example1HiddenElementsPage.START_BUTTON_ELEMENT());

        example1HiddenElementsPage
                .example1HiddenElementsPageFunctions()
                .clickOnStartButton();

        example1HiddenElementsPage
                .assertions()
                .theElementTextEquals(example1HiddenElementsPage.LOADER_ELEMENT(), "Loading...")
                .theElementIsDisplayed(example1HiddenElementsPage.LOADER_ELEMENT())
                .theElementIsDisplayedWithCondition(example1HiddenElementsPage.HIDDEN_TEXT_ELEMENT(), example1HiddenElementsPage.HIDDEN_TEXT_XPATH())
                .theElementIsDisplayed(example1HiddenElementsPage.HIDDEN_TEXT_ELEMENT())
                .theElementTextEquals(example1HiddenElementsPage.HIDDEN_TEXT_ELEMENT(), "Hello World!");

        DriverManager.navigateBackInPage();

        dynamicLoadingPage
                .dynamicLoadingPageFunctions()
                .clickOnSecondLink();

        example2ElementRendered
                .assertions()
                .thePageURLContains("dynamic_loading/2")
                .theElementTextEquals(example2ElementRendered.HEADERS_PAGE_ELEMENT(), "Dynamically Loaded Page Elements")
                .theElementTextEquals(example2ElementRendered.BODY_TEXT_ELEMENT(), "Example 2: Element rendered after the fact")
                .theElementIsDisplayed(example2ElementRendered.START_BUTTON_ELEMENT())
                .theElementIsEnabled(example2ElementRendered.START_BUTTON_ELEMENT());

        example2ElementRendered
                .example2ElementRenderedFunctions()
                .clickOnStartButton();

        example2ElementRendered
                .assertions()
                .theElementTextEquals(example2ElementRendered.LOADER_ELEMENT(), "Loading...")
                .theElementIsDisplayed(example2ElementRendered.LOADER_ELEMENT())
                .theElementIsDisplayedWithCondition(example2ElementRendered.HIDDEN_TEXT_ELEMENT(), example2ElementRendered.HIDDEN_TEXT_XPATH())
                .theElementIsDisplayed(example2ElementRendered.HIDDEN_TEXT_ELEMENT())
                .theElementTextEquals(example2ElementRendered.HIDDEN_TEXT_ELEMENT(), "Hello World!");
    }
}
