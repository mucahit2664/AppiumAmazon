Feature: create card
  Scenario: create card
    Given Post request for create a card "akf" with POJO
    And get response with POJO
    And Assert response "akf"
