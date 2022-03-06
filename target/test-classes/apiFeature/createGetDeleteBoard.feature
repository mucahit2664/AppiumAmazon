Feature: Trello_testi
  Scenario: Create a board
    Given Send POST request for create "hayaller" board
    Then  Assert status code 200
    And Assert board name is "hayaller"

      Scenario: Get a board
    Given send a Get request "hayaller" board
    Then Assert get status code 200
    And Assert get board name is "hayaller"

        Scenario:delete a board
     Given send a delete request "hayaller"
     And assert deleting