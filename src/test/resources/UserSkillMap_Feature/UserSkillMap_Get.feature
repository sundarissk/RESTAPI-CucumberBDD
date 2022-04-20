Feature: Validate and Test GET Request in UserSkill API

Scenario Outline: check able to GET all UserSkill records 
     Given User select GET Request with basic auth username "<uname>" and password "<pword>" in UserSkill
     When User send GET request in UserSkill
     Then It should display all details with status code in UserSkill
     
     Examples:
     |uname|pword|
     |APIPROCESSING|2xx@Success|