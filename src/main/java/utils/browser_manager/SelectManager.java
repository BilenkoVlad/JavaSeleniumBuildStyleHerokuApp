package utils.browser_manager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectManager {

    private static Select select;

    public static Select initActions(WebElement webElement) {
        if (select == null) {
            new SelectManager().getSelect(webElement);
        }
        return select;
    }

    private void getSelect(WebElement webElement) {
        select = new Select(webElement);
    }
}
