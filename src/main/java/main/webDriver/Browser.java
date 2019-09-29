package main.webDriver;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
    private ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
    private String browser;
    private Logger log;

    public Browser(String browser, Logger log) {
        this.browser = browser.toLowerCase();
        this.log = log;
    }

    public WebDriver createDriver() {
        log.info("Create driver: " + browser);

        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\inna.sherstniova\\Desktop\\chromedriver.exe");
                driver.set(new ChromeDriver());
                driver.get().manage().window().maximize();
                break;

            case "firefox":
                System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
                driver.set(new FirefoxDriver());
                driver.get().manage().window().maximize();
                break;

            default:
                log.info("Do not know how to start: " + browser + ", starting chrome.");
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\inna.sherstniova\\Desktop\\chromedriver.exe");
                driver.set(new ChromeDriver());
                driver.get().manage().window().maximize();
                break;
        }

        return driver.get();
    }
}
