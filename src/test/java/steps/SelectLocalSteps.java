package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.SelectLocalPage;
import util.AppiumDriverManager;

public class SelectLocalSteps {

    private SelectLocalPage selectLocalPage = new SelectLocalPage(AppiumDriverManager.getDriver());

    @When("I select the {string} state")
    public void selectState(String option) {
        selectLocalPage.selectState(option);
    }

    @And("I select the {string} city")
    public void selectCity(String option) {
        selectLocalPage.selectCity(option);
    }

    @And("I click to confirm")
    public void clickConfirm() {
        selectLocalPage.clickConfirmButton();
    }
}
