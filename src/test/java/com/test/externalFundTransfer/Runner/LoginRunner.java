package com.test.externalFundTransfer.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features/"},
        glue = {"com.test.logincheck.loginwithapi.loginwithapi.StepDefination"},
        format = {"pretty", "json:target/cucumber-reports/CucumberTestReport.json"},
        plugin = ("json:target/cucumber-reports/CucumberTestReport.json"),
        monochrome = true,
        strict = true,
        dryRun = false)

public class LoginRunner {
}
