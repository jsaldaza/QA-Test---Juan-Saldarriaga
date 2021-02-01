package com.automationpractice.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static com.automationpractice.userinterfaces.ProductregisterUserinterfaces.*;

public class PrintedDressTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_QUICK_VIEW));
    }
    public static Performable thePrintedDress(){return Tasks.instrumented(PrintedDressTask.class);
    }
}
