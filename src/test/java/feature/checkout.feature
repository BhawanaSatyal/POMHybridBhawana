Feature: I should be able to use checkout functionality
  @regression

  Scenario: As I user I should be able to add desktop to cart and checkout successfully

    Given I am already logged in as registered user
    When I hover around Computers and click on Desktops
    And I add build your own computer to cart
    And I click required specifications
    Then I click on add to cart
    And I click on Shopping cart
    And I click on agree with terms of service
    And I click on checkout
    Then I update Billing Address
    And I click on continue
    And click on payment method
    And Click continue
    Then Fill up payment information
    Then order should be processed successfully










