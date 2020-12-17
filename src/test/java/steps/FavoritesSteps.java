package steps;

import io.cucumber.java.en.Then;
import pages.FavoritesPage;
import util.AppiumDriverManager;

public class FavoritesSteps {

    private FavoritesPage favoritesPage = new FavoritesPage(AppiumDriverManager.getDriver());

    @Then("{string} is displayed on favorites page")
    public void viewCandidateFavored(String option) {
        assert favoritesPage.returnCandidate(option).isDisplayed();
    }
}
