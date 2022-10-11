package com.evalartapp.tasks.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\cycles.feature",
        tags = "@stories",
        glue = "com.evalartapp.tasks.stepdefinitions",
        snippets = SnippetType.CAMELCASE )
public class CyclesRunner {
}
