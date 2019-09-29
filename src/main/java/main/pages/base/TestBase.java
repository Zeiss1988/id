package main.pages.base;

import main.webDriver.Browser;
import main.webDriver.Page;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

public class TestBase extends Page {

    protected WebDriver driver;
    protected Logger log;
    public PageFactory pages;

    @BeforeMethod(alwaysRun = true)
    public void setUp(@Optional("chrome")String browserName, ITestContext ctx) {
        String testName = ctx.getCurrentXmlTest().getName();
        log = LogManager.getLogger(testName);
        Browser browser = new Browser(browserName, log);
        driver = browser.createDriver();
        pages = new PageFactory(driver, log);
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}
