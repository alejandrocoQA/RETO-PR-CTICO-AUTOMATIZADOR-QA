package com.evalartapp.tasks.tasks;

import com.evalartapp.tasks.userinterface.LoginEvalartApp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.evalartapp.tasks.userinterface.LoginEvalartApp.*;

public class Login implements Task {
    public static Login onThepage() {
        return Tasks.instrumented(Login.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("469287").into(INPUT_USER),
                Enter.theValue("10df2f32286b7120MS00LTc4Mjk2NA==30e0c83e6c29f1c3").into(INPUT_PASSWORD),
                Click.on(BTN_LOGIN)
        );

    }
}
