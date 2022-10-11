package com.evalartapp.tasks.questions;

import com.evalartapp.tasks.userinterface.CyclesTwotoTenPage;
import com.evalartapp.tasks.userinterface.LoginEvalartApp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CycleVerify implements Question<Boolean> {

    private String question_two;

    public CycleVerify(String question) {
        this.question_two = question;
    }

    public static CycleVerify toThe(String question) {
        return new CycleVerify(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String message = Text.of(CyclesTwotoTenPage.VERIFY_ASSERT).viewedBy(actor).asString();
        if(question_two.equals(message)){
            result = true;
        }else{
            result = false;
        }
        return result;

    }

}
