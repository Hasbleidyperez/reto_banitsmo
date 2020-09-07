package com.sophossolutions.banistmo.stepdefinitions;

import com.sophossolutions.banistmo.tasks.NavigateTo;
import com.sophossolutions.banistmo.tasks.NavigateToApp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ContractCreditCardsStepDefinitions {


    @Managed
    private WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that the user is on the banistmo page$")
    public void thatTheUserIsOnTheBanistmoPage() {

        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.banistmo.com/wps/portal/banistmo/personas/"));

    }

    @When("^he enters the option products and services, credit cards$")
    public void heEntersTheOptionProductsAndServicesCreditCards() {

        OnStage.theActorInTheSpotlight().attemptsTo(NavigateTo.creditCards());
    }

    @Then("^the generated PDF file must be validated\\.$")
    public void theGeneratedPDFFileMustBeValidated() {
    }

    @When("^the user enters the banistmo app option$")
    public void theUserEntersTheBanistmoAppOption() {

        OnStage.theActorInTheSpotlight().attemptsTo(NavigateToApp.banistmo());
    }

    @Then("^he should see the option to download it$")
    public void heShouldSeeTheOptionToDownloadIt() {

    }




}
