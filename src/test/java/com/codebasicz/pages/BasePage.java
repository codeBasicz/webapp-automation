package com.codebasicz.pages;

import com.codebasicz.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    public void openURL(String url) {
        driver.get(url);
    }

    public WebElement getElement(By by) {
        WebElement element = driver.findElement(by);
        highlightCurrentElement(element);
        return element;
    }

    public void addInput(WebElement element, String data) {
        element.sendKeys(data);
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public String getCurrentPageURL() {
        return driver.getCurrentUrl();
    }

    private void highlightCurrentElement(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].style.border='3px solid red'", element);
    }
}
