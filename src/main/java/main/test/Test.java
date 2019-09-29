package main.test;

import main.constants.ProjectConstants;
import main.pages.base.TestBase;
import main.pages.UploadPage;

import static main.constants.ProjectConstants.MAIN_URL;


public class Test extends TestBase {

    @org.testng.annotations.Test(groups = {"testGroup"})
    public void fileUploadTest() {
        log.info("Open the page");
        driver.get(MAIN_URL);
        UploadPage act = new UploadPage(driver,log);
        log.info("Upload file");
        act.uploadFile(ProjectConstants.FILES_FOLDER + "/" + "Thicat.png", driver);
    }


}
