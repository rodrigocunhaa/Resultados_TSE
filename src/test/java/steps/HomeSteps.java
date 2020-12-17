package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import util.AppiumDriverManager;

public class HomeSteps {

    private HomePage homePage = new HomePage(AppiumDriverManager.getDriver());

    @Given("I launch the screen to select a local")
    public void launchSelectLocal() {
        homePage.clickChooseLocalButton();
    }

    @Given("I select {string} candidate")
    public void selectCandidate(String option) {
        homePage.selectCandidate(option);
    }

    @When("I select the {string} state")
    public void selectState(String option) {
        homePage.selectState(option);
    }

    @When("I favorite the candidate")
    public void favoriteCandidate() {
        homePage.clickFavorButton();
    }

    @And("I select the {string} city")
    public void selectCity(String option) {
        homePage.selectCity(option);
    }

    @Then("I see {string} candidate")
    public void viewCandidate(String option) {
        assert homePage.returnCandidate(option).isDisplayed();
    }

    @Then("{string} is displayed on favorites tab")
    public void viewCandidateFavored(String option) {
        homePage.clickFavoritesButton();
        assert homePage.returnCandidate(option).isDisplayed();
    }

}
