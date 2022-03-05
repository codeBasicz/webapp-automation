package com.codebasicz.definitions;

import com.codebasicz.DriverManager;
import com.codebasicz.pages.DashboardPage;
import io.cucumber.java.en.Given;

public class DashboardPageDef {

    DashboardPage dashboardPage = new DashboardPage();

    @Given("User on Dashboard Page")
    public void dashboardpage() {
        dashboardPage.openDashboardPage();
    }


}
