package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.AppiumDriverManager;

public class SelectLocalPage {

    private AppiumDriver<MobileElement> driver;
    private WebDriverWait wait;

    public SelectLocalPage(AppiumDriver<MobileElement> appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
        this.driver = appiumDriver;
        wait = AppiumDriverManager.getWait();
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Estado\")")
    public MobileElement stateSelector;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Confirmar\")")
    public MobileElement confirmButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Município\")")
    public MobileElement citySelector;

    public void clickState (String stateOption) {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"" + stateOption + "\")")).click();
    }

    public void selectState (String stateOption) {
        stateSelector.click();
        this.clickState(stateOption);
        confirmButton.click();
    }

    public void clickFirstCity () {
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
                "/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView" +
                "/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.app.Dialog" +
                "/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.ListView/android.view.View[2]" +
                "/android.view.View/android.view.View[1]").click();
    }

    public void selectCity () {
        citySelector.click();
        this.clickFirstCity();

        for (int i = 0;i < 2;i++) {
            confirmButton.click();
        }
    }
}
