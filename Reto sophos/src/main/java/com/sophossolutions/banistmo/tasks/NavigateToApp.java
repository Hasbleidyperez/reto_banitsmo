package com.sophossolutions.banistmo.tasks;

import com.sophossolutions.banistmo.userinterfaces.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class NavigateToApp implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MainPage.PRODUCTS_OPTION),
                Click.on(MainPage.APP));
    }

    public static NavigateToApp banistmo(){
        return Tasks.instrumented(NavigateToApp.class);
    }
}
