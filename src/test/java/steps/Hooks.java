package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import util.AppiumDriverManager;

public class Hooks {

    @Before
    public static void setUp() {
        AppiumDriverManager.getDriver();
    }

    @After
    public static void tearDown() {
        AppiumDriverManager.closeDriver();
    }
}
