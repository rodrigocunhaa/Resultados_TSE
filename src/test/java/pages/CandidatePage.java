package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.AppiumDriverManager;

public class CandidatePage {

    private AppiumDriver<MobileElement> driver;
    private WebDriverWait wait;

    public CandidatePage(AppiumDriver<MobileElement> appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
        this.driver = appiumDriver;
        wait = AppiumDriverManager.getWait();
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Fechar\")")
    public MobileElement closeButton;

    public void clickFavorButton() {
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout" +
                "/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
                "/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View" +
                "/android.view.View/android.view.View/android.app.Dialog/android.view.View/android.view.View[2]" +
                "/android.view.View[2]/android.view.View[5]/android.view.View[2]/android.widget.Button").click();
    }

    public void closePage() {
        closeButton.click();
    }
}
