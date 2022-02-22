package pages.dropdown_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.Assertions;
import utils.browser_manager.DriverManager;

public class DropdownPage extends DropdownPageFunctions {
    private final DropdownPageFunctions dropdownPageFunctions;
    private final Assertions assertions;

    private DropdownPage(DropdownPageFunctions dropdownPageFunctions, Assertions assertions) {
        this.dropdownPageFunctions = dropdownPageFunctions;
        this.assertions = assertions;
    }

    public static DropdownPage getDropdownPage() {
        return new DropdownPage(
                new DropdownPageFunctions(),
                new Assertions()
        );
    }

    public WebElement HEADER_PAGE_ELEMENT() {
        return DriverManager.findElementByXPATH(HEADER_PAGE);
    }

    public WebElement DROPDOWN_ELEMENT() {
        return DriverManager.findElementByXPATH(DROPDOWN);
    }

    public Select DROPDOWN_SELECT(){
        return new Select(DROPDOWN_ELEMENT());
    }

    public DropdownPageFunctions dropdownPageFunctions() {
        return dropdownPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }

}
