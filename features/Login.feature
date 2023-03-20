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
@Login
Feature: Login feature

Background:     
Given User needs to be on login page

@positive
  Scenario: Positive login scenario
    When User Enter username and click on continue button
    And enter password 
    And click on signin button
    Then User it should navigate to the home page 
    
    @negative
  Scenario Outline: Negative login scenario
    When User Enter "<username>" and click on continue button
    And enter "<password>" 
    And click on signin button
    Then User it should throw validation error

Examples:

| username | password |
| anandsoni2641@gmail.com | Harbhaj |
| hssdaro@gmail.com | Harbhaj@268 |
