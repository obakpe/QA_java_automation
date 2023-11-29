
Feature: OrangeHRM Login


    Scenario Outline: User logs in with valid credentials
      Given the user is on the login page
      When the user enter "<username>" and "<password>"
      And  clicks on login button
      Then the user should see "<expectedMessage>"


      Examples:
      |username   | password   |expectedMessage |
      |admin      | admin123    | Dashboard     |
      |Admin       | Admin123   | Invalid credentials |
