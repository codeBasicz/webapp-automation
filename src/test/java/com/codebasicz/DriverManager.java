package com.codebasicz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";

    public static WebDriver driver;

    public void initializeDriver() {
        String currentDirectory = System.getProperty("user.dir");
        System.setProperty(CHROME_DRIVER_PROPERTY, currentDirectory+"/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public WebDriver getDriver() {
        if(driver == null)
            initializeDriver();
        return driver;
    }

}
