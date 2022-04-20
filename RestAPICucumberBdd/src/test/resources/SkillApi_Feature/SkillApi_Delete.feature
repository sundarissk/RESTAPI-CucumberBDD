Feature: Validate and Test DELETE Request in Skill API

Scenario: check able to DELETE particular record 
     Given User select DELETE Request with Valid Authorization
     When User send DELETE request
     Then It should display dleted details with status code