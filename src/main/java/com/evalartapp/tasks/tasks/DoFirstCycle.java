package com.evalartapp.tasks.tasks;

import com.evalartapp.tasks.userinterface.FirstCyclePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.evalartapp.tasks.userinterface.FirstCyclePage.*;

public class DoFirstCycle implements Task {


    public static DoFirstCycle onthePage() {
        return Tasks.instrumented(DoFirstCycle.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("24122022").into(INPUT_DATE_ONE),
                SelectFromOptions.byValue("39133").from(INPUT_OPERATION_1),
                Click.on(BTN_SUBMIT));
    }
}
