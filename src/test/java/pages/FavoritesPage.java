package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.AppiumDriverManager;

public class FavoritesPage {

    private AppiumDriver<MobileElement> driver;
    private WebDriverWait wait;

    public FavoritesPage(AppiumDriver<MobileElement> appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
        this.driver = appiumDriver;
        wait = AppiumDriverManager.getWait();
    }

    public MobileElement returnCandidate(String candidateName) {
        MobileElement candidate = driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"" + candidateName + "\")"));
        return candidate;
    }
}
