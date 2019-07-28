import constants.ProjectConstants;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.UploadPage;

import java.util.concurrent.TimeUnit;

public class Test {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\inna.sherstniova\\Desktop\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://files.fm/");

    }


    @org.junit.Test
    public void fileUploadTest() {

        UploadPage act = new UploadPage(driver);
        act.uploadFile(ProjectConstants.FILES_FOLDER + "/" + "Thicat.png", driver);
    }

    @After
    public void tearDown() throws Exception {
        // Close the browser
        driver.close();
    }
}
