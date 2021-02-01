package com.automationpractice.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.automationpractice.userinterfaces.ProductregisterUserinterfaces.BTN_BLOUSES;

public class BlousesTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_BLOUSES));
    }

    public static Performable theBlouses() {
        return Tasks.instrumented(BlousesTask.class);
    }

}
