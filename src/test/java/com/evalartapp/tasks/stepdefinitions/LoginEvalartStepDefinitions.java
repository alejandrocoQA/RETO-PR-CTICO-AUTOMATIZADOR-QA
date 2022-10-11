package com.evalartapp.tasks.stepdefinitions;

import com.evalartapp.tasks.questions.CycleVerify;
import com.evalartapp.tasks.questions.LoginVerify;
import com.evalartapp.tasks.tasks.Login;
import com.evalartapp.tasks.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginEvalartStepDefinitions {

    @Before
    public void setStage(){ setTheStage(new OnlineCast()); }

    @Given("^am on the evalartapp page$")
    public void amOnTheEvalartappPage() {
        theActorCalled("CAMILO").wasAbleTo(OpenUp.thePage());

    }

    @When("^I start session with my credentials$")
    public void iStartSessionWithMyCredentials() {
        theActorInTheSpotlight().attemptsTo(Login.onThepage());

    }

    @Then("^I can see (.*)$")
    public void iCanSeeTheFirstCycle(String question)  {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(LoginVerify.toThe(question)));
        System.out.println(CycleVerify.toThe(question));

    }
}
