package com.evalartapp.tasks.stepdefinitions;


import com.evalartapp.tasks.questions.CycleVerify;
import com.evalartapp.tasks.tasks.DoFirstCycle;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;


import static com.evalartapp.tasks.tasks.DoCyclesTwotoTen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;


public class CyclesStepDefinitions {


    @Given("^I start the first cycle$")
    public void iStartTheFirstCycle(){
        theActorCalled("CAMILO").wasAbleTo(DoFirstCycle.onthePage());
    }

    @When("^I continue until the end of the cycles$")
    public void iContinueUntilTheEndOfTheCycles(){
        theActorInTheSpotlight().attemptsTo(onthePage());

    }

    @Then("^Valid success hash (.*)$")
    public void validSuccessHash(String question){
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(CycleVerify.toThe(question)));
    }

}
