package com.automationpractice.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.automationpractice.userinterfaces.ProductregisterUserinterfaces.BTN_CANT_CART;

public class TotalValidatePRoducts implements Question <Boolean>{
    private String quality;

    public TotalValidatePRoducts(String quality) {
        this.quality = quality;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if (quality.equalsIgnoreCase(BTN_CANT_CART.resolveFor(actor).getText()))
        return true;
        return false;
    }
    public static TotalValidatePRoducts theCantProducts (String quality){
        return new TotalValidatePRoducts(quality);
    }
}
