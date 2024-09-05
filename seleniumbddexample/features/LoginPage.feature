#Author: toby.email@doggieuniversity.edu
#Feature: This is the login feature of Facebook application
Feature: This is the login feature of Facebook application

  Scenario Outline: Verify error message when logged in with invalid credentials
    Given User opened the browser
    When User navigated to the Facebook login page
    And Enter email id as '<emailid>' and password as '<password>'
    And User clicked on the Login function

    Examples: 
      | emailid             | password    |
      | myemail@gmail.com   | Welcome123  |
      | youremail@gmail.com | Password123 |
