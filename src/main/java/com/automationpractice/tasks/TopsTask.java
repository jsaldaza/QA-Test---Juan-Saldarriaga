package com.automationpractice.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.automationpractice.userinterfaces.ProductregisterUserinterfaces.BTN_TOP;

public class TopsTask implements Task {
    public static Performable theTops() {
        return Tasks.instrumented(TopsTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

       actor.attemptsTo(Click.on(BTN_TOP));
    }
}
