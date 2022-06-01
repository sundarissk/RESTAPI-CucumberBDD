Feature: Validate and Test POST Request in UserSkill Mapping API

Scenario: check whether can able to create records Mapping   
     Given User select POST Request with Valid JASON
     When User send POST request
     Then It should display created record with status Code
     
Scenario: check whether can able to create records Mapping   
     Given User select POST Request with Valid JASON and incorrect Endpoints
     When User send POST request
     Then It should display error message incorrect endpoint with status Code
     
Scenario: check whether can able to create records Mapping   
     Given User select POST Request with Valid JASON and incorrect data
     When User send POST request
     Then It should display display error message incorrect data with status Code
     
Scenario: check whether can able to create records Mapping   
     Given User select POST Request when server is down
     When User send POST request
     Then It should display display message Server Down with status Code