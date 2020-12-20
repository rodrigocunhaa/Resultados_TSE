package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.CandidatePage;
import util.AppiumDriverManager;

public class CandidateSteps {

    private CandidatePage candidatePage = new CandidatePage(AppiumDriverManager.getDriver());

    @When("I favorite the candidate")
    public void favoriteCandidate() {
        candidatePage.clickFavorButton();
    }

    @And("I close the candidate page")
    public void closeCandidatePage() {
        candidatePage.closePage();
    }
}
