package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\").textContains(\"Favoritar\")")
    public MobileElement favoriteButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Fechar\")")
    public MobileElement closeButton;

    public void clickFavorButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Button")));
        favoriteButton.click();
    }

    public void closePage() {
        closeButton.click();
    }
}
