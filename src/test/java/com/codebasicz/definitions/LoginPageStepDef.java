package com.codebasicz.definitions;

import com.codebasicz.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef {

    LoginPage loginPage = new LoginPage();

    @Given("User on Login Page")
    public void userOnLoginPage() {
        loginPage.openLoginPage();
    }

    @When("User enters email")
    public void userEntersEmail() throws InterruptedException {
        loginPage.enterUserEmail("codebasicz@gmail.com");
    }

    @And("User enters Password")
    public void userEntersPassword() throws InterruptedException {
        loginPage.enterUserPassword("Test@123");
    }

    @And("Clicks Login Button")
    public void clicksLoginButton() throws InterruptedException {
        loginPage.clickLoginButton();
    }

    @Then("User should land on home page")
    public void userShouldLandOnHomePage() throws InterruptedException {
        loginPage.checkHomePageIsOpened();
    }
}
