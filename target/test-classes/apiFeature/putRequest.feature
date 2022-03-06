Feature:
  Scenario: put new name
    Given put request new name as "umit"
    And assert status
    And assert new name "umit"
