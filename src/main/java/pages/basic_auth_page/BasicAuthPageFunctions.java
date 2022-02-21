package pages.basic_auth_page;

import utils.browser_manager.DriverManager;
import utils.settings.Settings;

public class BasicAuthPageFunctions {
    public BasicAuthPageFunctions loginToPage(String username, String password) {
        DriverManager.initDriver().get(String.format("https://%s:%s@%s", username, password, Settings.getTAFSettings().getEnvURL().split("//")[1] + "basic_auth"));
        return this;
    }
}
