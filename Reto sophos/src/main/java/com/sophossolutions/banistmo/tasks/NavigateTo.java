package com.sophossolutions.banistmo.tasks;

import com.sophossolutions.banistmo.userinterfaces.CreditCardsPage;
import com.sophossolutions.banistmo.userinterfaces.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class NavigateTo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MainPage.PRODUCTS_OPTION),
                Click.on(MainPage.CREDIT_CARDS_OPTION),
                Click.on(CreditCardsPage.DOWNLOAD)
                );
    }

    public static NavigateTo creditCards(){
        return Tasks.instrumented(NavigateTo.class);
    }
}
