Feature: Checking the login functionality of facebook
Scenario: login with valid crendentials
Given user launches the fb url
When user enter the email
When user enter the password
When user clicks on login button
Then user logged in successfully
