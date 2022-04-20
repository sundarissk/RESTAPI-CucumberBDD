Feature: Validate and Test GETID Request in UserSkill API

Scenario Outline: check able to GET particular records 
     Given User select GETID Request with username "<uname>" and password "<pword>"
     When User send GETID request in UserSkill 
     Then It should display paritcular detail with status code in UserSkill
     
     Examples:
     |uname|pword|
     |APIPROCESSING|2xx@Success|