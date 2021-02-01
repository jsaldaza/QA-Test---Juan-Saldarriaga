package com.automationpractice.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.automationpractice.userinterfaces.ProductregisterUserinterfaces.BTN_CANT_CART;

public class ValidationTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CANT_CART)
        );
    }
    public static Performable theValidation(){return Tasks.instrumented(ValidationTask.class);}
}
