package com.Xfleet.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "rerun:target/rerun.txt",
        },
        features = "src/test/resources/features",
        glue = "com/Xfleet/step_definitions",
        dryRun = false,
        tags="@FLTAP-1123"
)
public class CukesRunner {





}
