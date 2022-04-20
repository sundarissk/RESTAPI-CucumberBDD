Feature: Validate and Test DELETE Request in UserSkill

Scenario Outline: check able to DELETE particular record in UserSkill
     Given User select DELETE Request with username "<uname>" password "<pword>" 
     When User send DELETE request in UserSkill with usersid "<usid>"
     Then It should display dleted details with status code in UserSkill
     
     Examples:
     |uname|pword|usid|
     |APIPROCESSING|2xx@Success|US484|