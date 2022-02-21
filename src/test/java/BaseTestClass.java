import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import pages.home_page.HomePage;
import utils.browser_manager.DriverManager;
import utils.settings.Settings;

public class BaseTestClass {
    WebDriver driver = DriverManager.initDriver();
    HomePage homePage = HomePage.getHomePage();

    @BeforeMethod
    public void browserInitialize() {
        driver.get(Settings.getTAFSettings().getEnvURL());
    }

    @AfterTest
    public void browserFinalization() {
        DriverManager.resetDriver();
    }
}
