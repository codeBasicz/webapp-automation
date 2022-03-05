package com.codebasicz.runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "com.codebasicz.definitions"
)
public class TestRunner extends RunnerBase {
}
