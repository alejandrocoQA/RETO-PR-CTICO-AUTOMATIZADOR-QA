package com.evalartapp.tasks.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FirstCyclePage extends PageObject {

    public static final Target INPUT_DATE_ONE = Target.the("where the desired date is entered").located(By.xpath("//input[@class = 'border-2 border-black rounded-sm p-2']"));
    public static final Target INPUT_OPERATION_1 = Target.the("where the first operation is performed").located(By.xpath("//select[@name= 'select']"));
    public static final Target BTN_SUBMIT = Target.the("Click to submit").located(By.xpath("//button[@type= 'submit']"));


}
