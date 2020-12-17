package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import util.AppiumDriverManager;

public class Hooks {

    @Before
    public static void setUp() {
        AppiumDriverManager.getDriver();
    }

//    @After(order = 0)
//    public static void tearDown() {
//        AppiumDriverManager.closeDriver();
//    }
}
