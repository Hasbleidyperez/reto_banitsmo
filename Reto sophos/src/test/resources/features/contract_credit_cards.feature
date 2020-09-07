Feature: I as a user of the system,
  I need to validate the credit card contract to access one of them

  Background: banistmo page
    Given that the user is on the banistmo page

    @CreditCard
    Scenario: contract credit card
      When he enters the option products and services, credit cards
      Then the generated PDF file must be validated.

      @App
      Scenario: banistmo app
        When the user enters the banistmo app option
        Then he should see the option to download it

