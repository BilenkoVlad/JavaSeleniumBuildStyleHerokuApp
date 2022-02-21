package utils.browser_manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.settings.Settings;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DriverManager {

    private static WebDriver webDriver;

    public static WebDriver initDriver() {
        if (webDriver == null) {
            new DriverManager().getWebDriver();
        }
        return webDriver;
    }

    private void getWebDriver() {
        if (Settings.getTAFSettings().getBrowser().equals("chrome")) {
            ChromeOptions options = setupChromeOptions();
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver(options);
            webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            webDriver.manage().window().maximize();
        }
        if (Settings.getTAFSettings().getBrowser().equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            webDriver = new FirefoxDriver();
        }
    }

    public static WebElement findElementByXPATH(String xpath){
        return initDriver().findElement(By.xpath(xpath));
    }

    public static List<WebElement> findElementsByXPATH(String xpath){
        return initDriver().findElements(By.xpath(xpath));
    }

    public static void resetDriver() {
        initDriver().close();
        webDriver = null;
    }

    public static void refreshPage() {
        initDriver().navigate().refresh();
    }

    private static ChromeOptions setupChromeOptions() {
        String downloadDir = Paths.get("").toAbsolutePath() + "\\src\\main\\resources\\downloads";
        HashMap<String, Object> chromePreferences = new HashMap<String, Object>();
        chromePreferences.put("profile.default_content_settings.popups", 0);
        chromePreferences.put("download.default_directory", downloadDir);
        chromePreferences.put("disable-popup-blocking", true);
        chromePreferences.put("download.prompt_for_download", false);
        chromePreferences.put("safebrowsing.enabled", true);

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("prefs", chromePreferences);
        chromeOptions.addArguments("--test-type");
        chromeOptions.addArguments("--disable-extensions");
        return chromeOptions;
    }
}
