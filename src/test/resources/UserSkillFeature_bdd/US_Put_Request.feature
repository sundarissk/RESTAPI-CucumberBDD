Feature: Validate and Test PUT Request in UserSkill Mapping API

Scenario: check whether can able to Update records Mapping   
     Given User select PUT Request with Valid JSON Data
     When User send PUT request
     Then It should display updated record details with status code

Scenario: check whether can able to Update records Mapping   
     Given User select PUT Request with Incorrect Endpoints
     When User send PUT request
     Then It should display error message Incorrect Endpoints with status code
     
Scenario: check whether can able to Update records Mapping   
     Given User select PUT Request with Incorrect JSON Data
     When User send PUT request
     Then It should display error message Incorrect JSON Data with status code

Scenario: check whether can able to Update records Mapping   
     Given User select PUT Request when server is down
     When User send PUT request
     Then It should display message Server Down with status Code
