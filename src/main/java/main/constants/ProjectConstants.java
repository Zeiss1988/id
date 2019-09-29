package main.constants;

import java.io.File;

import static org.apache.commons.lang3.SystemUtils.USER_DIR;

public class ProjectConstants {

    public static final String RESOURCES_FOLDER = USER_DIR + File.separator + "src" + File.separator + "main" + File.separator + "resources";
    public static final String FILES_FOLDER = RESOURCES_FOLDER + File.separator + "files";
    public static final String MAIN_URL = "https://files.fm/";
    public static final String ELEMENTS_URL = "https://the-internet.herokuapp.com/";
}
