Feature: Login Page

  @execute
  Scenario: User will try to login with invalid set of information
    Given User is on the login page
    When User clicks on 'Submit' without entering 'UserName'
    Then 'All fields are madatory' message should display

  Scenario: User has given all the required fields
    Given User is on the login page
    And User has given all the required fields
    When User clicks 'Submit'
    Then 'successfully submitted!!' message should display

  Scenario: User has clicked on Reset
    Given User is on the login page
    When User clicks 'Reset'
    Then 'fields cleared' message should display
