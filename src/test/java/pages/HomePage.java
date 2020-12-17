package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.AppiumDriverManager;

public class HomePage {

    private AppiumDriver<MobileElement> driver;
    private WebDriverWait wait;

    public HomePage(AppiumDriver<MobileElement> appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
        this.driver = appiumDriver;
        wait = AppiumDriverManager.getWait();
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Selecione uma localidade acima\")")
    public MobileElement selectPlaceStr;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Escolher local\")")
    public MobileElement chooseLocalButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Favoritos\")")
    public MobileElement favoritesButton;

    public void clickChooseLocalButton () {
        chooseLocalButton.click();
    }

    public MobileElement returnCandidate(String candidateName) {
        MobileElement candidate = driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"" + candidateName + "\")"));
        return candidate;
    }

    public void selectCandidate(String candidateName) {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"" + candidateName + "\")")).click();
    }

    public void clickFavoritesButton() {
        favoritesButton.click();
    }
}
