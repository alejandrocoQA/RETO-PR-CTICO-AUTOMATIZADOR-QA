package com.evalartapp.tasks.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://tasks.evalartapp.com/automatization/")
public class LoginEvalartApp extends PageObject {

    public static final Target INPUT_USER = Target.the("where do we write the user").located(By.xpath("//input[@name = 'username']"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password").located(By.xpath("//input[@name = 'password']"));
    public static final Target BTN_LOGIN = Target.the("Click to log in").located(By.xpath("//button[@type= 'submit']"));
    public static final Target TXT_FIRSTPAGE = Target.the("See Se encuentra en el ciclo 1 de 10 ").located(By.xpath("//p[@class= 'text-xl text-center text-green-500']"));
}
