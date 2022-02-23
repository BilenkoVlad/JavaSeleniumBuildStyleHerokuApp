package pages.hovers_page;

import pages.Assertions;
import utils.browser_manager.ActionsManager;
import utils.browser_manager.DriverManager;

import java.util.Arrays;
import java.util.List;

public class HoversPageFunctions {
    protected final String HEADERS_PAGE = ".//div[@class='example']/h3";
    protected final String BODY_TEXT = ".//div[@class='example']/p";
    protected final String AVATARS = ".//div[@class='figure']";
    protected final String AVATARS_NAMES = ".//div[@class='figcaption']/h5";
    protected final String AVATARS_LINKS = ".//div[@class='figcaption']/a";
    protected final List<String> avatarName = Arrays.asList("name: user1", "name: user2", "name: user3");

    public HoversPageFunctions hoverOnAvatarsWithAssertion() {
        for (int i = 0; i < DriverManager.findElementsByXPATH(AVATARS).size(); i++) {
            ActionsManager.initActions().moveToElement(DriverManager.findElementsByXPATH(AVATARS).get(i)).build().perform();
            Assertions assertions = new Assertions();
            assertions
                    .theElementIsDisplayed(DriverManager.findElementsByXPATH(AVATARS_NAMES).get(i))
                    .theElementIsDisplayed(DriverManager.findElementsByXPATH(AVATARS_LINKS).get(i))
                    .theElementTextEquals(DriverManager.findElementsByXPATH(AVATARS_NAMES).get(i), avatarName.get(i))
                    .theElementTextEquals(DriverManager.findElementsByXPATH(AVATARS_LINKS).get(i), "View profile");
        }
        return this;
    }
}
