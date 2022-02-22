package pages.file_download_page;

import org.openqa.selenium.WebElement;
import utils.browser_manager.DriverManager;

public class FileDownloadPageFunctions {
    protected final String HEADERS_PAGE = ".//div[@class='example']/h3";
    protected final String FILES = ".//div[@class='example']/a";

    public FileDownloadPageFunctions clickOnFilesLinks() {
        for (WebElement webElement : DriverManager.findElementsByXPATH(FILES)) {
            webElement.click();
        }
        return this;
    }
}
