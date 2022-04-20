Feature: Validate and Test PUT Request in UserSkill API

Scenario Outline:: check able to update particular record in UserSkill
     Given User select PUT Request with username "<uname>" password "<pword>" mep <mp> userid "<uid>" skillid <sid>
     When User send PUT request with userskillid "<usid>" 
     Then It should display updated details with status code in UserSkill
     
     Examples:
     |uname|pword|usid|mp|uid|sid|
     |APIPROCESSING|2xx@Success|US488|6|U02|1|