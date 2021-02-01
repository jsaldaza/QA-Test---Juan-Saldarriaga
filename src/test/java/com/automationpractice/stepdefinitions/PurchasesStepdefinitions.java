package com.automationpractice.stepdefinitions;

import com.automationpractice.interactions.OpenBrowser;
import com.automationpractice.questions.TotalValidatePRoducts;
import com.automationpractice.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PurchasesStepdefinitions {
    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("(.*) is on Homepage")
    public void theUserIsOnHomepage(String actor) {
        theActorCalled(actor).attemptsTo(OpenBrowser.ofAutomationPractice());
    }

    @Then("the user clicks Women")
    public void theUserClicksWomen() {
        theActorInTheSpotlight().attemptsTo(WomenTask.theWomen());
    }

    @Then("user clicks Tops")
    public void userClicksTops() {
        theActorInTheSpotlight().attemptsTo(TopsTask.theTops());
    }

    @Then("User Clicks blouses")
    public void userClicksBlouses() {
        theActorInTheSpotlight().attemptsTo(BlousesTask.theBlouses());
    }

    @Then("user clicks on add to cart")
    public void userClicksOnAddToCart() {
        theActorInTheSpotlight().attemptsTo(AddToCartTask.inAddCart());
    }

    @Given("the user clicks on continue shopping")
    public void theUserClicksOnContinueShopping() {
        theActorInTheSpotlight().attemptsTo(ContinueShoppingTask.inContinueShopping());
    }

    @Then("the user is returned to the homepage")
    public void theUserIsReturnedToTheHomepage() {
        theActorInTheSpotlight().attemptsTo(HomePageTask.inHomePage());
    }

    @Then("user clicks Dresses")
    public void userClicksDresses() {
        theActorInTheSpotlight().attemptsTo(DressesTask.thedresses());
    }

    @Then("User Clicks evening dresses")
    public void userClicksEveningDresses() {
        theActorInTheSpotlight().attemptsTo(EveningDresses.inEveninDress());
    }

    @Then("user clicks on \\(Quick View) printed dress")
    public void userClicksOnQuickViewPrintedDress() {
        theActorInTheSpotlight().attemptsTo(PrintedDressTask.thePrintedDress());
    }

    @Then("user clicks on add to cart from Pop up")
    public void userClicksOnAddToCartFromPopUp() {
        theActorInTheSpotlight().attemptsTo(AddtoCartPopupTask.inPopUp());
    }

    @Then("the user clicks Cart")
    public void theUserClicksCart() {
        theActorInTheSpotlight().attemptsTo(CartTask.theCart());
    }

    @Then("user verifies the total products")
            public void userVerifiesTheTotalProducts() {
        //theActorInTheSpotlight().should(seeThat(TotalValidatePRoducts.theCantProducts(Integer.toString(cantidad))));
       // theActorInTheSpotlight().should(GivenWhenThen.seeThat(TotalValidatePRoducts.theCantProducts(cantidad)));
        theActorInTheSpotlight().attemptsTo(ValidationTask.theValidation());

    }

    @Then("User Clicks checkout")
    public void userClicksCheckout() {
        theActorInTheSpotlight().attemptsTo(CheckoutTask.inCheckout());
    }

    @Then("user is taken to the Authentication screen")
    public void userIsTakenToTheAuthenticationScreen() {
        theActorInTheSpotlight().attemptsTo(Authentication.inAuthentication());
    }

}

