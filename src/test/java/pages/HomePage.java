package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Estado\")")
    public MobileElement stateSelector;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Confirmar\")")
    public MobileElement confirmButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Município\")")
    public MobileElement citySelector;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Favoritar\")")
    public MobileElement favorButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Fechar\")")
    public MobileElement closeButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Favoritos\")")
    public MobileElement favoritesButton;

    public void clickChooseLocalButton () {
        chooseLocalButton.click();
    }

    public void clickState (String stateOption) {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"" + stateOption + "\")")).click();
    }

    public void selectState (String stateOption) {
        stateSelector.click();
        this.clickState(stateOption);
        confirmButton.click();
    }

    public void clickCity (String cityOption) {
//        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"" + cityOption + "\")")).click();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.ListView/android.view.View[2]/android.view.View/android.view.View[1]").click();
    }

    public void selectCity (String cityOption) {
        citySelector.click();
        this.clickCity(cityOption);

        for (int i = 0;i < 2;i++) {
            confirmButton.click();
        }
    }

    public MobileElement returnCandidate(String candidateName) {
        MobileElement candidate = driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"" + candidateName + "\")"));
        return candidate;
    }

    public void selectCandidate(String candidateName) {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"" + candidateName + "\")")).click();
    }

    public void clickFavorButton() {
//        favorButton.click();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[5]/android.view.View[2]/android.widget.Button").click();
        closeButton.click();
    }

    public void clickFavoritesButton() {
        favoritesButton.click();
    }
}
