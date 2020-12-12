package pages;

import util.AppiumDriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SetupPage {

    private AppiumDriver<MobileElement> driver;
    private WebDriverWait wait;

    public SetupPage(AppiumDriver<MobileElement> appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
        this.driver = appiumDriver;
        wait = AppiumDriverManager.getWait();
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Próximo\")")
    public MobileElement nextButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Entendi\")")
    public MobileElement understandButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\")")
    public MobileElement readAndAcceptButton;

    public void completeSetup() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Button")));
        nextButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Button")));
        understandButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Button")));
        scrollToEnd();
        readAndAcceptButton.click();
    }

    public void scrollToEnd(){
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(10)"));
    }
}

