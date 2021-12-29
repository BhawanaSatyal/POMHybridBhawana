Feature: Test Alert Functionalities
  @regression

  Scenario: As a user I want to be able to navigate between alert functionalities

    Given I am on homepage
    When I should see Vote button
    And I click on Vote
    Then I should get alert button on screen
     And I should be able to click on it
