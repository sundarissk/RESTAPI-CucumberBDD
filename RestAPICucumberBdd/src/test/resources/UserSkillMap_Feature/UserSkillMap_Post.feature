Feature: Validate and Test POST Request in UserSkill API

Scenario Outline: check able to Create New records in UserSkill
     Given User select POST Request with username "<uname>" password "<pword>" moe <exp> skillid <sid> userid "<uid>"  
     When User send POST request in Userskill
     Then It should display created detail with status code in UserSkill
     
     Examples:
     |uname|pword|exp|sid|uid|
     |APIPROCESSING|2xx@Success| 25|3|U02|
     
     