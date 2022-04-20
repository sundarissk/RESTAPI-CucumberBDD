Feature: Validate and Test PUT Request in Skill API

Scenario Outline:: check able to update particular record 
     Given User select PUT Request with Skill "<Skill>" 
     When User send PUT request with <id>
     Then It should display updated details with status code
     
     Examples:
     |id|Skill|
     |202|smart1234|
     |211|good1234| 
     
     