package utils.browser_manager;

import org.openqa.selenium.interactions.Actions;

public class ActionsManager {

    private static Actions actions;

    public static Actions initActions() {
        if (actions == null) {
            new ActionsManager().getActions();
        }
        return actions;
    }

    private void getActions() {
        actions = new Actions(DriverManager.initDriver());
    }
}
