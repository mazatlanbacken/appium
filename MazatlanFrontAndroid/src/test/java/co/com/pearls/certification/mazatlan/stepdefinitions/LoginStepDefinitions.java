package co.com.pearls.certification.mazatlan.stepdefinitions;

import co.com.pearls.certification.mazatlan.tasks.LoginMazatlan;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginStepDefinitions {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Andres");
    }



    @When("^The user selects a shirt$")
    public void theUserSelectsAShirt() {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginMazatlan.withUser());
    }

    @Then("^The user should see registration successful$")
    public void theUserShouldSeeRegistrationSuccessful() {

    }
}
