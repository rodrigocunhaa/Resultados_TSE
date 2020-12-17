Feature: Favorite a candidate

  Scenario: Complete initial setup
    Given I launch the App for the first time
    When I complete the setup
    Then I reach the home page

  Scenario: Search the results from a location
    Given I launch the screen to select a local
    When I select the "Amapá" state
    And I select the "Macapá" city
    Then I see "JOSIEL" candidate

  Scenario: I add a candidate to favorites
    Given I select "JOSIEL" candidate
    When I favorite the candidate
    Then "Josiel" is displayed on favorites tab