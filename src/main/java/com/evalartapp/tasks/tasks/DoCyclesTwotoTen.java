package com.evalartapp.tasks.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.evalartapp.tasks.userinterface.CyclesTwotoTenPage.*;
import static com.evalartapp.tasks.util.Ciclos.*;

public class DoCyclesTwotoTen implements Task {

    public static DoCyclesTwotoTen onthePage() {
        return Tasks.instrumented(DoCyclesTwotoTen.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(CicloLetras("j",88)).into(INPUT_TEXT_ONE),
                Enter.theValue("16").into(INPUT_COUNT_1),
                Click.on(CLICK_SUBMIT),
                SelectFromOptions.byValue("3343").from(INPUT_OPERATION_TWO),
                Click.on(CLICK_SUBMIT),
                Enter.theValue(CicloLetras("s",311)).into(INPUT_TEXT_TWO),
                Enter.theValue("11").into(INPUT_COUNT_TWO),
                Click.on(CLICK_SUBMIT),
                Enter.theValue(CicloLetras("U",175)).into(INPUT_TEXT_TRHEE),
                Click.on(INPUT_OPERATION_BUTTON_ONE),
                Click.on(CLICK_SUBMIT),
                Click.on(INPUT_MULTIPLE_ONE),
                Enter.theValue(CicloLetras("q",250)).into(INPUT_TEXT_FOUR),
                Click.on(CLICK_SUBMIT),
                Enter.theValue("15062022").into(INPUT_DATE_TWO),
                SelectFromOptions.byValue("668").from(INPUT_OPERATION_TRHEE),
                Click.on(CLICK_SUBMIT),
                Click.on(INPUT_OPERATION_BUTTON_TWO),
                Enter.theValue(CicloLetras("r",157)).into(INPUT_TEXT_FIVE),
                Click.on(CLICK_SUBMIT),
                Click.on(INPUT_MULTIPLE_TWO),
                Click.on(INPUT_MULTIPLE_TWO1),
                Click.on(INPUT_MULTIPLE_TWO2),
                Click.on(INPUT_MULTIPLE_TWO3),
                Click.on(INPUT_MULTIPLE_TWO4),
                SelectFromOptions.byValue("83844").from(INPUT_OPERATION_FOUR),
                Click.on(CLICK_SUBMIT),
                Click.on(INPUT_OPERATION_BUTTON_TRHEE),
                Click.on(INPUT_MULTIPLE_TRHEE),
                Click.on(INPUT_MULTIPLE_TRHEE1),
                Click.on(CLICK_SUBMIT)
                );

    }
}
