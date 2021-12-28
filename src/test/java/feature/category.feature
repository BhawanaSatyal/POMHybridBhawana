@regression
Feature: Navigate to category page


  Scenario Outline: As a user, I should be able to correct category, pages when I click on menu category button

    Given I am on homepage
    When I click on "<category>" button
    And  I should be able to verify the URL "<page_URL>" accordingly
    Then I should be able to verify the  title "<page_title>" accordingly


    Examples:
      | category          | page_URL                                       | page_title        |
      | Computers         | https://demo.nopcommerce.com/computers         | Computers         |
      | Electronics       | https://demo.nopcommerce.com/electronics       | Electronics       |
      | Apparel           | https://demo.nopcommerce.com/apparel           | Apparel           |
      | Digital downloads | https://demo.nopcommerce.com/digital-downloads | Digital downloads |
      | Books             | https://demo.nopcommerce.com/books             | Books             |
      | Jewelry           | https://demo.nopcommerce.com/jewelry           | Jewelry           |
      | Gift Cards        | https://demo.nopcommerce.com/gift-cards        | Gift Cards        |


  Scenario Outline: As a user, I should be able navigate to subcategory pages with hover action
    Given I am on homepage
    When I hover on "<category>" button
    And I click on "<subcategory>" button
    Then I should be able to verify the  title "<page_title>" accordingly
    Examples:
      | category          | subcategory    | page_title     |
      | Computers         | Desktops       | Desktops       |
      | Computers         | Notebooks      | Notebooks      |
      | Computers         | Software       | Software       |
      | Electronics       | Camera & photo | Camera & photo |
      | Electronics       | Cell phones    | Cell phones    |
      | Electronics       | Others         | Others         |
      | Apparel           | Shoes          | Shoes          |
      | Apparel           | Clothing       | Clothing       |
      | Apparel           | Accessories    | Accessories    |


  Scenario Outline: As a user, I should be able navigate to subcategory pages with hover action
    When I hover on "<category>" button
    And I click on "<category>" button
    Examples:
      | category          | category          |
      | Digital downloads | Digital downloads |
      | Books             | Books             |
      | Jewelry           | Jewelry           |
      | Gift Cards        | Gift Cards        |
