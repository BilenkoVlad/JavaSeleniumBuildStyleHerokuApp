import org.testng.annotations.Test;
import pages.file_download_page.FileDownloadPage;

public class TC0012UserIsAbleToDownloadFilesTest extends BaseTestClass {
    FileDownloadPage fileDownloadPage = FileDownloadPage.getFileDownloadPage();

    @Test
    public void UserIsAbleToDownloadFilesTest() {
        homePage.homePageFunctions()
                .clickOnLink("File Download");

        fileDownloadPage
                .assertions()
                .thePageURLContains("download")
                .theElementTextEquals(fileDownloadPage.HEADERS_PAGE_ELEMENT(), "File Downloader")
                .theElementsAreDisplayed(fileDownloadPage.FILES_ELEMENTS());

        fileDownloadPage
                .fileDownloadPageFunctions()
                .clickOnFilesLinks();
    }
}
