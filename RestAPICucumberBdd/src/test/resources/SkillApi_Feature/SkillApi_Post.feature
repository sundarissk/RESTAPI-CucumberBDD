Feature: Validate and Test POST Request in Skill API

Scenario Outline: check able to add new records
     Given User set body from sheetname "<SheetName>" and rownum <Rownum> 
     When User send POST request
     Then It should display created record with status code
    
   Examples:
   |SheetName|Rownum|
   |postskillapi|0|
   |postskillapi|1|
   