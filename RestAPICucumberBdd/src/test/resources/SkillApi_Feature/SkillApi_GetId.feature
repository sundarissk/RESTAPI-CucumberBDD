Feature: Validate and Test GETID Request in Skill API

Scenario: check able to GET particular records 
     Given User select GETID Request with Valid Authorization
     When User send GETID request
     Then It should display paritcular detail with status code