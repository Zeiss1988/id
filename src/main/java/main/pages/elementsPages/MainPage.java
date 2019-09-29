package main.pages.elementsPages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static main.constants.ProjectConstants.ELEMENTS_URL;

public class MainPage {
    private WebDriver driver;
    private Logger log;

    private By formAuthenticationLinkLocator = By.linkText("Form Authentication");

    public MainPage(WebDriver driver, Logger log) {
        this.driver = driver;
        this.log = log;
    }

    /** Open MainPage with it's url */
    public MainPage openPage() {
        log.info("Opening page: " + ELEMENTS_URL);
        driver.get(ELEMENTS_URL);
        log.info("Page opened!");
        return this;
    }

    /** Open LoginPage by clicking on Form Authentication Link */
    public LoginPage clickFormAuthenticationLink() {
        log.info("Clicking Form Authentication link on Welcome Page");
        driver.findElement(formAuthenticationLinkLocator).click();
        return new LoginPage(driver, log);
    }
}
