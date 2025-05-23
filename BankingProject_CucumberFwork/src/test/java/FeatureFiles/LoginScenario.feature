Feature: Validate Login Functionality of GrotechMinds Banking Application

  Scenario Outline: Validate Login functionality in GrotechMinds Banking Application
    Given user opens the url for banking application
    And user clicks on Login link in WebPage
    And user enters the username as "<Uname>"
    And user enters the userpwd as "<PassWord>"
    When user clicks on Login button
    Then validate that user is able to login into the website
    And also verify that the Title of the page is showing correct value
    
    Examples: 
      
      |Uname|PassWord |  
      | Ross | dav1234 |  