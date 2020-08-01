package com.test.externalFundTransfer.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features/"},
        glue = {"com.test.logincheck.loginwithapi.loginwithapi.StepDefination"},
        format = {"pretty", "html:test-output", "json:json_output/cucumber.json"},
        monochrome = true,
        strict = true,
        dryRun = false)
public class LoginRunner {
}
