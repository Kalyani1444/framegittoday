Feature: Verify Instagram login page

Background: 
Given User is on Instagram login page

Scenario Outline: verify login with valid credentials
When User enters "<userName>" and "<password>" and click on login Button
Then User verify login success message 

Examples: 
|userName|password|
|7418851444|Instagram@123|

Scenario Outline: verify login with invalid credentials
When User enters "<userName>" and "<password>" and click on login Button
Then User verify login error message

Examples:

|userName|password|
|7418851444|Password@123|

Scenario: 
When User enters userName and password and press enter key
|userName|password|
|7418851444|Instagram@123|
Then User verify login success message