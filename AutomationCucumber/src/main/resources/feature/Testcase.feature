@Automation
Feature: Automation Website
  @TC01_Automation
  Scenario: #1
  register in the Automation demo website

    Given the user launch the chrome application
    When the user open the  Automation demo Home page
    Then the user register using  username and password
    Then click on the register button user nagivate to the next page
  
  
    
  @TC02_Automation
  Scenario: #2
  login in the Automation demo websitem

    Given user launch the chrome application
    When the user open the  Automation  Home page
    Then user login using username and password
    Then click on the login button user go to the next page
  
  
    
  @TC03_Automation
  Scenario: #3
  shop and add in the Automation website

    Given user launch the  application
    When the user open the  Automation page
    Then user click on the shop button
    Then click on the add to cart button
  
  
    
  @TC04_Automation
  Scenario: #4
  Testcase and shop menu in the Automation website

    Given user launch the application
    When the user open the Automation page
    Then user click on the Testcase button
    Then click on the shop menu user go to the next page
  
        
     @TC05_Automation
  Scenario: #5
  Filling details in Demosite
  
  Given user launches the chrome Application
  When user opens the AutomationPractice Homepage
  Then user clicks on the demosite and fill all necessary details
  Then Clicks on the refresh button
