@tag
Feature: Conference Registration

  @tag1
  Scenario: Personal Details
    Given User wants to fill personal details for conference
    When User select 'Next' link without entering firstname
    Then 'Please enter First name' message should display
    When User select 'Next' link without entering lastname
    Then 'Please enter Last name' message should display
    When User select 'Next' link without entering email
    Then 'Please enter email' message should display
    When User select 'Next' link without entering valid email
    Then 'Please enter valid email' message should display
    When User select 'Next' link without entering contactno
    Then 'Please enter contactno' message should display
    When User select 'Next' link without entering no_of_people
    Then 'Please enter no_of_people' message should display
    When User select 'Next' link without entering building_name
    Then 'Please enter building name and room number' message should display
    When User select 'Next' link without entering area_name
    Then 'Please enter area name' message should display
    When User select 'Next' link without entering city
    Then 'Please enter city' message should display
    When User select 'Next' link without entering state
    Then 'Please enter state' message should display
    When User select 'Next' link without entering cust_access
    Then 'Please enter customer access' message should display

  @tag2
  Scenario: all data entered successfully
    Given User enters all the valid data in the conference registration form
    When User select 'Next' link after entering valid set of information
    Then 'User Validated' message is displayed
