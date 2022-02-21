package pages.home_page;

public class HomePage {
    private final HomePageFunctions homePageFunctions;

    public HomePageFunctions homePageFunctions() {
        return homePageFunctions;
    }

    private HomePage(HomePageFunctions homePageFunctions) {
        this.homePageFunctions = homePageFunctions;
    }

    public static HomePage getHomePage() {
        return new HomePage(
                new HomePageFunctions()
        );
    }
}
