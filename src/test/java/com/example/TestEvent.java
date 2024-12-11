package com.example;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/bmo/features", glue = { "bmo.StepDefinitions" }, plugin = {
        "pretty",
        "html:target/reports/HTMLReport.html",
        "json:target/reports/JSONReport.json",
        "junit:target/reports/JUnitReport.xml"
})

public class TestEvent {
    
}
