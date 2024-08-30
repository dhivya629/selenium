Feature: Checking the functionality of OrangeHRM page

Background:
 Given user launches the  Orangehrm url
@sanity
  Scenario: login with valid crendentials
   
    When user entering the username
    And user entering the password
    And user clicks on the login button
    Then user logged in successfully
@sanity @smoke
  Scenario: login with valid crendenials
   
    When user entering the username "Admin"
    And user entering the password "admin123"
    And user clicks on the login button
    Then user logged in successfully
@regression @sanity
  Scenario Outline: login with muliple data crendenials
   
    When user entering the username "<username>"
    And user entering the password "<password>"
    And user clicks on the login button
    Then user logged in successfully

    Examples: 
      | username | password |
      | java     |      123 |
      | selenium |      345 |
      | cucumber |     5345 |
