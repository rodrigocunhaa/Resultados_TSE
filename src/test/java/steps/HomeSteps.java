package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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

    @Then("I see {string} candidate")
    public void viewCandidate(String option) {
        assert homePage.returnCandidate(option).isDisplayed();
    }

    @And("I go to favorites page")
    public void goToFavoritesPage() {
        homePage.clickFavoritesButton();
    }

}
