Feature: Checking the login functionality of fb page

  Scenario: giving valid input data                 //asList
    Given user passing the data at step level
      | cucumber |
      | selenium |
      | java     |
       Scenario: passing the datas                     //asLists
    Given user sending multiple datas at step level
      | java       | selenium |
      | phython    | testng   |
      | javascript | cucumber |
      

  Scenario: giving key and value pair input         //asMap
    Given user typing multiple inputs
      | username | java |
      | password |  123 |
 
  Scenario: giving map input data                     //asMaps
    Given user passing the input data
      | id | name     | email              | password | phone   |
      |  1 | java     | java@gmail.com     |     1224 | 1252424 |
      |  2 | testng   | testng@gmail.com   |     1235 | 2546324 |
      |  3 | cucumber | cucumber@gmail.com |     1653 |  142524 |
