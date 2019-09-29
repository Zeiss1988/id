package main.pages;

import main.webDriver.Page;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadPage extends Page {

    private WebDriver driver;
    private Logger log;
    private By uploadBtn = By.id("uploadifive-file_upload");
    private By upload = By.xpath("//*[@id='uploadifive-file_upload']/input[2]");

    public UploadPage(WebDriver driver,Logger log) {
        this.driver = driver;
        this.log = log;
    }
    public UploadPage uploadFile(String filepath, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(uploadBtn));
        WebElement element = driver.findElement(upload);
        element.sendKeys(filepath);
        return this;
    }
}
