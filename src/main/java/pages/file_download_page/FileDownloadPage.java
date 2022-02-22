package pages.file_download_page;

import org.openqa.selenium.WebElement;
import pages.Assertions;
import utils.browser_manager.DriverManager;

import java.util.List;

public class FileDownloadPage extends FileDownloadPageFunctions {
    private final FileDownloadPageFunctions fileDownloadPageFunctions;
    private final Assertions assertions;

    private FileDownloadPage(FileDownloadPageFunctions fileDownloadPageFunctions, Assertions assertions) {
        this.fileDownloadPageFunctions = fileDownloadPageFunctions;
        this.assertions = assertions;
    }

    public static FileDownloadPage getFileDownloadPage() {
        return new FileDownloadPage(
                new FileDownloadPageFunctions(),
                new Assertions()
        );
    }

    public WebElement HEADERS_PAGE_ELEMENT() {
        return DriverManager.findElementByXPATH(HEADERS_PAGE);
    }

    public List<WebElement> FILES_ELEMENTS() {
        return DriverManager.findElementsByXPATH(FILES);
    }

    public FileDownloadPageFunctions fileDownloadPageFunctions() {
        return fileDownloadPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }

}
