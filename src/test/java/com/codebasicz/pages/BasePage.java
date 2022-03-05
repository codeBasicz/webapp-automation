package com.codebasicz.pages;

import com.codebasicz.DriverManager;
import org.junit.jupiter.api.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriver driver;

    public BasePage(){
        driver = new DriverManager().getDriver();
        if(driver == null) {
            new DriverManager().initializeDriver();
        }
    }

    public void waitForVisibility(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void openURL(String url){
        driver.get(url);
    }

}
