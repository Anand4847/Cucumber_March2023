#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Registration
Feature: Registration feature

@positive
  Scenario: Positive Registration scenario
    Given User needs to be on registration page
    When User enter details
    |username|Anand4847|
    |password|Harbhaj@26|
    |cpassword|Harbhaj@26|
    |mobno|9033785528|
    |company|capgemini|
    |location|Pune|
    
    And User clicks on submit button
    Then User details should be successfully submitted
    
    
  