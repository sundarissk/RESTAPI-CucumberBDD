Feature: Validate and Test GET Request in UserSkill Mapping API

Scenario: check whether can able to GET all the records 
     Given User select GET Request without Authorization
     When User send GET request
     Then It should display an error message with status code
     
Scenario: check whether can able to GET all the records  
     Given User select GET Request with Valid Authorization and valid endpoints
     When User send GET request
     Then It should display details with status code
     
Scenario: check whether can able to GET all the records 
     Given User select GET Request with Valid Authorization and Invalid endpoints
     When User send GET request
     Then It should display error message with status code
     
Scenario: check whether can able to GET all the records 
     Given User select GET Request with Valid Authorization with Invalid credential and valid endpoints
     When User send GET request
     Then It should display error message with status code
     
Scenario: check whether can able to GET records with existing UserID  
     Given User select GET Request with Valid Authorization
     When User send GET request
     Then It should display details with status code
     
Scenario: check whether can able to GET records with Nonexisting UserID  
     Given User select GET Request with Valid Authorization
     When User send GET request
     Then It should display error message with status code
     
Scenario: check whether can able to GET records without knowing Server is down  
     Given User select GET Request with Valid Authorization Server Down
     When User send GET request
     Then It should display error message with status code
     
     