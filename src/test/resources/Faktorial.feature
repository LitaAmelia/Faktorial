@All
  Feature: Factorial

    @Factorial @Positive
      Scenario: Count of Factorial
      Given User access website
      When User fill number
      And User clik count button
      Then Result displayed