package com.automationpractice.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static com.automationpractice.userinterfaces.ProductregisterUserinterfaces.BTN_EVENING_DRESSES;
import static com.automationpractice.userinterfaces.ProductregisterUserinterfaces.MOUSE_PRINTED_DRESS;

public class EveningDresses implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(BTN_EVENING_DRESSES),
                MoveMouse.to(MOUSE_PRINTED_DRESS)
        );
    }
    public static Performable inEveninDress(){return Tasks.instrumented(EveningDresses.class);
    }

}
