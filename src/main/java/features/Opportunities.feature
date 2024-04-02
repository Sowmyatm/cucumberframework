@demo
Feature: SFDC Opportunity tab
  I want to use this template for my feature file

  Background: 

  @test1
  Scenario: login with correct username and password
    Given User launches login.salesforce.com
    When user enters correct username and password
    Then home page should be seen

  @test2
  Scenario: user clicks on opportunity link
    When user clicks on opportunity link
    Then opportunity home page should be displayed

  #And click on Opportunity Pipeline link  under Reports
  Scenario: user clicks on opportunity link
    When user clicks on Opportunity Pipeline link  under Reports
    Then Opportunity Pipeline page should be displayed
