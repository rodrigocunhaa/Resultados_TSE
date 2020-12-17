package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SetupPage;
import util.AppiumDriverManager;

public class SetupSteps {

    private SetupPage setupPage;
    private HomePage homePage;

    @Given("I launch the App for the first time")
    public void launchApp() {
        setupPage = new SetupPage(AppiumDriverManager.getDriver());
        homePage = new HomePage(AppiumDriverManager.getDriver());
    }

    @When("I complete the setup")
    public void completeSetup() {
        setupPage.completeSetup();
    }

    @Then("I reach the home page")
    public void homePageReached() {
        assert homePage.selectPlaceStr.isDisplayed();
    }
}
