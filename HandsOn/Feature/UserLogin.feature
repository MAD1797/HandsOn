@ForJenkins
Feature: Login Action
  Test Login Functionality

 
  Scenario Outline: Successful login with valid credentials
    Given navigate to home page
    When user enters "<username>" and "<password>"
    Then Message login successfully
     
    Examples:
      | username  | password |
      | Lalitha |     Password123 |
      | Rick |     Rick123 |
      | Andrew | Andrew123 |
    
