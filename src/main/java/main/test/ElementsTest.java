package main.test;

import main.pages.base.TestBase;
import org.testng.annotations.Test;

public class ElementsTest extends TestBase {
    @Test(groups = {"testGroup"})
    public void elementsTest() {
        pages.mainPage.openPage()
                .clickFormAuthenticationLink()
                .logIn("tomsmith","SuperSecretPassword!");
    }
}
