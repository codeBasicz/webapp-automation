package com.codebasicz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage extends BasePage {

    public void openLoginPage() {
        openURL("https://automation-playground-bbc1e.firebaseapp.com/login-page");
    }

    public void enterUserEmail(String email) throws InterruptedException {
        Thread.sleep(1000);
        WebElement emailInput = getElement(By.id("emailInput"));
        waitForVisibility(emailInput);
        addInput(emailInput, email);
    }

    public void enterUserPassword(String password) throws InterruptedException {
        Thread.sleep(1000);
        WebElement passwordInput = getElement(By.id("passwordInput"));
        waitForVisibility(passwordInput);
        addInput(passwordInput, password);
    }

    public void clickLoginButton() throws InterruptedException {
        Thread.sleep(1000);
        WebElement loginButton = getElement(By.id("loginButton"));
        waitForVisibility(loginButton);
        clickElement(loginButton);
    }

    public void checkHomePageIsOpened() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(getCurrentPageURL(), "https://automation-playground-bbc1e.firebaseapp.com/home");
    }

}
