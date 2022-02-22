package pages.hovers_page;

import pages.Assertions;

public class HoversPage extends HoversPageFunctions {
    private final HoversPageFunctions hoversPageFunctions;
    private final Assertions assertions;

    private HoversPage(HoversPageFunctions hoversPageFunctions, Assertions assertions) {
        this.hoversPageFunctions = hoversPageFunctions;
        this.assertions = assertions;
    }

    public static HoversPage getHoversPage() {
        return new HoversPage(
                new HoversPageFunctions(),
                new Assertions()
        );
    }

    public String headersPageXPATH() {
        return HEADERS_PAGE;
    }

    public String avatarsXPATH() {
        return AVATARS;
    }

    public String avatarsNamesXPATH() {
        return AVATARS_NAMES;
    }

    public String avatarsLinksXPATH() {
        return AVATARS_LINKS;
    }

    public String bodyTextXPATH() {
        return BODY_TEXT;
    }

    public HoversPageFunctions hoversPageFunctions() {
        return hoversPageFunctions;
    }

    public Assertions assertions() {
        return assertions;
    }

}
