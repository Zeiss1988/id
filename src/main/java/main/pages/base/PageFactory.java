package main.pages.base;

import main.pages.elementsPages.LoginPage;
import main.pages.elementsPages.MainPage;
import main.pages.elementsPages.SecureAreaPage;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class PageFactory {
    public MainPage mainPage;
    public LoginPage loginPage;
    public SecureAreaPage secureAreaPage;
    private WebDriver driver;
    private Logger log;

    PageFactory(WebDriver driver, Logger log){
        mainPage = new MainPage(driver, log);
        loginPage = new LoginPage(driver, log);
        secureAreaPage = new SecureAreaPage(driver, log);
    }
}
