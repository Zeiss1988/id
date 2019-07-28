package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadPage {

    private WebDriver driver;

    public UploadPage(WebDriver driver) {
        this.driver = driver;
    }
    public UploadPage uploadFile(String filepath, WebDriver driver){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"uploadifive-file_upload\"]/input[2]"));
        element.sendKeys(filepath);
        return this;
    }
}
