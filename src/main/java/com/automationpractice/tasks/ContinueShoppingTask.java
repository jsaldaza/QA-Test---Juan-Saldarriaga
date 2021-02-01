package com.automationpractice.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.automationpractice.userinterfaces.ProductregisterUserinterfaces.BTN_CONTINUE_SHOPPING;

public class ContinueShoppingTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_CONTINUE_SHOPPING));
    }

    public static Performable inContinueShopping() {
        return Tasks.instrumented(ContinueShoppingTask.class);
    }
}
