package com.cybertek.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
             "html:target/default-cucumber-reports",
              "json:target//json-reports/cucumber1.json"
        },
        features = {"src/test/resources/features"},
        glue = "com/cybertek/step_definitions"
        , dryRun = false
        , tags = "@studentTitle"
)
public class CukesRunner {
}
