Feature: I should be able to connect to social media
  @regression

  Scenario: As a user I should be able to connect to social media pages when I click on individual social media icons

    Given I am on a homepage
    When I click on social media icon
    Then I should be navigated to social media on a new page