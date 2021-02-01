package com.automationpractice.tasks;

import com.automationpractice.interactions.ImplicitWait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Switch;

import static com.automationpractice.userinterfaces.ProductregisterUserinterfaces.*;

public class WomenTask implements Task {

    public static Performable theWomen(){return Tasks.instrumented(WomenTask.class);}


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Click.on(BTN_WOMEN),
                MoveMouse.to(BTN_WOMEN));


    }
}
