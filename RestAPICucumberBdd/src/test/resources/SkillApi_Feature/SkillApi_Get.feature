Feature: Validate and Test GET Request in Skill API

Scenario: check able to GET all records 
     Given User select GET Request with Valid Authorization
     When User send GET request
     Then It should display details with status code