Feature: Validate and Test DELETE Request in UserSkill Mapping API

Scenario: check whether can able to DELETE records   
     Given User select DELETE Request with Exisitng ID
     When User send DELETE request
     Then It should display No Content with status Code
     
Scenario: check whether can able to DELETE records  
     Given User select DELETE Request with Non Exsiitng ID
     When User send DELETE request
     Then It should display error message Record Not Found with status Code
     
Scenario: check whether can able to DELETE records   
     Given User select DELETE Request with Invalid Endpoints
     When User send DELETE request
     Then It should display error message incorrect Endpints with status Code
     
Scenario: check whether can able to DELETE records  
     Given User select DELETE Request when server is down
     When User send DELETE request
     Then It should display display message Server Down with status Code