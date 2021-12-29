Feature: I should be able to use new online functionality
  @regression

  Scenario: As a registered user I should be able to use new online and leave comment

    Given I am registered user
    When I click on details under new online
    And I fill up details on leave your comment
    And click on new comment
    Then News comment message should be added successfully
    And comment must be displayed in ascending order

