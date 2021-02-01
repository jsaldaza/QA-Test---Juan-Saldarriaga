package com.automationpractice.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static com.automationpractice.userinterfaces.ProductregisterUserinterfaces.BTN_CANT_CART;
import static com.automationpractice.userinterfaces.ProductregisterUserinterfaces.BTN_CART;

public class TotalProductsTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MoveMouse.to(BTN_CART),
                Click.on(BTN_CANT_CART));
    }
    public static Performable inTotalproducts(int cantidad){return Tasks.instrumented(TotalProductsTask.class);
    }
}
