package com.sophossolutions.banistmo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/contract_credit_cards.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "com.sophossolutions.banistmo.stepdefinitions")
public class ContractCreditCards {
}
