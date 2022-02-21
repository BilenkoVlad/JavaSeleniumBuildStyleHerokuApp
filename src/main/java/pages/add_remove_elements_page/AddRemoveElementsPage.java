package pages.add_remove_elements_page;

import pages.Assertions;

public class AddRemoveElementsPage extends AddRemoveElementsPageFunctions {
    private final AddRemoveElementsPageFunctions addRemoveElementsPageFunctions;
    private final Assertions assertions;

    public String addButtonXPATH() {
        return ADD_BUTTON;
    }

    public String deleteButtonXPATH() {
        return DELETE_BUTTON;
    }

    public AddRemoveElementsPageFunctions addRemoveElementsPageFunctions() {
        return addRemoveElementsPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }

    private AddRemoveElementsPage(AddRemoveElementsPageFunctions addRemoveElementsPageFunctions, Assertions assertions) {
        this.addRemoveElementsPageFunctions = addRemoveElementsPageFunctions;
        this.assertions = assertions;
    }

    public static AddRemoveElementsPage getAddRemoveElementsPage() {
        return new AddRemoveElementsPage(
                new AddRemoveElementsPageFunctions(),
                new Assertions()
        );
    }
}
