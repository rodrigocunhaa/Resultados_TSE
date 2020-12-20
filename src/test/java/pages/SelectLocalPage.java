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
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Button")));
        this.clickState(stateOption);
        confirmButton.click();
    }

    public void clickCity (String cityOption) {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"" + cityOption + "\")")).click();
    }

    public void selectCity (String cityOption) {
        citySelector.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Button")));
        this.clickCity(cityOption);
        confirmButton.click();
    }

    public void clickConfirmButton () {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Button")));
        confirmButton.click();
    }
}
