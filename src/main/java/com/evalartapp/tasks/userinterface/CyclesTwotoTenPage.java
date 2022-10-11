package com.evalartapp.tasks.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CyclesTwotoTenPage extends PageObject {

    public static final Target INPUT_TEXT_ONE = Target.the("where the text will be placed").located(By.xpath("//textarea[@name = 'text']"));
    public static final Target INPUT_COUNT_1 = Target.the("where the corresponding number will be placed").located(By.xpath("//input[@name = 'number']"));

    public static final Target INPUT_OPERATION_TWO = Target.the("where the corresponding number will be placed").located(By.xpath("//select[@name= 'select']"));


    public static final Target INPUT_TEXT_TWO = Target.the("where the text will be placed").located(By.xpath("//textarea[@name= 'text']"));
    public static final Target INPUT_COUNT_TWO = Target.the("where the corresponding number will be placed").located(By.xpath("//input[@name = 'number']"));

    public static final Target INPUT_TEXT_TRHEE = Target.the("where the text will be placed").located(By.xpath("//textarea[@name= 'text']"));
    public static final Target INPUT_OPERATION_BUTTON_ONE = Target.the("where the corresponding number will be placed").located(By.xpath("//input[@value= '-8516349']"));

    public static final Target INPUT_MULTIPLE_ONE = Target.the("where the corresponding number will be placed").located(By.xpath("//input[@value= '55']"));
    public static final Target INPUT_TEXT_FOUR= Target.the("where the text will be placed").located(By.xpath("//textarea[@name= 'text']"));

    public static final Target INPUT_DATE_TWO= Target.the("where the corresponding number will be placed").located(By.xpath("//input[@class = 'border-2 border-black rounded-sm p-2']"));
    public static final Target INPUT_OPERATION_TRHEE = Target.the("where the corresponding number will be placed").located(By.xpath("//select[@name= 'select']"));

    public static final Target INPUT_OPERATION_BUTTON_TWO = Target.the("where the corresponding number will be placed").located(By.xpath("//input[@value= '377740036']"));
    public static final Target INPUT_TEXT_FIVE = Target.the("where the text will be placed").located(By.xpath("//textarea[@name= 'text']"));

    public static final Target INPUT_MULTIPLE_TWO = Target.the("where the corresponding number will be placed").located(By.xpath("//input[@value= '55']"));
    public static final Target INPUT_MULTIPLE_TWO1 = Target.the("where the corresponding number will be placed").located(By.xpath("//input[@value= '95']"));
    public static final Target INPUT_MULTIPLE_TWO2 = Target.the("where the corresponding number will be placed").located(By.xpath("//input[@value= '155']"));
    public static final Target INPUT_MULTIPLE_TWO3 = Target.the("where the corresponding number will be placed").located(By.xpath( "//input[@value= '45']"));
    public static final Target INPUT_MULTIPLE_TWO4 = Target.the("where the corresponding number will be placed").located(By.xpath("//input[@value= '190']"));
    public static final Target INPUT_OPERATION_FOUR = Target.the("where the corresponding number will be placed").located(By.xpath("//select[@name= 'select']"));

    public static final Target INPUT_OPERATION_BUTTON_TRHEE= Target.the("where the corresponding number will be placed").located(By.xpath("//input[@value= '32629']"));
    public static final Target INPUT_MULTIPLE_TRHEE = Target.the("where the corresponding number will be placed").located(By.xpath("//input[@value= '136']"));
    public static final Target INPUT_MULTIPLE_TRHEE1 = Target.the("where the corresponding number will be placed").located(By.xpath("//input[@value= '152']"));

    public static final Target CLICK_SUBMIT= Target.the("where you click on the continue button").located(By.xpath("//button[@type= 'submit']"));
    public static final Target VERIFY_ASSERT = Target.the("where the hash is verified").located(By.xpath("//p[@class= 'text-white text-2xl text-center break-all']"));

}
