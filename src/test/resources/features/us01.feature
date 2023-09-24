@regression
Feature: As a user i create a user

@ui
Scenario:
  Given Im on login page and I click on SignUp button
    When i pass random firstName,LastName,Email,password in textFields and hit submit
    Then i should see logout button








