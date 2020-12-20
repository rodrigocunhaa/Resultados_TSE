Feature: Favorite a candidate

  Scenario: Complete initial setup
    Given I launch the App for the first time
    When I complete the setup
    Then I reach the home page

  Scenario: View candidate from a location
    Given I launch the screen to select a local
    When I select the "Amapá" state
    And I select the "Macapá" city
    And I click to confirm
    Then I see "JOSIEL" candidate

  Scenario: Add a candidate to favorites
    Given I select "JOSIEL" candidate
    When I favorite the candidate
    And I close the candidate page
    And I go to favorites page
    Then I see "Josiel" displayed on favorites page