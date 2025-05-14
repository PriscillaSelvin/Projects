Feature: Validate Forget Password Functionality of GrotechMinds Banking Application

  Scenario Outline: Validate Forget Password functionality in GrotechMinds Banking Application
    Given user opens the url for banking application
    And user clicks on Forget Password link in WebPage
    And user enters the useremail as "<useremail>"
    And user enters the usermobileno as "<usermobileno>"
    When user clicks on ResetPassword button
    Then validate that user is able to submit the user details into the website
    And also verify that the Title of the page is showing correct value

    Examples: 
      | useremail            | usermobileno |
      | Rossmolnar@gmail.com |   4167854321 |
