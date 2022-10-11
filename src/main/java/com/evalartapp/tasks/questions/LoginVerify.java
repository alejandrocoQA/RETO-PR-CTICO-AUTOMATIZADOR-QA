package com.evalartapp.tasks.questions;

import com.evalartapp.tasks.userinterface.LoginEvalartApp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LoginVerify implements Question<Boolean> {
    private String question;

    public LoginVerify(String question) {
        this.question = question;
    }

    public static LoginVerify toThe(String question) {
        return new LoginVerify(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String loginmessage = Text.of(LoginEvalartApp.TXT_FIRSTPAGE).viewedBy(actor).asString();
        if(question.equals(loginmessage)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
